package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.fetch.Promise

actual abstract external class CustomElementRegistry {
  actual fun define(name: String, constructor: () -> Dynamic, options: ElementDefinitionOptions)
  actual fun get(name: String): Any?
  actual fun whenDefined(name: String): Promise<Unit>
}