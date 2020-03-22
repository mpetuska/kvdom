package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [CustomElementRegistry](https://developer.mozilla.org/en/docs/Web/API/CustomElementRegistry) to Kotlin
 */
expect abstract class CustomElementRegistry() {
  fun define(name: String, constructor: () -> Any, options: ElementDefinitionOptions)
  fun get(name: String): Any?
  fun whenDefined(name: String): Promise<Unit>
}