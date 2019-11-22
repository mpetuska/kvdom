package lt.petuska.kvdom.core.util

fun <T> List<T>.safeSlice(range: IntRange): List<T> = takeIf {
    range.all { r -> it.indices.contains(r) }
}?.run {
    slice(range)
} ?: listOf()