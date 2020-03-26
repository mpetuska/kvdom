package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [RadioNodeList](https://developer.mozilla.org/en/docs/Web/API/RadioNodeList) to Kotlin
 */
@NoWASM
actual abstract class RadioNodeList actual constructor() : NodeList(),
  UnionElementOrRadioNodeList {
  actual open var value: String
    get() = TODO("Not yet implemented")
    set(value) {
      TODO("Not yet implemented")
    }
}