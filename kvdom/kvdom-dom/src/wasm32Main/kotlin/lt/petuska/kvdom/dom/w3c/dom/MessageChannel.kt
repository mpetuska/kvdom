package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MessageChannel](https://developer.mozilla.org/en/docs/Web/API/MessageChannel) to Kotlin
 */
actual open class MessageChannel actual constructor() {
  actual open val port1: MessagePort
    get() = TODO("Not yet implemented")
  actual open val port2: MessagePort
    get() = TODO("Not yet implemented")
}