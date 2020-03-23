plugins {
  kotlin("multiplatform") version "1.3.71" apply false
  id("org.jetbrains.dokka") version "0.10.0" apply false
  id("maven-publish")
  id("io.github.http-builder-ng.http-plugin") version "0.1.1" apply false
  idea
}

allprojects {
  group = "lt.petuska"
  version = "0.0.3"
  apply(plugin = "idea")
  
  idea {
    module {
      isDownloadJavadoc = true
      isDownloadSources = true
    }
  }
  
  repositories {
    jcenter()
  }
}

tasks {
  val wrapper by getting(Wrapper::class) {
    gradleVersion = "6.2.2"
  }
}