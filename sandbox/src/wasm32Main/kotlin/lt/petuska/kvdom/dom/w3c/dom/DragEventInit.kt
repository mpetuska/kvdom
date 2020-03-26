package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.events.MouseEventInit


actual interface DragEventInit : MouseEventInit {
  @NoWASM
  actual var dataTransfer: DataTransfer?
}