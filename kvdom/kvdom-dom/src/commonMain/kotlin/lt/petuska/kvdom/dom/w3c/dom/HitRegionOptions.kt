package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

expect interface HitRegionOptions {
  var path: Path2D? /* = null */
  var fillRule: CanvasFillRule? /* = CanvasFillRule.NONZERO */
  var id: String? /* = "" */
  var parentID: String? /* = null */
  var cursor: String? /* = "inherit" */
  
  @NoWASM
  var control: Element? /* = null */
  var label: String? /* = null */
  var role: String? /* = null */
}

@NoWASM
fun HitRegionOptions(
  path: Path2D? = null,
  fillRule: CanvasFillRule? = CanvasFillRule.NONZERO,
  id: String? = "",
  parentID: String? = null,
  cursor: String? = "inherit",
  control: Element? = null,
  label: String? = null,
  role: String? = null
): HitRegionOptions = object : HitRegionOptions {
  override var path: Path2D? = path
  override var fillRule: CanvasFillRule? = fillRule
  override var id: String? = id
  override var parentID: String? = parentID
  override var cursor: String? = cursor
  override var control: Element? = control
  override var label: String? = label
  override var role: String? = role
}