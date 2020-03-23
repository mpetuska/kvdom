package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic

/**
 * Exposes the JavaScript [GeometryUtils](https://developer.mozilla.org/en/docs/Web/API/GeometryUtils) to Kotlin
 */
actual interface GeometryUtils {
  actual fun getBoxQuads(options: BoxQuadOptions): Array<DOMQuad>
  actual fun convertQuadFromNode(quad: Dynamic, from: Dynamic, options: ConvertCoordinateOptions): DOMQuad
  actual fun convertRectFromNode(rect: DOMRectReadOnly, from: Dynamic, options: ConvertCoordinateOptions): DOMQuad
  actual fun convertPointFromNode(point: DOMPointInit, from: Dynamic, options: ConvertCoordinateOptions): DOMPoint
}