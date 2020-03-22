package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [GeometryUtils](https://developer.mozilla.org/en/docs/Web/API/GeometryUtils) to Kotlin
 */
expect interface GeometryUtils {
  fun getBoxQuads(options: BoxQuadOptions): Array<DOMQuad>
  fun convertQuadFromNode(quad: Any, from: Any, options: ConvertCoordinateOptions): DOMQuad
  fun convertRectFromNode(rect: DOMRectReadOnly, from: Any, options: ConvertCoordinateOptions): DOMQuad
  fun convertPointFromNode(point: DOMPointInit, from: Any, options: ConvertCoordinateOptions): DOMPoint
}