kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":kvdom:kvdom-dom"))
            }
        }
    }
}