plugins {
  kotlin("multiplatform") version "1.3.60"
}

repositories {
  jcenter()
}

kotlin {
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
  wasm32()
}