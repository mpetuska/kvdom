kotlin {
    sourceSets {
        val wasm32Main by getting {
            wasm32().compilations["main"].apply {
              kotlinOptions.freeCompilerArgs = resources.files.map {
                "-include-binary '${it.invariantSeparatorsPath}'"
              }
            }
        }
    }
}