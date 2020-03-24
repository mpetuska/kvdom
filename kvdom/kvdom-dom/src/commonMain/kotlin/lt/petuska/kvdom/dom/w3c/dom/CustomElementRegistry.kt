package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [CustomElementRegistry](https://developer.mozilla.org/en/docs/Web/API/CustomElementRegistry) to Kotlin
 */
@NoWASM
expect abstract class CustomElementRegistry {
  fun define(name: String, constructor: () -> Dynamic, options: ElementDefinitionOptions = ElementDefinitionOptions())
  fun get(name: String): Any?
  fun whenDefined(name: String): Promise<Unit>
}