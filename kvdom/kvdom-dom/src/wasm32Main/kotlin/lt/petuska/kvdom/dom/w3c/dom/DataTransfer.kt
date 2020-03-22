package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.files.FileList

/**
 * Exposes the JavaScript [DataTransfer](https://developer.mozilla.org/en/docs/Web/API/DataTransfer) to Kotlin
 */
actual abstract class DataTransfer actual constructor() {
  actual open var dropEffect: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open var effectAllowed: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val items: DataTransferItemList
    get() = TODO("Not yet implemented")
  actual open val types: Array<out String>
    get() = TODO("Not yet implemented")
  actual open val files: FileList
    get() = TODO("Not yet implemented")
  
  actual fun setDragImage(image: Element, x: Int, y: Int) {
  }
  
  actual fun getData(format: String): String {
    TODO("Not yet implemented")
  }
  
  actual fun setData(format: String, data: String) {
  }
  
  actual fun clearData(format: String) {
  }
}