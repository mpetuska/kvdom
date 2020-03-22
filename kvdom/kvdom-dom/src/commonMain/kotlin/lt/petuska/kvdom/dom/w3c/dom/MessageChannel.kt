package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MessageChannel](https://developer.mozilla.org/en/docs/Web/API/MessageChannel) to Kotlin
 */
expect open class MessageChannel() {
  open val port1: MessagePort
  open val port2: MessagePort
}