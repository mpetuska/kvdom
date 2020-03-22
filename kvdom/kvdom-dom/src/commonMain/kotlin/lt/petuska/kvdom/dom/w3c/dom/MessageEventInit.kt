package lt.petuska.kvdom.dom.w3c.dom

expect interface MessageEventInit : EventInit {
  var data: Any? /* = null */
  var origin: String? /* = "" */
  var lastEventId: String? /* = "" */
  var source: UnionMessagePortOrWindowProxy? /* = null */
  var ports: Array<MessagePort>? /* = arrayOf() */
}

inline fun MessageEventInit(
  data: Any? = null,
  origin: String? = "",
  lastEventId: String? = "",
  source: UnionMessagePortOrWindowProxy? = null,
  ports: Array<MessagePort>? = arrayOf(),
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): MessageEventInit = object : MessageEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var data: Any? = data
  override var origin: String? = origin
  override var lastEventId: String? = lastEventId
  override var source: UnionMessagePortOrWindowProxy? = source
  override var ports: Array<MessagePort>? = ports
}
