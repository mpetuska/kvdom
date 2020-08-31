package lt.petuska.kvdom.dom

public expect open class Event {
  public fun preventDefault()
  public fun initEvent(type: String, bubbles: Boolean, cancelable: Boolean)
  public fun stopPropagation()
}
