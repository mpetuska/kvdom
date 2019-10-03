plugins {
    kotlin("multiplatform") version "1.3.50"
    id("org.jetbrains.dokka") version "0.9.18"
    id("maven-publish")
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
}

kotlin {
    wasm32("wasm") {
        sourceSets {
            val wasmMain by getting {
                compilations["main"].apply {
                    kotlinOptions.freeCompilerArgs = resources.files.filter {
                        it.parentFile.name == "jsinterop"
                    }.map { "-include-binary $it" }
                }
            }
            val wasmTest by getting {}
        }
    }
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
        browser {}
        sourceSets {
            val jsMain by getting {
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
}