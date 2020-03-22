package lt.petuska.kvdom.dom.w3c.dom

actual interface ImageBitmapOptions {
  actual var imageOrientation: ImageOrientation?
  actual var premultiplyAlpha: PremultiplyAlpha?
  actual var colorSpaceConversion: ColorSpaceConversion?
  actual var resizeWidth: Int?
  actual var resizeHeight: Int?
  actual var resizeQuality: ResizeQuality?
}