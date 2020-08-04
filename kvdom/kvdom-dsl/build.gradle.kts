kotlin {
  sourceSets {
    val commonMain by getting {
      dependencies {
        api(project(":kvdom:kvdom-core"))
        api("lt.petuska:kotlinx-html:0.7.3")
//        api("org.jetbrains:kotlin-css:1.0.0-pre.110-kotlin-1.4.0-rc")
      }
    }
  }
}
