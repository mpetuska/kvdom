plugins {
  kotlin("multiplatform")
  idea
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
      entryPoint = "lt.petuska.kvdom.sample.main"
    }
  }
  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation(project(":kvdom"))
      }
    }
    val wasm32Main by getting {
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
    val linkDebugExecutableWasm32 by getting(org.jetbrains.kotlin.gradle.tasks.KotlinNativeLink::class)
    val wasmDebugBundle by creating(Copy::class) {
      group = "build"
      dependsOn(wasm32ProcessResources, linkDebugExecutableWasm32)
      from(linkDebugExecutableWasm32.destinationDir)
      from(wasm32ProcessResources.destinationDir)
      destinationDir = file("$buildDir/bundle/wasm/debug")
      inputs.files(linkDebugExecutableWasm32.destinationDir, wasm32ProcessResources.destinationDir)
      outputs.dir(destinationDir)
    }
    val linkReleaseExecutableWasm32 by getting(org.jetbrains.kotlin.gradle.tasks.KotlinNativeLink::class)
    val wasmReleaseBundle by creating(Copy::class) {
      group = "build"
      dependsOn(wasm32ProcessResources, linkReleaseExecutableWasm32)
      from(linkReleaseExecutableWasm32.destinationDir)
      from(wasm32ProcessResources.destinationDir)
      destinationDir = file("$buildDir/bundle/wasm/release")
      inputs.files(linkReleaseExecutableWasm32.destinationDir, wasm32ProcessResources.destinationDir)
      outputs.dir(destinationDir)
    }
    val kotlinNodeJsSetup by rootProject.tasks.getting(org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsSetupTask::class)
    val wasmRun by creating(Exec::class) {
      dependsOn(wasmDebugBundle, kotlinNodeJsSetup)
      group = "run"
      val exeType = if (org.gradle.internal.os.OperatingSystem.current().isWindows) ".cmd" else ""
      workingDir = wasmDebugBundle.destinationDir
      executable = "${kotlinNodeJsSetup.destination}/bin/node$exeType"
      args("${kotlinNodeJsSetup.destination}/lib/node_modules/npm/bin/npx-cli.js", "serve")
      inputs.files(wasmDebugBundle.outputs)
    }
    val assemble by getting {
      dependsOn(wasmDebugBundle)
      dependsOn(wasmReleaseBundle)
    }
  }
}
