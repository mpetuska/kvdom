package lt.petuska.kvdom.dom.w3c.dom

actual interface HashChangeEventInit : EventInit {
  actual var oldURL: String?
  actual var newURL: String?
}