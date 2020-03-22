package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.clipboard.ClipboardEvent

actual interface DocumentAndElementEventHandlers {
  actual var oncopy: ((ClipboardEvent) -> Any)?
  actual var oncut: ((ClipboardEvent) -> Any)?
  actual var onpaste: ((ClipboardEvent) -> Any)?
}