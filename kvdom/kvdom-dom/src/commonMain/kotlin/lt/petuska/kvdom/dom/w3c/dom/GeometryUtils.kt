package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic

/**
 * Exposes the JavaScript [GeometryUtils](https://developer.mozilla.org/en/docs/Web/API/GeometryUtils) to Kotlin
 */
expect interface GeometryUtils {
  fun getBoxQuads(options: BoxQuadOptions = BoxQuadOptions()): Array<DOMQuad>
  fun convertQuadFromNode(
    quad: Dynamic,
    from: Dynamic,
    options: ConvertCoordinateOptions = ConvertCoordinateOptions()
  ): DOMQuad
  
  fun convertRectFromNode(
    rect: DOMRectReadOnly,
    from: Dynamic,
    options: ConvertCoordinateOptions = ConvertCoordinateOptions()
  ): DOMQuad
  
  fun convertPointFromNode(
    point: DOMPointInit,
    from: Dynamic,
    options: ConvertCoordinateOptions = ConvertCoordinateOptions()
  ): DOMPoint
}