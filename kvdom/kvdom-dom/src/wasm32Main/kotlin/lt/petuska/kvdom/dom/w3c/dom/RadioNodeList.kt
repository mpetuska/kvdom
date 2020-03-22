package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [RadioNodeList](https://developer.mozilla.org/en/docs/Web/API/RadioNodeList) to Kotlin
 */
actual abstract class RadioNodeList actual constructor() : NodeList(),
  UnionElementOrRadioNodeList {
  actual open var value: String
    get() = TODO("Not yet implemented")
    set(value) {}
}