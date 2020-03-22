package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Slotable](https://developer.mozilla.org/en/docs/Web/API/Slotable) to Kotlin
 */
expect interface Slotable {
  val assignedSlot: HTMLSlotElement?
}