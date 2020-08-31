pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
  }
}
rootProject.name = "kvdom-root"

include(":kvdom")
include(":kvdom:kvdom-dom")
include(":kvdom:kvdom-core")
include(":kvdom:kvdom-dsl")
include(":kvdom-sample")
