package lt.petuska.kvdom.dom.w3c.dom

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
actual interface GlobalEventHandlers {
  actual var onabort: ((Event) -> Any)?
  actual var onblur: ((FocusEvent) -> Any)?
  actual var oncancel: ((Event) -> Any)?
  actual var oncanplay: ((Event) -> Any)?
  actual var oncanplaythrough: ((Event) -> Any)?
  actual var onchange: ((Event) -> Any)?
  actual var onclick: ((MouseEvent) -> Any)?
  actual var onclose: ((Event) -> Any)?
  actual var oncontextmenu: ((MouseEvent) -> Any)?
  actual var oncuechange: ((Event) -> Any)?
  actual var ondblclick: ((MouseEvent) -> Any)?
  actual var ondrag: ((DragEvent) -> Any)?
  actual var ondragend: ((DragEvent) -> Any)?
  actual var ondragenter: ((DragEvent) -> Any)?
  actual var ondragexit: ((DragEvent) -> Any)?
  actual var ondragleave: ((DragEvent) -> Any)?
  actual var ondragover: ((DragEvent) -> Any)?
  actual var ondragstart: ((DragEvent) -> Any)?
  actual var ondrop: ((DragEvent) -> Any)?
  actual var ondurationchange: ((Event) -> Any)?
  actual var onemptied: ((Event) -> Any)?
  actual var onended: ((Event) -> Any)?
  actual var onerror: ((Any, String, Int, Int, Any?) -> Any)?
  actual var onfocus: ((FocusEvent) -> Any)?
  actual var oninput: ((InputEvent) -> Any)?
  actual var oninvalid: ((Event) -> Any)?
  actual var onkeydown: ((KeyboardEvent) -> Any)?
  actual var onkeypress: ((KeyboardEvent) -> Any)?
  actual var onkeyup: ((KeyboardEvent) -> Any)?
  actual var onload: ((Event) -> Any)?
  actual var onloadeddata: ((Event) -> Any)?
  actual var onloadedmetadata: ((Event) -> Any)?
  actual var onloadend: ((Event) -> Any)?
  actual var onloadstart: ((ProgressEvent) -> Any)?
  actual var onmousedown: ((MouseEvent) -> Any)?
  actual var onmouseenter: ((MouseEvent) -> Any)?
  actual var onmouseleave: ((MouseEvent) -> Any)?
  actual var onmousemove: ((MouseEvent) -> Any)?
  actual var onmouseout: ((MouseEvent) -> Any)?
  actual var onmouseover: ((MouseEvent) -> Any)?
  actual var onmouseup: ((MouseEvent) -> Any)?
  actual var onwheel: ((WheelEvent) -> Any)?
  actual var onpause: ((Event) -> Any)?
  actual var onplay: ((Event) -> Any)?
  actual var onplaying: ((Event) -> Any)?
  actual var onprogress: ((ProgressEvent) -> Any)?
  actual var onratechange: ((Event) -> Any)?
  actual var onreset: ((Event) -> Any)?
  actual var onresize: ((Event) -> Any)?
  actual var onscroll: ((Event) -> Any)?
  actual var onseeked: ((Event) -> Any)?
  actual var onseeking: ((Event) -> Any)?
  actual var onselect: ((Event) -> Any)?
  actual var onshow: ((Event) -> Any)?
  actual var onstalled: ((Event) -> Any)?
  actual var onsubmit: ((Event) -> Any)?
  actual var onsuspend: ((Event) -> Any)?
  actual var ontimeupdate: ((Event) -> Any)?
  actual var ontoggle: ((Event) -> Any)?
  actual var onvolumechange: ((Event) -> Any)?
  actual var onwaiting: ((Event) -> Any)?
  actual var ongotpointercapture: ((PointerEvent) -> Any)?
  actual var onlostpointercapture: ((PointerEvent) -> Any)?
  actual var onpointerdown: ((PointerEvent) -> Any)?
  actual var onpointermove: ((PointerEvent) -> Any)?
  actual var onpointerup: ((PointerEvent) -> Any)?
  actual var onpointercancel: ((PointerEvent) -> Any)?
  actual var onpointerover: ((PointerEvent) -> Any)?
  actual var onpointerout: ((PointerEvent) -> Any)?
  actual var onpointerenter: ((PointerEvent) -> Any)?
  actual var onpointerleave: ((PointerEvent) -> Any)?
}