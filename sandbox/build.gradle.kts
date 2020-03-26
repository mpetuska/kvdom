plugins {
  kotlin("multiplatform")
}

kotlin {
  js()
  wasm32()
  sourceSets {
    all {
      languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
    }
  }
}