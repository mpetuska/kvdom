package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.fetch.Promise

@NoWASM
actual abstract class CustomElementRegistry {
  actual fun define(name: String, constructor: () -> Dynamic, options: ElementDefinitionOptions) {
    TODO()
  }
  
  actual fun get(name: String): Any? {
    TODO()
  }
  
  actual fun whenDefined(name: String): Promise<Unit> {
    TODO()
  }
}