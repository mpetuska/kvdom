package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [MutationObserver](https://developer.mozilla.org/en/docs/Web/API/MutationObserver) to Kotlin
 */
actual open class MutationObserver actual constructor(callback: (Array<MutationRecord>, MutationObserver) -> Unit) {
  actual fun observe(
    target: Node,
    options: MutationObserverInit
  ) {
  }
  
  actual fun disconnect() {
  }
  
  actual fun takeRecords(): Array<MutationRecord> {
    TODO("Not yet implemented")
  }
}