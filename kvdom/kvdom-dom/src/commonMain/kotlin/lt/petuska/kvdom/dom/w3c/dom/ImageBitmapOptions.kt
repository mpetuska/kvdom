package lt.petuska.kvdom.dom.w3c.dom

expect interface ImageBitmapOptions {
  var imageOrientation: ImageOrientation? /* = ImageOrientation.NONE */
  var premultiplyAlpha: PremultiplyAlpha? /* = PremultiplyAlpha.DEFAULT */
  var colorSpaceConversion: ColorSpaceConversion? /* = ColorSpaceConversion.DEFAULT */
  var resizeWidth: Int?
  var resizeHeight: Int?
  var resizeQuality: ResizeQuality? /* = ResizeQuality.LOW */
}

inline fun ImageBitmapOptions(
  imageOrientation: ImageOrientation? = ImageOrientation.NONE,
  premultiplyAlpha: PremultiplyAlpha? = PremultiplyAlpha.DEFAULT,
  colorSpaceConversion: ColorSpaceConversion? = ColorSpaceConversion.DEFAULT,
  resizeWidth: Int? = null,
  resizeHeight: Int? = null,
  resizeQuality: ResizeQuality? = ResizeQuality.LOW
): ImageBitmapOptions = object : ImageBitmapOptions {
  override var imageOrientation: ImageOrientation? = imageOrientation
  override var premultiplyAlpha: PremultiplyAlpha? = premultiplyAlpha
  override var colorSpaceConversion: ColorSpaceConversion? = colorSpaceConversion
  override var resizeWidth: Int? = resizeWidth
  override var resizeHeight: Int? = resizeHeight
  override var resizeQuality: ResizeQuality? = resizeQuality
}
