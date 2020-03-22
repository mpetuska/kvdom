package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [WorkerLocation](https://developer.mozilla.org/en/docs/Web/API/WorkerLocation) to Kotlin
 */
actual abstract class WorkerLocation actual constructor() {
  actual open val href: String
    get() = TODO("Not yet implemented")
  actual open val origin: String
    get() = TODO("Not yet implemented")
  actual open val protocol: String
    get() = TODO("Not yet implemented")
  actual open val host: String
    get() = TODO("Not yet implemented")
  actual open val hostname: String
    get() = TODO("Not yet implemented")
  actual open val port: String
    get() = TODO("Not yet implemented")
  actual open val pathname: String
    get() = TODO("Not yet implemented")
  actual open val search: String
    get() = TODO("Not yet implemented")
  actual open val hash: String
    get() = TODO("Not yet implemented")
}