# **K**otlin **V**irtual **D**ocument **O**bject **M**odel (KVDOM)

A multiplatform virtual-dom library built from scratch with kotlin, for kotlin. 
Available for `common`, `js` and `wasm` targets.

## !! Notice !!
The project is currently in MVP alpha stage, containing the minimal logic required for it to work as common module and
required JS bindings implemented.

## Setup
The project is published to [JCenter](http://jcenter.bintray.com), however it can also be obtained via its [Bintray repository](https://bintray.com/beta/#/mpetuska/kvdom).
To be able to access them, include either to your repositories:
```kotlin
repositories {
    // Either
    jcenter()
    // Or
    maven {
        url = uri("https://dl.bintray.com/mpetuska/kvdom")
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
                implementation("lt.petuska.kvdom:kvdom-core:<VERSION>")
            }
        }
    }
}
```
Alternatively you can add platform specific dependencies to respective targets:
```kotlin
kotlin {
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation("lt.petuska.kvdom:kvdom-core-js:<VERSION>")
            }
        }
        val wasm32Main by getting {
            dependencies {
                implementation("lt.petuska.kvdom:kvdom-core-wasm32:<VERSION>")
            }
        }
    }
}
```

## Usage
For basic setup, please refer to [kvdom-sample](kvdom-sample/src/commonMain/kotlin/lt/petuska/kvdom/sample/index.kt)