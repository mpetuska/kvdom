package lt.petuska.kvdom.dom.w3c.dom

expect interface CanvasDrawImage {
  fun drawImage(image: CanvasImageSource, dx: Double, dy: Double)
  fun drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double)
  fun drawImage(
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