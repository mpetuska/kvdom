plugins {
    kotlin("multiplatform") version "1.3.50"
    id("org.jetbrains.dokka") version "0.9.18"
    idea
}

group = "lt.petuska"
version = "1.0.0-SNAPSHOT"

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}

repositories {
    jcenter()
    maven("https://dl.bintray.com/kotlin/ktor")
}

val webDir = file("$projectDir/src/jsMain/web")

kotlin {
    //    wasm32("wasm") {
//        binaries {
//            executable {
//                entryPoint = "lt.petuska.kvdom.main"
//            }
//        }
//    sourceSets {
//
    //        val wasmMain by getting {
//            dependencies {
//                implementation(fileTree("$projectDir/klib") {
//                    include("*.klib")
//                })
//            }
//        }
//        val wasmTest by getting {
//        }
//    }
//    }
    metadata {
        sourceSets {
            val commonMain by getting {
                dependencies {
                    implementation(kotlin("stdlib-common"))
                }
            }
            val commonTest by getting {
                dependencies {
                    implementation(kotlin("test-common"))
                    implementation(kotlin("test-annotations-common"))
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
            val jsTest by getting {
                dependencies {
                    implementation(kotlin("test-js"))
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
//    val wasmProcessResources by getting(Copy::class) {
//        filesMatching("index.html") {
//            expand(project.properties)
//        }
//    }
//    val linkReleaseExecutableWasm by getting(KotlinNativeLink::class)
//    val wasmBundle by creating(Copy::class) {
//        group = "build"
//        dependsOn(wasmProcessResources, linkReleaseExecutableWasm)
//        from(linkReleaseExecutableWasm.destinationDir)
//        from(wasmProcessResources.destinationDir)
//        destinationDir = file("$buildDir/bundle/wasm")
//    }
//
//    val assemble by getting {
//        dependsOn(wasmBundle)
//    }
    // This is to run embedded HTTP server with Ktor:
//    val runProgram by creating(JavaExec::class) {
//        group = "run"
//
//        val server: KotlinJvmTarget by kotlin.targets
//        val serverMainCompilation = server.compilations["main"]
//        dependsOn(serverMainCompilation.compileKotlinTask, wasmBundle)
//
//        main = "lt.petuska.kvdom.IndexKt"
//        classpath =
//            files(serverMainCompilation.output) + serverMainCompilation.runtimeDependencyFiles + files(wasmBundle.destinationDir)
//        args = listOf("${wasmBundle.destinationDir}")
//    }
}