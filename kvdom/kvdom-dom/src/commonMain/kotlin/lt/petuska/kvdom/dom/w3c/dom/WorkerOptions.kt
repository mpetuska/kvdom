package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.fetch.OMIT
import lt.petuska.kvdom.dom.w3c.fetch.RequestCredentials

expect interface WorkerOptions {
  var type: WorkerType? /* = WorkerType.CLASSIC */
  var credentials: RequestCredentials? /* = RequestCredentials.OMIT */
}

inline fun WorkerOptions(
  type: WorkerType? = WorkerType.CLASSIC,
  credentials: RequestCredentials? = RequestCredentials.OMIT
): WorkerOptions = object : WorkerOptions {
  override var type: WorkerType? = type
  override var credentials: RequestCredentials? = credentials
}
