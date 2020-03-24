package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.files.File

/**
 * Exposes the JavaScript [DataTransferItemList](https://developer.mozilla.org/en/docs/Web/API/DataTransferItemList) to Kotlin
 */
actual abstract external class DataTransferItemList {
  actual open val length: Int
  actual fun add(data: String, type: String): DataTransferItem?
  actual fun add(data: File): DataTransferItem?
  actual fun remove(index: Int)
  actual fun clear()
}

@Suppress("UnsafeCastFromDynamic")
actual operator fun DataTransferItemList.get(index: Int): DataTransferItem? = asDynamic()[index]