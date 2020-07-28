# **K**otlin **V**irtual **D**ocument **O**bject **M**odel (KVDOM)

A multiplatform virtual-dom library built from scratch with kotlin, for kotlin. 
Available for `metadata`, `js` and `wasm` targets.

## !! Notice !!
The project is currently in MVP alpha stage, containing the minimal logic required for it to work as common module and
required JS bindings implemented.

## Setup
The project is published to [JCenter](https://bintray.com/bintray/jcenter), however it can also be obtained via its [Bintray repository](https://bintray.com/mpetuska/lt.petuska/kvdom).
To be able to access them, include either to your repositories:
```kotlin
repositories {
    // Either
    jcenter()
    // Or
    maven {
        url = uri("https://dl.bintray.com/mpetuska/lt.petuska")
    }
}
```

The library is published with gradle metadata, so all you need to include it to MPP projects is
to include it in your common sourceSet:
```kotlin
kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("lt.petuska:kvdom:<VERSION>")
            }
        }
    }
}
```
Alternatively you can add platform specific dependencies to respective targets:
```kotlin
kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("lt.petuska:kvdom-metadata:<VERSION>")
            }
        }
        val jsMain by getting {
            dependencies {
                implementation("lt.petuska:kvdom-js:<VERSION>")
            }
        }
        val wasm32Main by getting {
            dependencies {
                implementation("lt.petuska:kvdom-wasm32:<VERSION>")
            }
        }
    }
}
```

## Usage
For basic setup, please refer to the [Wiki](https://gitlab.com/lt.petuska/kvdom/-/wikis/Setup)
