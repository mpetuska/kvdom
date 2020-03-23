package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [RadioNodeList](https://developer.mozilla.org/en/docs/Web/API/RadioNodeList) to Kotlin
 */
@NoWASM
expect abstract class RadioNodeList() : NodeList, UnionElementOrRadioNodeList {
  open var value: String
}