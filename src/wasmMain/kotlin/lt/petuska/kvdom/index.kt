package lt.petuska.kvdom

import kotlinx.interop.wasm.dom.document

fun main(args: Array<String>) {
    val index = document.getElementById("root").getProperty("id")
    println("OK: $index")
}