package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasImageData {
  fun createImageData(sw: Double, sh: Double): ImageData
  fun createImageData(imagedata: ImageData): ImageData
  fun getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData
  fun putImageData(imagedata: ImageData, dx: Double, dy: Double)
  fun putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: Double,
    dirtyWidth: Double,
    dirtyHeight: Double
  )
}