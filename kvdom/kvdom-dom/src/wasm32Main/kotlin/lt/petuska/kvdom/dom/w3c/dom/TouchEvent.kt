package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.UIEvent
import lt.petuska.kvdom.dom.w3c.dom.events.UIEventInit

actual open class TouchEvent actual constructor() : UIEvent("", UIEventInit()) {
  actual open val touches: TouchList
    get() = TODO("Not yet implemented")
  actual open val targetTouches: TouchList
    get() = TODO("Not yet implemented")
  actual open val changedTouches: TouchList
    get() = TODO("Not yet implemented")
  actual open val altKey: Boolean
    get() = TODO("Not yet implemented")
  actual open val metaKey: Boolean
    get() = TODO("Not yet implemented")
  actual open val ctrlKey: Boolean
    get() = TODO("Not yet implemented")
  actual open val shiftKey: Boolean
    get() = TODO("Not yet implemented")
  
  actual companion object {
    actual val NONE: Short
      get() = TODO("Not yet implemented")
    actual val CAPTURING_PHASE: Short
      get() = TODO("Not yet implemented")
    actual val AT_TARGET: Short
      get() = TODO("Not yet implemented")
    actual val BUBBLING_PHASE: Short
      get() = TODO("Not yet implemented")
  }
  
}