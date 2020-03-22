package lt.petuska.kvdom.dom.w3c.dom

actual interface MediaQueryListEventInit : EventInit {
  actual var media: String?
  actual var matches: Boolean?
}