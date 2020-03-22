package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMStringMap](https://developer.mozilla.org/en/docs/Web/API/DOMStringMap) to Kotlin
 */
actual abstract class DOMStringMap actual constructor()

actual inline operator fun DOMStringMap.get(name: String): String? {
  TODO("Not yet implemented")
}

actual inline operator fun DOMStringMap.set(name: String, value: String) {
}