pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
    if (System.getProperty("enableKotlinDevChannel") === "true") {
      maven("https://dl.bintray.com/kotlin/kotlin-dev")
    }
  }
}
rootProject.name = "kvdom-root"

include(":kvdom")
include(":kvdom:kvdom-dom")
include(":kvdom:kvdom-core")
include(":kvdom:kvdom-dsl")
include(":kvdom-sample")
