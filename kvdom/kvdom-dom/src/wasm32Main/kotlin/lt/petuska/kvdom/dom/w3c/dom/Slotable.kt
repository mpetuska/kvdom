package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Slotable](https://developer.mozilla.org/en/docs/Web/API/Slotable) to Kotlin
 */
actual interface Slotable {
  actual val assignedSlot: HTMLSlotElement?
}