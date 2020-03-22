package lt.petuska.kvdom.dom.w3c.dom

actual interface ErrorEventInit : EventInit {
  actual var message: String?
  actual var filename: String?
  actual var lineno: Int?
  actual var colno: Int?
  actual var error: Any?
}