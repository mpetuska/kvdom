package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasHitRegion {
  fun addHitRegion(options: HitRegionOptions)
  fun removeHitRegion(id: String)
  fun clearHitRegions()
}