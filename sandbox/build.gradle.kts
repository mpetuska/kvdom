plugins {
  kotlin("multiplatform")
}

kotlin {
  js()
  wasm32()
  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation(kotlin("stdlib-common"))
      }
    }
    all {
      languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
    }
  }
}