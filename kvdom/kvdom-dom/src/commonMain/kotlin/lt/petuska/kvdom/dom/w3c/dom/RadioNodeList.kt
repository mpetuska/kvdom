package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [RadioNodeList](https://developer.mozilla.org/en/docs/Web/API/RadioNodeList) to Kotlin
 */
expect abstract class RadioNodeList() : NodeList,
  UnionElementOrRadioNodeList {
  open var value: String
}