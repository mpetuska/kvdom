package lt.petuska.kvdom.dom.w3c.dom

actual interface StorageEventInit : EventInit {
  actual var key: String?
  actual var oldValue: String?
  actual var newValue: String?
  actual var url: String?
  actual var storageArea: Storage?
}