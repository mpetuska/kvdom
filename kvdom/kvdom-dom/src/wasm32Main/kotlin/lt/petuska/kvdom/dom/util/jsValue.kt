package lt.petuska.kvdom.dom.util

import kotlinx.wasm.jsinterop.*


fun JsValue.getObjProperty(name: String): JsValue? {
  val ptr = js_getObjProperty(arena, index, stringPointer(name), stringLengthBytes(name))
  return if (ptr < 0) null else JsValue(arena, ptr)
}

fun JsValue.setObjProperty(name: String, value: JsValue?) {
  js_setObjProperty(
    arena, index,
    stringPointer(name), stringLengthBytes(name),
    value?.arena ?: -1, value?.index ?: -1,
  )
}

fun JsValue.getIntProperty(name: String): Int {
  ArenaManager.currentArena = arena
  return getInt(name)
}

fun JsValue.getBooleanProperty(name: String): Boolean? {
  val res = js_getBooleanProperty(arena, index, stringPointer(name), stringLengthBytes(name))
  return when (res) {
    1 -> true
    0 -> false
    else -> null
  }
}

fun JsValue.getStringProperty(name: String): String? {
  val namePtr = stringPointer(name)
  val nameLen = stringLengthBytes(name)
  val propLength = js_getStringPropertyLength(arena, index, namePtr, nameLen)
  return if (propLength < 0) {
    null
  } else {
    Array(propLength) {
      js_getStringPropertyChar(arena, index, namePtr, nameLen, it).toChar()
    }.joinToString("")
  }
}

fun JsValue.setStringProperty(name: String, value: String?) {
  js_setStringProperty(
    arena, index,
    stringPointer(name), stringLengthBytes(name),
    value?.let { stringPointer(it) } ?: -1, value?.let { stringLengthBytes(it) } ?: -1
  )
}

@SymbolName("kvdom_JsValue_getStringPropertyLength")
private external fun js_getStringPropertyLength(
  arena: Arena,
  index: Object,
  namePtr: Pointer,
  nameLen: Int,
): Int

@SymbolName("kvdom_JsValue_getBooleanProperty")
private external fun js_getBooleanProperty(
  arena: Arena,
  index: Object,
  namePtr: Pointer,
  nameLen: Int,
): Int

@SymbolName("kvdom_JsValue_getObjProperty")
private external fun js_getObjProperty(
  arena: Arena,
  index: Object,
  namePtr: Pointer,
  nameLen: Int,
): Object

@SymbolName("kvdom_JsValue_setObjProperty")
private external fun js_setObjProperty(
  arena: Arena,
  index: Object,
  namePtr: Pointer,
  nameLen: Int,
  valueArena: Arena,
  valueIndex: Object,
)

@SymbolName("kvdom_JsValue_getStringPropertyChar")
private external fun js_getStringPropertyChar(
  arena: Arena,
  index: Object,
  namePtr: Pointer,
  nameLen: Int,
  charIndex: Int,
): Int

@SymbolName("kvdom_JsValue_setStringProperty")
private external fun js_setStringProperty(
  arena: Arena,
  index: Object,
  namePtr: Pointer,
  nameLen: Int,
  valuePtr: Pointer,
  valueLen: Int,
): Int
