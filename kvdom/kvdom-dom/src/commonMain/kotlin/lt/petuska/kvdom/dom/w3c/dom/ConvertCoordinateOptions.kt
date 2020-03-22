package lt.petuska.kvdom.dom.w3c.dom

expect interface ConvertCoordinateOptions {
  var fromBox: CSSBoxType? /* = CSSBoxType.BORDER */
  var toBox: CSSBoxType? /* = CSSBoxType.BORDER */
}

inline fun ConvertCoordinateOptions(
  fromBox: CSSBoxType? = CSSBoxType.BORDER,
  toBox: CSSBoxType? = CSSBoxType.BORDER
): ConvertCoordinateOptions = object : ConvertCoordinateOptions {
  override var fromBox: CSSBoxType? = fromBox
  override var toBox: CSSBoxType? = toBox
}
