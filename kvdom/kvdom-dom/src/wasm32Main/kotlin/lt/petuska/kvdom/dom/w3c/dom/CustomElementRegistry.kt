package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.fetch.Promise

/**
 * Exposes the JavaScript [CustomElementRegistry](https://developer.mozilla.org/en/docs/Web/API/CustomElementRegistry) to Kotlin
 */
actual abstract class CustomElementRegistry actual constructor() {
  actual fun define(
    name: String,
    constructor: () -> Any,
    options: ElementDefinitionOptions
  ) {
  }
  
  actual fun get(name: String): Any? {
    TODO("Not yet implemented")
  }
  
  actual fun whenDefined(name: String): Promise<Unit> {
    TODO("Not yet implemented")
  }
}