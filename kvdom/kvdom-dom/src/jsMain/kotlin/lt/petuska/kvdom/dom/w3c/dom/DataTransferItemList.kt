package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

/**
 * Exposes the JavaScript [DataTransferItemList](https://developer.mozilla.org/en/docs/Web/API/DataTransferItemList) to Kotlin
 */
actual typealias DataTransferItemList = org.w3c.dom.DataTransferItemList

actual inline operator fun DataTransferItemList.get(index: Int): DataTransferItem? = get(index)