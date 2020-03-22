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
expect interface GlobalEventHandlers {
  var onabort: ((Event) -> Any)?
  var onblur: ((FocusEvent) -> Any)?
  var oncancel: ((Event) -> Any)?
  var oncanplay: ((Event) -> Any)?
  var oncanplaythrough: ((Event) -> Any)?
  var onchange: ((Event) -> Any)?
  var onclick: ((MouseEvent) -> Any)?
  var onclose: ((Event) -> Any)?
  var oncontextmenu: ((MouseEvent) -> Any)?
  var oncuechange: ((Event) -> Any)?
  var ondblclick: ((MouseEvent) -> Any)?
  var ondrag: ((DragEvent) -> Any)?
  var ondragend: ((DragEvent) -> Any)?
  var ondragenter: ((DragEvent) -> Any)?
  var ondragexit: ((DragEvent) -> Any)?
  var ondragleave: ((DragEvent) -> Any)?
  var ondragover: ((DragEvent) -> Any)?
  var ondragstart: ((DragEvent) -> Any)?
  var ondrop: ((DragEvent) -> Any)?
  var ondurationchange: ((Event) -> Any)?
  var onemptied: ((Event) -> Any)?
  var onended: ((Event) -> Any)?
  var onerror: ((Any, String, Int, Int, Any?) -> Any)?
  var onfocus: ((FocusEvent) -> Any)?
  var oninput: ((InputEvent) -> Any)?
  var oninvalid: ((Event) -> Any)?
  var onkeydown: ((KeyboardEvent) -> Any)?
  var onkeypress: ((KeyboardEvent) -> Any)?
  var onkeyup: ((KeyboardEvent) -> Any)?
  var onload: ((Event) -> Any)?
  var onloadeddata: ((Event) -> Any)?
  var onloadedmetadata: ((Event) -> Any)?
  var onloadend: ((Event) -> Any)?
  var onloadstart: ((ProgressEvent) -> Any)?
  var onmousedown: ((MouseEvent) -> Any)?
  var onmouseenter: ((MouseEvent) -> Any)?
  var onmouseleave: ((MouseEvent) -> Any)?
  var onmousemove: ((MouseEvent) -> Any)?
  var onmouseout: ((MouseEvent) -> Any)?
  var onmouseover: ((MouseEvent) -> Any)?
  var onmouseup: ((MouseEvent) -> Any)?
  var onwheel: ((WheelEvent) -> Any)?
  var onpause: ((Event) -> Any)?
  var onplay: ((Event) -> Any)?
  var onplaying: ((Event) -> Any)?
  var onprogress: ((ProgressEvent) -> Any)?
  var onratechange: ((Event) -> Any)?
  var onreset: ((Event) -> Any)?
  var onresize: ((Event) -> Any)?
  var onscroll: ((Event) -> Any)?
  var onseeked: ((Event) -> Any)?
  var onseeking: ((Event) -> Any)?
  var onselect: ((Event) -> Any)?
  var onshow: ((Event) -> Any)?
  var onstalled: ((Event) -> Any)?
  var onsubmit: ((Event) -> Any)?
  var onsuspend: ((Event) -> Any)?
  var ontimeupdate: ((Event) -> Any)?
  var ontoggle: ((Event) -> Any)?
  var onvolumechange: ((Event) -> Any)?
  var onwaiting: ((Event) -> Any)?
  var ongotpointercapture: ((PointerEvent) -> Any)?
  var onlostpointercapture: ((PointerEvent) -> Any)?
  var onpointerdown: ((PointerEvent) -> Any)?
  var onpointermove: ((PointerEvent) -> Any)?
  var onpointerup: ((PointerEvent) -> Any)?
  var onpointercancel: ((PointerEvent) -> Any)?
  var onpointerover: ((PointerEvent) -> Any)?
  var onpointerout: ((PointerEvent) -> Any)?
  var onpointerenter: ((PointerEvent) -> Any)?
  var onpointerleave: ((PointerEvent) -> Any)?
}