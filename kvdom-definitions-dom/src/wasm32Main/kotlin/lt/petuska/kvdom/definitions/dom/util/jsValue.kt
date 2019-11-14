package lt.petuska.kvdom.definitions.dom.util

import kotlinx.wasm.jsinterop.*


fun JsValue.getObjProperty(name: String): JsValue {
    ArenaManager.currentArena = arena
    val jsProp = getProperty(name)
    return JsValue(jsProp.arena, jsProp.index)
}

fun JsValue.getIntProperty(name: String): Int {
    ArenaManager.currentArena = arena
    return getInt(name)
}

fun JsValue.getStringProperty(name: String): String {
    val namePtr = stringPointer(name)
    val nameLen = stringLengthBytes(name)
    val propLength = js_JsObject_getStringPropertyLength(arena, index, namePtr, nameLen)
    return Array(propLength) {
        js_JsObject_getStringPropertyChar(arena, index, namePtr, nameLen, it).toChar()
    }.joinToString("")
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