package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.files.File

/**
 * Exposes the JavaScript [DataTransferItemList](https://developer.mozilla.org/en/docs/Web/API/DataTransferItemList) to Kotlin
 */
@NoWASM
expect abstract class DataTransferItemList {
  open val length: Int
  fun add(data: String, type: String): DataTransferItem?
  fun add(data: File): DataTransferItem?
  fun remove(index: Int)
  fun clear()
}

@NoWASM
expect operator fun DataTransferItemList.get(index: Int): DataTransferItem?
