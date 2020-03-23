package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [DOMStringMap](https://developer.mozilla.org/en/docs/Web/API/DOMStringMap) to Kotlin
 */
@NoWASM
actual abstract class DOMStringMap

@NoWASM
actual operator fun DOMStringMap.get(name: String): String? {
  TODO("Not yet implemented")
}

@NoWASM
actual operator fun DOMStringMap.set(name: String, value: String) {
  TODO()
}