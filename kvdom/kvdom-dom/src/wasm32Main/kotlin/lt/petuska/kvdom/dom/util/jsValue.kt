package lt.petuska.kvdom.dom.util

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.ArenaManager
import kotlinx.wasm.jsinterop.JsValue
import kotlinx.wasm.jsinterop.Object
import kotlinx.wasm.jsinterop.Pointer
import kotlinx.wasm.jsinterop.stringLengthBytes
import kotlinx.wasm.jsinterop.stringPointer


fun JsValue.getObjProperty(name: String): JsValue {
  ArenaManager.currentArena = arena
  val jsProp = getProperty(name)
  return JsValue(jsProp.arena, jsProp.index)
}

fun JsValue.getIntProperty(name: String): Int {
  ArenaManager.currentArena = arena
  return getInt(name)
}

fun JsValue.getStringProperty(name: String): String? {
  val namePtr = stringPointer(name)
  val nameLen = stringLengthBytes(name)
  val propLength = js_JsObject_getStringPropertyLength(arena, index, namePtr, nameLen)
  return if (propLength < 0) {
    null
  } else {
    Array(propLength) {
      js_JsObject_getStringPropertyChar(arena, index, namePtr, nameLen, it).toChar()
    }.joinToString("")
  }
}

fun JsValue.setStringProperty(name: String, value: String?) {
  js_JsObject_setStringProperty(
    arena, index,
    stringPointer(name), stringLengthBytes(name),
    value?.let { stringPointer(it) } ?: -1, value?.let { stringLengthBytes(it) } ?: -1
  )
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

@SymbolName("kvdom_JsObject_setStringProperty")
private external fun js_JsObject_setStringProperty(
  arena: Arena,
  index: Object,
  namePtr: Pointer,
  nameLen: Int,
  valuePtr: Pointer,
  valueLen: Int
): Int