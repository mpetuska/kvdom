kotlin {
    metadata {
        sourceSets {
            val commonMain by getting {
                dependencies {
                    api(kotlin("stdlib-common"))
                }
            }
        }
    }
    js {
        browser {}
        sourceSets {
            val jsMain by getting {
                dependencies {
                    api(kotlin("stdlib-js"))
                }
            }
        }
    }
    wasm32 {
        sourceSets {
            val wasm32Main by getting {
                compilations["main"].apply {
                    kotlinOptions.freeCompilerArgs = resources.files.filter {
                        it.parentFile.name == "bindings"
                    }.map { "-include-binary $it" }
                }
            }
        }
    }
}