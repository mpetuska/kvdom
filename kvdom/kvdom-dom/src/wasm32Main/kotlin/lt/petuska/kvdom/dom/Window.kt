package lt.petuska.kvdom.dom

import kotlinx.wasm.jsinterop.Arena
import kotlinx.wasm.jsinterop.Object

actual abstract class Window(arena: Arena, index: Object) : EventTarget(arena, index), WindowOrWorkerGlobalScope