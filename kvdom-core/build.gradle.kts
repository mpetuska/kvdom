kotlin {
    metadata {
        sourceSets {
            val commonMain by getting {
                dependencies {
                    api(project(":kvdom-dom"))
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
    wasm32()
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
            val jsTest by getting {
                dependencies {
                    implementation(kotlin("test-js"))
                }
            }
        }
    }
}