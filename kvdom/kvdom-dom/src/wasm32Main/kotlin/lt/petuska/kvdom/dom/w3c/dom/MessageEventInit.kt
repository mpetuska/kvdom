package lt.petuska.kvdom.dom.w3c.dom

actual interface MessageEventInit : EventInit {
  actual var data: Any?
  actual var origin: String?
  actual var lastEventId: String?
  actual var source: UnionMessagePortOrWindowProxy?
  actual var ports: Array<MessagePort>?
}