package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [CanvasRenderingContext2D](https://developer.mozilla.org/en/docs/Web/API/CanvasRenderingContext2D) to Kotlin
 */
@NoWASM
actual abstract class CanvasRenderingContext2D : CanvasState,
  CanvasTransform,
  CanvasCompositing,
  CanvasImageSmoothing,
  CanvasFillStrokeStyles,
  CanvasShadowStyles,
  CanvasFilters,
  CanvasRect,
  CanvasDrawPath,
  CanvasUserInterface,
  CanvasText,
  CanvasDrawImage,
  CanvasHitRegion,
  CanvasImageData,
  CanvasPathDrawingStyles,
  CanvasTextDrawingStyles,
  CanvasPath,
  RenderingContext {
  actual open val canvas: HTMLCanvasElement
    get() = TODO("Not yet implemented")
}