package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.files.FileList

/**
 * Exposes the JavaScript [DataTransfer](https://developer.mozilla.org/en/docs/Web/API/DataTransfer) to Kotlin
 */
actual abstract external class DataTransfer {
  actual open var dropEffect: String
  actual open var effectAllowed: String
  actual open val items: DataTransferItemList
  actual open val types: Array<out String>
  actual open val files: FileList
  actual fun setDragImage(image: Element, x: Int, y: Int)
  actual fun getData(format: String): String
  actual fun setData(format: String, data: String)
  actual fun clearData(format: String)
  actual fun clearData()
}