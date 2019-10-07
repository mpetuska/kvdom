kotlin {
    metadata {
        sourceSets {
            val commonMain by getting {
                dependencies {
                    api(project(":kvdom-definitions-dom"))
                }
            }
        }
    }
    wasm32()
    js {
        browser {}
    }
}