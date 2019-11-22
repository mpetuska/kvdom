import org.jetbrains.kotlin.gradle.plugin.getKotlinPluginVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeLink

plugins {
    kotlin("multiplatform") version "1.3.60"
    idea
}

group = "lt.petuska"

version = null ?: file("$projectDir/..//build.gradle.kts").readLines().find {
    it.matches(Regex("\\s*version\\s*=\\s*\"\\d+\\.\\d+\\.\\d+(-SNAPSHOT)?\""))
}!!.replace(Regex("^\\s*version\\s*=\\s*\""), "").replace(Regex("\"\\s*$"), "")

repositories {
    jcenter()
    mavenCentral()
    mavenLocal()
}

idea {
    module {
        isDownloadSources = true
        isDownloadJavadoc = true
    }
}

val webDir = file("$projectDir/src/jsMain/web")
kotlin {
    wasm32 {
        binaries {
            executable {
                entryPoint = "lt.petuska.kvdom.sample.main"
            }
        }
    }
    js {
        compilations.all {
            kotlinOptions {
                moduleKind = "umd"
                sourceMap = true
                metaInfo = true
                sourceMapEmbedSources = "always"
            }
        }
        val jsProcessResources by tasks.getting(Copy::class)
        browser {
            runTask {
                dependsOn(jsProcessResources)
                devServer = devServer?.copy(
                    port = 3000,
                    proxy = mapOf(
                        "/api" to "http://localhost:8080"
                    )
                )
            }
            webpackTask {
                destinationDirectory = file("$buildDir/bundle/js")
                doLast {
                    copy {
                        from(webDir) {
                            filesMatching("index.html") {
                                expand(project.properties)
                            }
                        }
                        into(destinationDirectory!!)
                    }
                }
            }
        }

        sourceSets {
            val commonMain by getting {
                dependencies {
                    api("lt.petuska:kvdom-core:${project.version}")
                }
            }
            val wasm32Main by getting {
                dependencies {
                    implementation(fileTree("$buildDir/klib") {
                        include("*.klib")
                    })
                }
            }
            val jsMain by getting {
                resources.srcDir(webDir)
            }
        }
    }
}

tasks {
    val wrapper by getting(Wrapper::class) {
        gradleVersion = "6.0.1"
    }
    val jsProcessResources by getting(Copy::class) {
        from("$webDir/index.html") {
            expand(project.properties)
        }
    }
    val wasm32ProcessResources by getting(Copy::class)
    val linkReleaseExecutableWasm32 by getting(KotlinNativeLink::class)
    val wasmBundle by creating(Copy::class) {
        group = "build"
        dependsOn(wasm32ProcessResources, linkReleaseExecutableWasm32)
        from(linkReleaseExecutableWasm32.destinationDir)
        from(wasm32ProcessResources.destinationDir)
        destinationDir = file("$buildDir/bundle/wasm")
    }
    val assemble by getting {
        dependsOn(wasmBundle)
    }

    val wasmJsInterop by creating(Exec::class) {
        workingDir = projectDir

        val isWindows = System.getProperty("os.name").startsWith("Windows")
        val packageName = "kotlinx.interop.wasm.dom"
        val jsinteropKlibFile = "$buildDir/klib/$packageName.klib"
        val ext = if (isWindows) ".bat" else ""
        val konanDataDir =
            "${System.getProperty("user.home")}/.konan/kotlin-native-${if (isWindows) "windows" else "linux"}-${getKotlinPluginVersion()}"

        if (file(konanDataDir).exists()) {
            val jsinteropCommand = file(konanDataDir).resolve("bin").resolve("jsinterop$ext")

            inputs.property("jsinteropCommand", jsinteropCommand)
            inputs.property("jsinteropPackageName", packageName)
            outputs.file(jsinteropKlibFile)

            commandLine(
                jsinteropCommand,
                "-pkg", packageName,
                "-o", jsinteropKlibFile,
                "-target", "wasm32"
            )
        } else {
            doFirst {
                println(konanDataDir)
                // Abort build execution if the distribution path isn't specified.
                throw GradleException(
                    """
                    |
                    |Kotlin/Native distribution path must be specified to build the JavaScript interop.
                    |Use 'kotlin.native.home' project property to specify it.
                """.trimMargin()
                )
            }
        }
    }
    withType<KotlinNativeCompile> {
        dependsOn(wasmJsInterop)
    }
}