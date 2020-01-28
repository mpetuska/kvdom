kotlin {
    sourceSets {
        val wasm32Main by getting {
            wasm32().compilations["main"].apply {
                kotlinOptions.freeCompilerArgs = resources.files.filter {
                    it.parentFile.name == "bindings"
                }.map { "-include-binary $it" }
            }
        }
    }
}