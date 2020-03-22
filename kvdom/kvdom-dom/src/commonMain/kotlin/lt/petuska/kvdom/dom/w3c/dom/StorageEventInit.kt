package lt.petuska.kvdom.dom.w3c.dom

expect interface StorageEventInit : EventInit {
  var key: String? /* = null */
  var oldValue: String? /* = null */
  var newValue: String? /* = null */
  var url: String? /* = "" */
  var storageArea: Storage? /* = null */
}

inline fun StorageEventInit(
  key: String? = null,
  oldValue: String? = null,
  newValue: String? = null,
  url: String? = "",
  storageArea: Storage? = null,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): StorageEventInit = object : StorageEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var key: String? = key
  override var oldValue: String? = oldValue
  override var newValue: String? = newValue
  override var url: String? = url
  override var storageArea: Storage? = storageArea
}
