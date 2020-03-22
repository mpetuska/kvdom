package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MutationObserverInit](https://developer.mozilla.org/en/docs/Web/API/MutationObserverInit) to Kotlin
 */
actual interface MutationObserverInit {
  actual var childList: Boolean?
  actual var attributes: Boolean?
  actual var characterData: Boolean?
  actual var subtree: Boolean?
  actual var attributeOldValue: Boolean?
  actual var characterDataOldValue: Boolean?
  actual var attributeFilter: Array<String>?
}