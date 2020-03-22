package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [WorkerLocation](https://developer.mozilla.org/en/docs/Web/API/WorkerLocation) to Kotlin
 */
expect abstract class WorkerLocation() {
  open val href: String
  open val origin: String
  open val protocol: String
  open val host: String
  open val hostname: String
  open val port: String
  open val pathname: String
  open val search: String
  open val hash: String
}