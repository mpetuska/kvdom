package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.files.File

/**
 * Exposes the JavaScript [DataTransferItem](https://developer.mozilla.org/en/docs/Web/API/DataTransferItem) to Kotlin
 */
actual abstract class DataTransferItem actual constructor() {
  actual open val kind: String
    get() = TODO("Not yet implemented")
  actual open val type: String
    get() = TODO("Not yet implemented")
  
  actual fun getAsString(_callback: ((String) -> Unit)?) {
  }
  
  actual fun getAsFile(): File? {
    TODO("Not yet implemented")
  }
}