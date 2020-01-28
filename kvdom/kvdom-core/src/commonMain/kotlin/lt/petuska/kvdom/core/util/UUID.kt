package lt.petuska.kvdom.core.util

object UUID {
    private var next = 0L
    fun next(): Long = next.also { next++ }
}