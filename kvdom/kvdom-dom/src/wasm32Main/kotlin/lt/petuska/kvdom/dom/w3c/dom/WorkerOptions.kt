package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.fetch.RequestCredentials

actual interface WorkerOptions {
  actual var type: WorkerType?
  actual var credentials: RequestCredentials?
}