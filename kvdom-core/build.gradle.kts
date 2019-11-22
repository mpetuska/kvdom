kotlin {
    metadata {
        sourceSets {
            val commonMain by getting {
                dependencies {
                    api(project(":kvdom-dom"))
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
    }
}