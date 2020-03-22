package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [GeometryUtils](https://developer.mozilla.org/en/docs/Web/API/GeometryUtils) to Kotlin
 */
actual interface GeometryUtils {
  actual fun getBoxQuads(options: BoxQuadOptions): Array<DOMQuad>
  actual fun convertQuadFromNode(
    quad: Any,
    from: Any,
    options: ConvertCoordinateOptions
  ): DOMQuad
  
  actual fun convertRectFromNode(
    rect: DOMRectReadOnly,
    from: Any,
    options: ConvertCoordinateOptions
  ): DOMQuad
  
  actual fun convertPointFromNode(
    point: DOMPointInit,
    from: Any,
    options: ConvertCoordinateOptions
  ): DOMPoint
}