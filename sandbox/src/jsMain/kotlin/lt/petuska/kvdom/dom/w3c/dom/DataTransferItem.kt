package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.files.File

/**
 * Exposes the JavaScript [DataTransferItem](https://developer.mozilla.org/en/docs/Web/API/DataTransferItem) to Kotlin
 */
actual abstract external class DataTransferItem {
  actual open val kind: String
  actual open val type: String
  actual fun getAsString(_callback: ((String) -> Unit)?)
  actual fun getAsFile(): File?
}