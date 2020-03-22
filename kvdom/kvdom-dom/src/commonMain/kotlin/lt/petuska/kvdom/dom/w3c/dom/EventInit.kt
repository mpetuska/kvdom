package lt.petuska.kvdom.dom.w3c.dom

expect interface EventInit {
  var bubbles: Boolean? /* = false */
  var cancelable: Boolean? /* = false */
  var composed: Boolean? /* = false */
}

inline fun EventInit(bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): EventInit =
  object : EventInit {
    override var bubbles: Boolean? = bubbles
    override var cancelable: Boolean? = cancelable
    override var composed: Boolean? = composed
  }
