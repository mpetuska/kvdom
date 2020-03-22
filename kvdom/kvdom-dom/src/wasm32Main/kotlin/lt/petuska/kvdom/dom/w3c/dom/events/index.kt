package lt.petuska.kvdom.dom.w3c.dom.events

import lt.petuska.kvdom.dom.w3c.dom.EventInit
import lt.petuska.kvdom.dom.w3c.dom.UnionElementOrMouseEvent
import lt.petuska.kvdom.dom.w3c.dom.Window

/**
 * Exposes the JavaScript [UIEvent](https://developer.mozilla.org/en/docs/Web/API/UIEvent) to Kotlin
 */
actual open class UIEvent actual constructor(
  type: String,
  eventInitDict: UIEventInit
) : Event(type, eventInitDict) {
  actual open val view: Window?
    get() = TODO("Not yet implemented")
  actual open val detail: Int
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

actual interface UIEventInit : EventInit {
  actual var view: Window?
  actual var detail: Int?
}

/**
 * Exposes the JavaScript [FocusEvent](https://developer.mozilla.org/en/docs/Web/API/FocusEvent) to Kotlin
 */
actual open class FocusEvent actual constructor(
  type: String,
  eventInitDict: FocusEventInit
) : UIEvent(type, eventInitDict) {
  actual open val relatedTarget: EventTarget?
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

actual interface FocusEventInit : UIEventInit {
  actual var relatedTarget: EventTarget?
}

/**
 * Exposes the JavaScript [MouseEvent](https://developer.mozilla.org/en/docs/Web/API/MouseEvent) to Kotlin
 */
actual open class MouseEvent actual constructor(
  type: String,
  eventInitDict: MouseEventInit
) : UIEvent(type, eventInitDict),
  UnionElementOrMouseEvent {
  actual open val screenX: Int
    get() = TODO("Not yet implemented")
  actual open val screenY: Int
    get() = TODO("Not yet implemented")
  actual open val clientX: Int
    get() = TODO("Not yet implemented")
  actual open val clientY: Int
    get() = TODO("Not yet implemented")
  actual open val ctrlKey: Boolean
    get() = TODO("Not yet implemented")
  actual open val shiftKey: Boolean
    get() = TODO("Not yet implemented")
  actual open val altKey: Boolean
    get() = TODO("Not yet implemented")
  actual open val metaKey: Boolean
    get() = TODO("Not yet implemented")
  actual open val button: Short
    get() = TODO("Not yet implemented")
  actual open val buttons: Short
    get() = TODO("Not yet implemented")
  actual open val relatedTarget: EventTarget?
    get() = TODO("Not yet implemented")
  actual open val region: String?
    get() = TODO("Not yet implemented")
  actual open val pageX: Double
    get() = TODO("Not yet implemented")
  actual open val pageY: Double
    get() = TODO("Not yet implemented")
  actual open val x: Double
    get() = TODO("Not yet implemented")
  actual open val y: Double
    get() = TODO("Not yet implemented")
  actual open val offsetX: Double
    get() = TODO("Not yet implemented")
  actual open val offsetY: Double
    get() = TODO("Not yet implemented")
  
  actual fun getModifierState(keyArg: String): Boolean {
    TODO("Not yet implemented")
  }
  
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

actual external interface MouseEventInit : EventModifierInit {
  actual var screenX: Int?
  actual var screenY: Int?
  actual var clientX: Int?
  actual var clientY: Int?
  actual var button: Short?
  actual var buttons: Short?
  actual var relatedTarget: EventTarget?
  actual var region: String?
}

actual interface EventModifierInit : UIEventInit {
  actual var ctrlKey: Boolean?
  actual var shiftKey: Boolean?
  actual var altKey: Boolean?
  actual var metaKey: Boolean?
  actual var modifierAltGraph: Boolean?
  actual var modifierCapsLock: Boolean?
  actual var modifierFn: Boolean?
  actual var modifierFnLock: Boolean?
  actual var modifierHyper: Boolean?
  actual var modifierNumLock: Boolean?
  actual var modifierScrollLock: Boolean?
  actual var modifierSuper: Boolean?
  actual var modifierSymbol: Boolean?
  actual var modifierSymbolLock: Boolean?
}

/**
 * Exposes the JavaScript [WheelEvent](https://developer.mozilla.org/en/docs/Web/API/WheelEvent) to Kotlin
 */
actual open class WheelEvent actual constructor(
  type: String,
  eventInitDict: WheelEventInit
) : MouseEvent(type, eventInitDict) {
  actual open val deltaX: Double
    get() = TODO("Not yet implemented")
  actual open val deltaY: Double
    get() = TODO("Not yet implemented")
  actual open val deltaZ: Double
    get() = TODO("Not yet implemented")
  actual open val deltaMode: Int
    get() = TODO("Not yet implemented")
  
  actual companion object {
    actual val DOM_DELTA_PIXEL: Int
      get() = TODO("Not yet implemented")
    actual val DOM_DELTA_LINE: Int
      get() = TODO("Not yet implemented")
    actual val DOM_DELTA_PAGE: Int
      get() = TODO("Not yet implemented")
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

actual interface WheelEventInit : MouseEventInit {
  actual var deltaX: Double?
  actual var deltaY: Double?
  actual var deltaZ: Double?
  actual var deltaMode: Int?
}

/**
 * Exposes the JavaScript [InputEvent](https://developer.mozilla.org/en/docs/Web/API/InputEvent) to Kotlin
 */
actual open class InputEvent actual constructor(
  type: String,
  eventInitDict: InputEventInit
) : UIEvent(type, eventInitDict) {
  actual open val data: String
    get() = TODO("Not yet implemented")
  actual open val isComposing: Boolean
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

actual interface InputEventInit : UIEventInit {
  actual var data: String?
  actual var isComposing: Boolean?
}

/**
 * Exposes the JavaScript [KeyboardEvent](https://developer.mozilla.org/en/docs/Web/API/KeyboardEvent) to Kotlin
 */
actual open class KeyboardEvent actual constructor(
  type: String,
  eventInitDict: KeyboardEventInit
) : UIEvent(type, eventInitDict) {
  actual open val key: String
    get() = TODO("Not yet implemented")
  actual open val code: String
    get() = TODO("Not yet implemented")
  actual open val location: Int
    get() = TODO("Not yet implemented")
  actual open val ctrlKey: Boolean
    get() = TODO("Not yet implemented")
  actual open val shiftKey: Boolean
    get() = TODO("Not yet implemented")
  actual open val altKey: Boolean
    get() = TODO("Not yet implemented")
  actual open val metaKey: Boolean
    get() = TODO("Not yet implemented")
  actual open val repeat: Boolean
    get() = TODO("Not yet implemented")
  actual open val isComposing: Boolean
    get() = TODO("Not yet implemented")
  actual open val charCode: Int
    get() = TODO("Not yet implemented")
  actual open val keyCode: Int
    get() = TODO("Not yet implemented")
  actual open val which: Int
    get() = TODO("Not yet implemented")
  
  actual fun getModifierState(keyArg: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual companion object {
    actual val DOM_KEY_LOCATION_STANDARD: Int
      get() = TODO("Not yet implemented")
    actual val DOM_KEY_LOCATION_LEFT: Int
      get() = TODO("Not yet implemented")
    actual val DOM_KEY_LOCATION_RIGHT: Int
      get() = TODO("Not yet implemented")
    actual val DOM_KEY_LOCATION_NUMPAD: Int
      get() = TODO("Not yet implemented")
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

actual interface KeyboardEventInit : EventModifierInit {
  actual var key: String?
  actual var code: String?
  actual var location: Int?
  actual var repeat: Boolean?
  actual var isComposing: Boolean?
}

/**
 * Exposes the JavaScript [CompositionEvent](https://developer.mozilla.org/en/docs/Web/API/CompositionEvent) to Kotlin
 */
actual open class CompositionEvent actual constructor(
  type: String,
  eventInitDict: CompositionEventInit
) :
  UIEvent(type, eventInitDict) {
  actual open val data: String
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

actual interface CompositionEventInit : UIEventInit {
  actual var data: String?
}

/**
 * Exposes the JavaScript [Event](https://developer.mozilla.org/en/docs/Web/API/Event) to Kotlin
 */
actual open class Event actual constructor(type: String, eventInitDict: EventInit) {
  actual open val type: String
    get() = TODO("Not yet implemented")
  actual open val target: EventTarget?
    get() = TODO("Not yet implemented")
  actual open val currentTarget: EventTarget?
    get() = TODO("Not yet implemented")
  actual open val eventPhase: Short
    get() = TODO("Not yet implemented")
  actual open val bubbles: Boolean
    get() = TODO("Not yet implemented")
  actual open val cancelable: Boolean
    get() = TODO("Not yet implemented")
  actual open val defaultPrevented: Boolean
    get() = TODO("Not yet implemented")
  actual open val composed: Boolean
    get() = TODO("Not yet implemented")
  actual open val isTrusted: Boolean
    get() = TODO("Not yet implemented")
  actual open val timeStamp: Number
    get() = TODO("Not yet implemented")
  
  actual fun composedPath(): Array<EventTarget> {
    TODO("Not yet implemented")
  }
  
  actual fun stopPropagation() {
  }
  
  actual fun stopImmediatePropagation() {
  }
  
  actual fun preventDefault() {
  }
  
  actual fun initEvent(type: String, bubbles: Boolean, cancelable: Boolean) {
  }
  
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

/**
 * Exposes the JavaScript [EventTarget](https://developer.mozilla.org/en/docs/Web/API/EventTarget) to Kotlin
 */
actual abstract class EventTarget {
  actual fun addEventListener(
    type: String,
    callback: EventListener?,
    options: Any
  ) {
  }
  
  actual fun addEventListener(
    type: String,
    callback: ((Event) -> Unit)?,
    options: Any
  ) {
  }
  
  actual fun removeEventListener(
    type: String,
    callback: EventListener?,
    options: Any
  ) {
  }
  
  actual fun removeEventListener(
    type: String,
    callback: ((Event) -> Unit)?,
    options: Any
  ) {
  }
  
  actual fun dispatchEvent(event: Event): Boolean {
    TODO("Not yet implemented")
  }
}

/**
 * Exposes the JavaScript [EventListener](https://developer.mozilla.org/en/docs/Web/API/EventListener) to Kotlin
 */
actual interface EventListener {
  actual fun handleEvent(event: Event)
}