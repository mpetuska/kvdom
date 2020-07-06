plugins {
  kotlin("multiplatform") version "1.4-M3" apply false
  id("org.jetbrains.dokka") version "0.10.1" apply false
  id("maven-publish")
  id("io.github.http-builder-ng.http-plugin") version "0.1.1" apply false
  idea
}

allprojects {
  group = "lt.petuska"
  version = "0.1.0-M1"
  apply(plugin = "idea")
  
  idea {
    module {
      isDownloadJavadoc = true
      isDownloadSources = true
    }
  }
  
  repositories {
    jcenter()
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
  }
}

tasks {
  val wrapper by getting(Wrapper::class) {
    gradleVersion = "6.5"
  }
}
