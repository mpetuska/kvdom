package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.files.File

/**
 * Exposes the JavaScript [DataTransferItemList](https://developer.mozilla.org/en/docs/Web/API/DataTransferItemList) to Kotlin
 */
@NoWASM
actual abstract class DataTransferItemList {
  actual open val length: Int
    get() = TODO("Not yet implemented")
  
  actual fun add(data: String, type: String): DataTransferItem? {
    TODO("Not yet implemented")
  }
  
  actual fun add(data: File): DataTransferItem? {
    TODO("Not yet implemented")
  }
  
  actual fun remove(index: Int) {
  }
  
  actual fun clear() {
  }
}

@NoWASM
actual operator fun DataTransferItemList.get(index: Int): DataTransferItem? {
  TODO("Not yet implemented")
}