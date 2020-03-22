package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MutationObserver](https://developer.mozilla.org/en/docs/Web/API/MutationObserver) to Kotlin
 */
expect open class MutationObserver(callback: (Array<MutationRecord>, MutationObserver) -> Unit) {
  fun observe(target: Node, options: MutationObserverInit)
  fun disconnect()
  fun takeRecords(): Array<MutationRecord>
}