enableFeaturePreview("GRADLE_METADATA")
pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
  }
}
rootProject.name = "kvdom-root"

include("kvdom")
include("kvdom:kvdom-dom")
include("kvdom:kvdom-core")
include("kvdom:kvdom-dsl")
include("kvdom-sample")
