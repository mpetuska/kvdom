package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

actual interface HitRegionOptions {
  actual var path: Path2D?
  actual var fillRule: CanvasFillRule?
  actual var id: String?
  actual var parentID: String?
  actual var cursor: String?
  
  @NoWASM
  actual var control: Element?
  actual var label: String?
  actual var role: String?
  
}