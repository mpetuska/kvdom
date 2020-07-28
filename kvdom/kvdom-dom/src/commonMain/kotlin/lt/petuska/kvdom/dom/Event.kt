package lt.petuska.kvdom.dom

expect open class Event {
  fun preventDefault()
  fun initEvent(type: String, bubbles: Boolean, cancelable: Boolean)
  fun stopPropagation()
}
