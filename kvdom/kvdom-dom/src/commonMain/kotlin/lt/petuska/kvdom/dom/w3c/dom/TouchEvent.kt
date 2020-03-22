package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.UIEvent

expect open class TouchEvent() : UIEvent {
  open val touches: TouchList
  open val targetTouches: TouchList
  open val changedTouches: TouchList
  open val altKey: Boolean
  open val metaKey: Boolean
  open val ctrlKey: Boolean
  open val shiftKey: Boolean
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}