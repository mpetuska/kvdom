package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.clipboard.ClipboardEvent

expect interface DocumentAndElementEventHandlers {
  var oncopy: ((ClipboardEvent) -> Dynamic)?
  var oncut: ((ClipboardEvent) -> Dynamic)?
  var onpaste: ((ClipboardEvent) -> Dynamic)?
}