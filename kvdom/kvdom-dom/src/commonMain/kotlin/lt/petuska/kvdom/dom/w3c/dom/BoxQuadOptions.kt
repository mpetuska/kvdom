package lt.petuska.kvdom.dom.w3c.dom

expect interface BoxQuadOptions {
  var box: CSSBoxType? /* = CSSBoxType.BORDER */
  var relativeTo: Any?
}

inline fun BoxQuadOptions(box: CSSBoxType? = CSSBoxType.BORDER, relativeTo: Any? = null): BoxQuadOptions =
  object : BoxQuadOptions {
    override var box: CSSBoxType? = box
    override var relativeTo: Any? = relativeTo
  }
