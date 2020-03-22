package lt.petuska.kvdom.dom.w3c.dom

actual interface CloseEventInit : EventInit {
  actual var wasClean: Boolean?
  actual var code: Short?
  actual var reason: String?
}