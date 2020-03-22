package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.dom.events.MouseEventInit

expect interface DragEventInit : MouseEventInit {
  var dataTransfer: DataTransfer? /* = null */
}

inline fun DragEventInit(
  dataTransfer: DataTransfer? = null,
  screenX: Int? = 0,
  screenY: Int? = 0,
  clientX: Int? = 0,
  clientY: Int? = 0,
  button: Short? = 0,
  buttons: Short? = 0,
  relatedTarget: EventTarget? = null,
  region: String? = null,
  ctrlKey: Boolean? = false,
  shiftKey: Boolean? = false,
  altKey: Boolean? = false,
  metaKey: Boolean? = false,
  modifierAltGraph: Boolean? = false,
  modifierCapsLock: Boolean? = false,
  modifierFn: Boolean? = false,
  modifierFnLock: Boolean? = false,
  modifierHyper: Boolean? = false,
  modifierNumLock: Boolean? = false,
  modifierScrollLock: Boolean? = false,
  modifierSuper: Boolean? = false,
  modifierSymbol: Boolean? = false,
  modifierSymbolLock: Boolean? = false,
  view: Window? = null,
  detail: Int? = 0,
  bubbles: Boolean? = false,
  cancelable: Boolean? = false,
  composed: Boolean? = false
): DragEventInit = object : DragEventInit, MouseEventInit by MouseEventInit(
  screenX,
  screenY,
  clientX,
  clientY,
  button,
  buttons,
  relatedTarget,
  region,
  ctrlKey,
  shiftKey,
  altKey,
  metaKey,
  modifierAltGraph,
  modifierCapsLock,
  modifierFn,
  modifierFnLock,
  modifierHyper,
  modifierNumLock,
  modifierScrollLock,
  modifierSuper,
  modifierSymbol,
  modifierSymbolLock,
  view,
  detail,
  bubbles,
  cancelable,
  composed
) {
  override var dataTransfer: DataTransfer? = dataTransfer
}
