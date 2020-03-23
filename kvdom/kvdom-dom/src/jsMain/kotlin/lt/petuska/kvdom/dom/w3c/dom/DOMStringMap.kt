package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMStringMap](https://developer.mozilla.org/en/docs/Web/API/DOMStringMap) to Kotlin
 */
actual abstract external class DOMStringMap

@Suppress("UnsafeCastFromDynamic")
actual operator fun DOMStringMap.get(name: String): String? = asDynamic()[name]
actual operator fun DOMStringMap.set(name: String, value: String) {
  asDynamic()[name] = value
}