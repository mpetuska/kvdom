package lt.petuska.kvdom.util

fun <T> List<T>.safeSlice(range: IntRange): List<T> = takeIf {
    range.all { r -> it.indices.contains(r) }
}?.run {
    slice(range)
} ?: listOf()