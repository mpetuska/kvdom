package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMStringMap](https://developer.mozilla.org/en/docs/Web/API/DOMStringMap) to Kotlin
 */
expect abstract class DOMStringMap()

expect inline operator fun DOMStringMap.get(name: String): String?

expect inline operator fun DOMStringMap.set(name: String, value: String)