package lt.petuska.kvdom.dom.w3c.dom

actual interface CanvasHitRegion {
  actual fun addHitRegion(options: HitRegionOptions)
  actual fun removeHitRegion(id: String)
  actual fun clearHitRegions()
}