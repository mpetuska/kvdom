package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.clipboard.ClipboardEvent

expect interface DocumentAndElementEventHandlers {
  var oncopy: ((ClipboardEvent) -> Any)?
  var oncut: ((ClipboardEvent) -> Any)?
  var onpaste: ((ClipboardEvent) -> Any)?
}