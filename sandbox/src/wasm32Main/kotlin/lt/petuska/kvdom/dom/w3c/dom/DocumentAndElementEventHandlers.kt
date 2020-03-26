package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.clipboard.ClipboardEvent

actual interface DocumentAndElementEventHandlers {
  actual var oncopy: ((ClipboardEvent) -> Dynamic)?
  actual var oncut: ((ClipboardEvent) -> Dynamic)?
  actual var onpaste: ((ClipboardEvent) -> Dynamic)?
}