package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.fetch.Promise

actual interface PromiseRejectionEventInit : EventInit {
  actual var promise: Promise<Any?>?
  actual var reason: Any?
}