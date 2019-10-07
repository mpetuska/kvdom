package lt.petuska.kvdom.jsexternal

actual fun <T> T?.exists(): T? = takeIf { it != null && it != undefined }