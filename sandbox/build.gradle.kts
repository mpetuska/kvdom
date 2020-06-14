plugins {
  kotlin("multiplatform")
}

kotlin {
  js {
    binaries.executable()
    browser {
      distribution {
        directory = file("$buildDir/bundle/js")
      }
    }
  }
  wasm32 {
    binaries.executable {
      entryPoint = "lt.petuska.kvdom.sandbox.main"
    }
  }
  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation(project(":kvdom"))
      }
    }
    all {
      languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
    }
  }
}

afterEvaluate {
  tasks {
    val wasm32ProcessResources by getting(Copy::class)
    val linkReleaseExecutableWasm32 by getting(org.jetbrains.kotlin.gradle.tasks.KotlinNativeLink::class)
    val wasmBundle by creating(Copy::class) {
      group = "build"
      dependsOn(wasm32ProcessResources, linkReleaseExecutableWasm32)
      from(linkReleaseExecutableWasm32.destinationDir)
      from(wasm32ProcessResources.destinationDir)
      destinationDir = file("$buildDir/bundle/wasm")
    }
    val kotlinNodeJsSetup by rootProject.tasks.getting(org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsSetupTask::class)
    val wasmRun by creating(Exec::class) {
      dependsOn(wasmBundle, kotlinNodeJsSetup)
      group = "run"
      val exeType = if (org.gradle.internal.os.OperatingSystem.current().isWindows) ".cmd" else ""
      executable = "${kotlinNodeJsSetup.destination}/npx$exeType"
      workingDir = wasmBundle.destinationDir
      args("serve")
    }
    val assemble by getting {
      dependsOn(wasmBundle)
    }
  }
}
