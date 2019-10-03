import org.jetbrains.kotlin.gradle.tasks.AbstractKotlinNativeCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeLink

plugins {
    kotlin("multiplatform") version "1.3.50"
}

group = "lt.petuska"
version = "1.0.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
    mavenLocal()
}

val webDir = file("$projectDir/src/jsMain/web")
kotlin {
    metadata {
        sourceSets {
            val commonMain by getting {
                dependencies {
                    implementation(kotlin("stdlib-common"))
                    implementation("lt.petuska:kvdom:1.0.0-SNAPSHOT")
                }
            }
        }
    }
    wasm32("wasm") {
        binaries {
            executable {
                entryPoint = "lt.petuska.kvdom.sample.main"
            }
        }
        sourceSets {
            val wasmMain by getting {
                dependencies {
                    implementation(fileTree("$projectDir/klib") {
                        include("*.klib")
                    })
                }
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
            val jsMain by getting {
                resources.srcDir(webDir)
                dependencies {
                    implementation(kotlin("stdlib-js"))
                }
            }
        }
    }
}

tasks {
    val wrapper by getting(Wrapper::class) {
        gradleVersion = "5.6.2"
    }
    val jsProcessResources by getting(Copy::class) {
        from("$webDir/index.html") {
            expand(project.properties)
        }
    }
    val wasmProcessResources by getting(Copy::class)
    val linkReleaseExecutableWasm by getting(KotlinNativeLink::class)
    val wasmBundle by creating(Copy::class) {
        group = "build"
        dependsOn(wasmProcessResources, linkReleaseExecutableWasm)
        from(linkReleaseExecutableWasm.destinationDir)
        from(wasmProcessResources.destinationDir)
        destinationDir = file("$buildDir/bundle/wasm")
    }
    val assemble by getting {
        dependsOn(wasmBundle)
    }

    val wasmJsInterop by creating(Exec::class) {
        workingDir = projectDir

        val isWindows = System.getProperty("os.name").startsWith("Windows")
        val packageName = "kotlinx.interop.wasm.dom"
        val jsinteropKlibFile = "$projectDir/klib/$packageName.klib"
        val ext = if (isWindows) ".bat" else ""
        val konanDataDir = project.properties["kotlin.native.home"] ?: System.getenv("KONAN_DATA_DIR")
        ?: "${System.getProperty("user.home")}/.konan"

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

    withType<AbstractKotlinNativeCompile> {
        dependsOn(wasmJsInterop)
    }
}