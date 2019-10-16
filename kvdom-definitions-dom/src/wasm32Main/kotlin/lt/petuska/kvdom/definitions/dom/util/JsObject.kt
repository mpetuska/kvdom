package lt.petuska.kvdom.definitions.dom.util

import kotlinx.wasm.jsinterop.*

open class JsObject(arena: Arena, index: Object) : JsValue(arena, index) {
    fun getObjProperty(name: String): JsObject {
        ArenaManager.currentArena = arena
        val jsProp = getProperty(name)
        return JsObject(jsProp.arena, jsProp.index)
    }

    fun getIntProperty(name: String): Int {
        ArenaManager.currentArena = arena
        return getInt(name)
    }

    fun getStringProperty(name: String): String {
        val namePtr = stringPointer(name)
        val nameLen = stringLengthBytes(name)
        val propLength = js_JsObject_getStringPropertyLength(arena, index, namePtr, nameLen)
        return Array(propLength) {
            js_JsObject_getStringPropertyChar(arena, index, namePtr, nameLen, it).toChar()
        }.joinToString("")
    }
}

@SymbolName("kvdom_JsObject_getStringPropertyLength")
private external fun js_JsObject_getStringPropertyLength(
    arena: Arena,
    index: Object,
    namePtr: Pointer,
    nameLen: Int
): Int

@SymbolName("kvdom_JsObject_getStringPropertyChar")
private external fun js_JsObject_getStringPropertyChar(
    arena: Arena,
    index: Object,
    namePtr: Pointer,
    nameLen: Int,
    charIndex: Int
): Int