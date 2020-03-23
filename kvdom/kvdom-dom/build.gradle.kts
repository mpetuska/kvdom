kotlin {
  sourceSets {
    val wasm32Main by getting {
      wasm32().compilations["main"].apply {
        kotlinOptions.freeCompilerArgs = resources.files.flatMap {
          listOf("-include-binary", " '${it.invariantSeparatorsPath}'")
        }
      }
    }
  
    all {
      languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
    }
  }
}