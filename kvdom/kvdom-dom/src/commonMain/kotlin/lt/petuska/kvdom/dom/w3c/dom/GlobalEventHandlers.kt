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
expect interface GlobalEventHandlers {
  var onabort: ((Event) -> Dynamic)?
  var onblur: ((FocusEvent) -> Dynamic)?
  var oncancel: ((Event) -> Dynamic)?
  var oncanplay: ((Event) -> Dynamic)?
  var oncanplaythrough: ((Event) -> Dynamic)?
  var onchange: ((Event) -> Dynamic)?
  var onclick: ((MouseEvent) -> Dynamic)?
  var onclose: ((Event) -> Dynamic)?
  var oncontextmenu: ((MouseEvent) -> Dynamic)?
  var oncuechange: ((Event) -> Dynamic)?
  var ondblclick: ((MouseEvent) -> Dynamic)?
  var ondrag: ((DragEvent) -> Dynamic)?
  var ondragend: ((DragEvent) -> Dynamic)?
  var ondragenter: ((DragEvent) -> Dynamic)?
  var ondragexit: ((DragEvent) -> Dynamic)?
  var ondragleave: ((DragEvent) -> Dynamic)?
  var ondragover: ((DragEvent) -> Dynamic)?
  var ondragstart: ((DragEvent) -> Dynamic)?
  var ondrop: ((DragEvent) -> Dynamic)?
  var ondurationchange: ((Event) -> Dynamic)?
  var onemptied: ((Event) -> Dynamic)?
  var onended: ((Event) -> Dynamic)?
  var onerror: ((Dynamic, String, Int, Int, Any?) -> Dynamic)?
  var onfocus: ((FocusEvent) -> Dynamic)?
  var oninput: ((InputEvent) -> Dynamic)?
  var oninvalid: ((Event) -> Dynamic)?
  var onkeydown: ((KeyboardEvent) -> Dynamic)?
  var onkeypress: ((KeyboardEvent) -> Dynamic)?
  var onkeyup: ((KeyboardEvent) -> Dynamic)?
  var onload: ((Event) -> Dynamic)?
  var onloadeddata: ((Event) -> Dynamic)?
  var onloadedmetadata: ((Event) -> Dynamic)?
  var onloadend: ((Event) -> Dynamic)?
  var onloadstart: ((ProgressEvent) -> Dynamic)?
  var onmousedown: ((MouseEvent) -> Dynamic)?
  var onmouseenter: ((MouseEvent) -> Dynamic)?
  var onmouseleave: ((MouseEvent) -> Dynamic)?
  var onmousemove: ((MouseEvent) -> Dynamic)?
  var onmouseout: ((MouseEvent) -> Dynamic)?
  var onmouseover: ((MouseEvent) -> Dynamic)?
  var onmouseup: ((MouseEvent) -> Dynamic)?
  var onwheel: ((WheelEvent) -> Dynamic)?
  var onpause: ((Event) -> Dynamic)?
  var onplay: ((Event) -> Dynamic)?
  var onplaying: ((Event) -> Dynamic)?
  var onprogress: ((ProgressEvent) -> Dynamic)?
  var onratechange: ((Event) -> Dynamic)?
  var onreset: ((Event) -> Dynamic)?
  var onresize: ((Event) -> Dynamic)?
  var onscroll: ((Event) -> Dynamic)?
  var onseeked: ((Event) -> Dynamic)?
  var onseeking: ((Event) -> Dynamic)?
  var onselect: ((Event) -> Dynamic)?
  var onshow: ((Event) -> Dynamic)?
  var onstalled: ((Event) -> Dynamic)?
  var onsubmit: ((Event) -> Dynamic)?
  var onsuspend: ((Event) -> Dynamic)?
  var ontimeupdate: ((Event) -> Dynamic)?
  var ontoggle: ((Event) -> Dynamic)?
  var onvolumechange: ((Event) -> Dynamic)?
  var onwaiting: ((Event) -> Dynamic)?
  var ongotpointercapture: ((PointerEvent) -> Dynamic)?
  var onlostpointercapture: ((PointerEvent) -> Dynamic)?
  var onpointerdown: ((PointerEvent) -> Dynamic)?
  var onpointermove: ((PointerEvent) -> Dynamic)?
  var onpointerup: ((PointerEvent) -> Dynamic)?
  var onpointercancel: ((PointerEvent) -> Dynamic)?
  var onpointerover: ((PointerEvent) -> Dynamic)?
  var onpointerout: ((PointerEvent) -> Dynamic)?
  var onpointerenter: ((PointerEvent) -> Dynamic)?
  var onpointerleave: ((PointerEvent) -> Dynamic)?
}