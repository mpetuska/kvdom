package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.MouseEventInit

actual external interface DragEventInit : MouseEventInit {
  actual var dataTransfer: DataTransfer?
}