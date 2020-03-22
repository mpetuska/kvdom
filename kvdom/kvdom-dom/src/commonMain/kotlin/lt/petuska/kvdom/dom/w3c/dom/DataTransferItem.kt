package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.files.File

/**
 * Exposes the JavaScript [DataTransferItem](https://developer.mozilla.org/en/docs/Web/API/DataTransferItem) to Kotlin
 */
expect abstract class DataTransferItem() {
  open val kind: String
  open val type: String
  fun getAsString(_callback: ((String) -> Unit)?)
  fun getAsFile(): File?
}