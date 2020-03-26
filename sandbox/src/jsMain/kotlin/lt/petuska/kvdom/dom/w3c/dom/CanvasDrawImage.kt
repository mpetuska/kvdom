package lt.petuska.kvdom.dom.w3c.dom

actual external interface CanvasDrawImage {
  actual fun drawImage(image: CanvasImageSource, dx: Double, dy: Double)
  actual fun drawImage(
    image: CanvasImageSource,
    dx: Double,
    dy: Double,
    dw: Double,
    dh: Double
  )
  
  actual fun drawImage(
    image: CanvasImageSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    dx: Double,
    dy: Double,
    dw: Double,
    dh: Double
  )
}