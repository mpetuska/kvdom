package lt.petuska.kvdom.dom.w3c.dom

actual interface CanvasImageData {
  actual fun createImageData(sw: Double, sh: Double): ImageData
  actual fun createImageData(imagedata: ImageData): ImageData
  actual fun getImageData(
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double
  ): ImageData
  
  actual fun putImageData(imagedata: ImageData, dx: Double, dy: Double)
  actual fun putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: Double,
    dirtyWidth: Double,
    dirtyHeight: Double
  )
}