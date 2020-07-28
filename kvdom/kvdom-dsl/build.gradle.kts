kotlin {
  sourceSets {
    val commonMain by getting {
      dependencies {
        api(project(":kvdom:kvdom-core"))
        api("lt.petuska:kotlinx-html:0.7.2")
      }
    }
  }
}
