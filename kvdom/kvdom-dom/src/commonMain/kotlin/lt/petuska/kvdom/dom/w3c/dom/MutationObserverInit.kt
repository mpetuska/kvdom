package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MutationObserverInit](https://developer.mozilla.org/en/docs/Web/API/MutationObserverInit) to Kotlin
 */
expect interface MutationObserverInit {
  var childList: Boolean? /* = false */
  var attributes: Boolean?
  var characterData: Boolean?
  var subtree: Boolean? /* = false */
  var attributeOldValue: Boolean?
  var characterDataOldValue: Boolean?
  var attributeFilter: Array<String>?
}

inline fun MutationObserverInit(
  childList: Boolean? = false,
  attributes: Boolean? = null,
  characterData: Boolean? = null,
  subtree: Boolean? = false,
  attributeOldValue: Boolean? = null,
  characterDataOldValue: Boolean? = null,
  attributeFilter: Array<String>? = null
): MutationObserverInit = object : MutationObserverInit {
  override var childList: Boolean? = childList
  override var attributes: Boolean? = attributes
  override var characterData: Boolean? = characterData
  override var subtree: Boolean? = subtree
  override var attributeOldValue: Boolean? = attributeOldValue
  override var characterDataOldValue: Boolean? = characterDataOldValue
  override var attributeFilter: Array<String>? = attributeFilter
}
