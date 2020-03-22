package lt.petuska.kvdom.dom.w3c.dom

expect interface MediaQueryListEventInit : EventInit {
  var media: String? /* = "" */
  var matches: Boolean? /* = false */
}

inline fun MediaQueryListEventInit(
  media: String? = "",
  matches: Boolean? = false,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): MediaQueryListEventInit = object : MediaQueryListEventInit, EventInit by EventInit(bubbles, cancelable, composed) {
  override var media: String? = media
  override var matches: Boolean? = matches
}
