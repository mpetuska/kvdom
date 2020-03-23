package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.events.Event
import lt.petuska.kvdom.dom.w3c.dom.events.FocusEvent
import lt.petuska.kvdom.dom.w3c.dom.events.InputEvent
import lt.petuska.kvdom.dom.w3c.dom.events.KeyboardEvent
import lt.petuska.kvdom.dom.w3c.dom.events.MouseEvent
import lt.petuska.kvdom.dom.w3c.dom.events.WheelEvent
import lt.petuska.kvdom.dom.w3c.dom.pointerevents.PointerEvent
import lt.petuska.kvdom.dom.w3c.xhr.ProgressEvent

/**
 * Exposes the JavaScript [GlobalEventHandlers](https://developer.mozilla.org/en/docs/Web/API/GlobalEventHandlers) to Kotlin
 */
actual external interface GlobalEventHandlers {
  actual var onabort: ((Event) -> Dynamic)?
  actual var onblur: ((FocusEvent) -> Dynamic)?
  actual var oncancel: ((Event) -> Dynamic)?
  actual var oncanplay: ((Event) -> Dynamic)?
  actual var oncanplaythrough: ((Event) -> Dynamic)?
  actual var onchange: ((Event) -> Dynamic)?
  actual var onclick: ((MouseEvent) -> Dynamic)?
  actual var onclose: ((Event) -> Dynamic)?
  actual var oncontextmenu: ((MouseEvent) -> Dynamic)?
  actual var oncuechange: ((Event) -> Dynamic)?
  actual var ondblclick: ((MouseEvent) -> Dynamic)?
  actual var ondrag: ((DragEvent) -> Dynamic)?
  actual var ondragend: ((DragEvent) -> Dynamic)?
  actual var ondragenter: ((DragEvent) -> Dynamic)?
  actual var ondragexit: ((DragEvent) -> Dynamic)?
  actual var ondragleave: ((DragEvent) -> Dynamic)?
  actual var ondragover: ((DragEvent) -> Dynamic)?
  actual var ondragstart: ((DragEvent) -> Dynamic)?
  actual var ondrop: ((DragEvent) -> Dynamic)?
  actual var ondurationchange: ((Event) -> Dynamic)?
  actual var onemptied: ((Event) -> Dynamic)?
  actual var onended: ((Event) -> Dynamic)?
  actual var onerror: ((Dynamic, String, Int, Int, Any?) -> Dynamic)?
  actual var onfocus: ((FocusEvent) -> Dynamic)?
  actual var oninput: ((InputEvent) -> Dynamic)?
  actual var oninvalid: ((Event) -> Dynamic)?
  actual var onkeydown: ((KeyboardEvent) -> Dynamic)?
  actual var onkeypress: ((KeyboardEvent) -> Dynamic)?
  actual var onkeyup: ((KeyboardEvent) -> Dynamic)?
  actual var onload: ((Event) -> Dynamic)?
  actual var onloadeddata: ((Event) -> Dynamic)?
  actual var onloadedmetadata: ((Event) -> Dynamic)?
  actual var onloadend: ((Event) -> Dynamic)?
  actual var onloadstart: ((ProgressEvent) -> Dynamic)?
  actual var onmousedown: ((MouseEvent) -> Dynamic)?
  actual var onmouseenter: ((MouseEvent) -> Dynamic)?
  actual var onmouseleave: ((MouseEvent) -> Dynamic)?
  actual var onmousemove: ((MouseEvent) -> Dynamic)?
  actual var onmouseout: ((MouseEvent) -> Dynamic)?
  actual var onmouseover: ((MouseEvent) -> Dynamic)?
  actual var onmouseup: ((MouseEvent) -> Dynamic)?
  actual var onwheel: ((WheelEvent) -> Dynamic)?
  actual var onpause: ((Event) -> Dynamic)?
  actual var onplay: ((Event) -> Dynamic)?
  actual var onplaying: ((Event) -> Dynamic)?
  actual var onprogress: ((ProgressEvent) -> Dynamic)?
  actual var onratechange: ((Event) -> Dynamic)?
  actual var onreset: ((Event) -> Dynamic)?
  actual var onresize: ((Event) -> Dynamic)?
  actual var onscroll: ((Event) -> Dynamic)?
  actual var onseeked: ((Event) -> Dynamic)?
  actual var onseeking: ((Event) -> Dynamic)?
  actual var onselect: ((Event) -> Dynamic)?
  actual var onshow: ((Event) -> Dynamic)?
  actual var onstalled: ((Event) -> Dynamic)?
  actual var onsubmit: ((Event) -> Dynamic)?
  actual var onsuspend: ((Event) -> Dynamic)?
  actual var ontimeupdate: ((Event) -> Dynamic)?
  actual var ontoggle: ((Event) -> Dynamic)?
  actual var onvolumechange: ((Event) -> Dynamic)?
  actual var onwaiting: ((Event) -> Dynamic)?
  actual var ongotpointercapture: ((PointerEvent) -> Dynamic)?
  actual var onlostpointercapture: ((PointerEvent) -> Dynamic)?
  actual var onpointerdown: ((PointerEvent) -> Dynamic)?
  actual var onpointermove: ((PointerEvent) -> Dynamic)?
  actual var onpointerup: ((PointerEvent) -> Dynamic)?
  actual var onpointercancel: ((PointerEvent) -> Dynamic)?
  actual var onpointerover: ((PointerEvent) -> Dynamic)?
  actual var onpointerout: ((PointerEvent) -> Dynamic)?
  actual var onpointerenter: ((PointerEvent) -> Dynamic)?
  actual var onpointerleave: ((PointerEvent) -> Dynamic)?
}