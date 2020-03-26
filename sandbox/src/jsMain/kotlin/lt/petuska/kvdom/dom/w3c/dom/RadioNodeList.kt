package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [RadioNodeList](https://developer.mozilla.org/en/docs/Web/API/RadioNodeList) to Kotlin
 */
actual abstract external class RadioNodeList : NodeList, UnionElementOrRadioNodeList {
  actual open var value: String
}