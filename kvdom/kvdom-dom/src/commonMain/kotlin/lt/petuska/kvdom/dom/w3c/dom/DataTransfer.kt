package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.files.FileList

/**
 * Exposes the JavaScript [DataTransfer](https://developer.mozilla.org/en/docs/Web/API/DataTransfer) to Kotlin
 */
@NoWASM
expect abstract class DataTransfer {
  open var dropEffect: String
  open var effectAllowed: String
  open val items: DataTransferItemList
  open val types: Array<out String>
  open val files: FileList
  fun setDragImage(image: Element, x: Int, y: Int)
  fun getData(format: String): String
  fun setData(format: String, data: String)
  fun clearData(format: String)
  fun clearData()
}