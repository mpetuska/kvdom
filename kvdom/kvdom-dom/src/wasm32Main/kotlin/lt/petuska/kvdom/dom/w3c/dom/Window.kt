package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.css.CSSStyleDeclaration
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.performance.GlobalPerformance

/**
 * Exposes the JavaScript [Window](https://developer.mozilla.org/en/docs/Web/API/Window) to Kotlin
 */
actual abstract class Window actual constructor() : EventTarget(),
  GlobalEventHandlers,
  WindowEventHandlers,
  WindowOrWorkerGlobalScope,
  WindowSessionStorage,
  WindowLocalStorage, GlobalPerformance,
  UnionMessagePortOrWindowProxy {
  actual open val window: Window
    get() = TODO("Not yet implemented")
  actual open val self: Window
    get() = TODO("Not yet implemented")
  actual open val document: Document
    get() = TODO("Not yet implemented")
  actual open var name: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val location: Location
    get() = TODO("Not yet implemented")
  actual open val history: History
    get() = TODO("Not yet implemented")
  actual open val customElements: CustomElementRegistry
    get() = TODO("Not yet implemented")
  actual open val locationbar: BarProp
    get() = TODO("Not yet implemented")
  actual open val menubar: BarProp
    get() = TODO("Not yet implemented")
  actual open val personalbar: BarProp
    get() = TODO("Not yet implemented")
  actual open val scrollbars: BarProp
    get() = TODO("Not yet implemented")
  actual open val statusbar: BarProp
    get() = TODO("Not yet implemented")
  actual open val toolbar: BarProp
    get() = TODO("Not yet implemented")
  actual open var status: String
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val closed: Boolean
    get() = TODO("Not yet implemented")
  actual open val frames: Window
    get() = TODO("Not yet implemented")
  actual open val length: Int
    get() = TODO("Not yet implemented")
  actual open val top: Window
    get() = TODO("Not yet implemented")
  actual open var opener: Any?
    get() = TODO("Not yet implemented")
    set(value) {}
  actual open val parent: Window
    get() = TODO("Not yet implemented")
  actual open val frameElement: Element?
    get() = TODO("Not yet implemented")
  actual open val navigator: Navigator
    get() = TODO("Not yet implemented")
  actual open val applicationCache: ApplicationCache
    get() = TODO("Not yet implemented")
  actual open val external: External
    get() = TODO("Not yet implemented")
  actual open val screen: Screen
    get() = TODO("Not yet implemented")
  actual open val innerWidth: Int
    get() = TODO("Not yet implemented")
  actual open val innerHeight: Int
    get() = TODO("Not yet implemented")
  actual open val scrollX: Double
    get() = TODO("Not yet implemented")
  actual open val pageXOffset: Double
    get() = TODO("Not yet implemented")
  actual open val scrollY: Double
    get() = TODO("Not yet implemented")
  actual open val pageYOffset: Double
    get() = TODO("Not yet implemented")
  actual open val screenX: Int
    get() = TODO("Not yet implemented")
  actual open val screenY: Int
    get() = TODO("Not yet implemented")
  actual open val outerWidth: Int
    get() = TODO("Not yet implemented")
  actual open val outerHeight: Int
    get() = TODO("Not yet implemented")
  actual open val devicePixelRatio: Double
    get() = TODO("Not yet implemented")
  
  actual fun close() {
  }
  
  actual fun stop() {
  }
  
  actual fun focus() {
  }
  
  actual fun blur() {
  }
  
  actual fun open(
    url: String,
    target: String,
    features: String
  ): Window? {
    TODO("Not yet implemented")
  }
  
  actual fun alert() {
  }
  
  actual fun alert(message: String) {
  }
  
  actual fun confirm(message: String): Boolean {
    TODO("Not yet implemented")
  }
  
  actual fun prompt(message: String, default: String): String? {
    TODO("Not yet implemented")
  }
  
  actual fun print() {
  }
  
  actual fun requestAnimationFrame(callback: (Double) -> Unit): Int {
    TODO("Not yet implemented")
  }
  
  actual fun cancelAnimationFrame(handle: Int) {
  }
  
  actual fun postMessage(message: Any?, targetOrigin: String, transfer: Array<Any>) {
  }
  
  actual fun captureEvents() {
  }
  
  actual fun releaseEvents() {
  }
  
  actual fun matchMedia(query: String): MediaQueryList {
    TODO("Not yet implemented")
  }
  
  actual fun moveTo(x: Int, y: Int) {
  }
  
  actual fun moveBy(x: Int, y: Int) {
  }
  
  actual fun resizeTo(x: Int, y: Int) {
  }
  
  actual fun resizeBy(x: Int, y: Int) {
  }
  
  actual fun scroll(options: ScrollToOptions) {
  }
  
  actual fun scroll(x: Double, y: Double) {
  }
  
  actual fun scrollTo(options: ScrollToOptions) {
  }
  
  actual fun scrollTo(x: Double, y: Double) {
  }
  
  actual fun scrollBy(options: ScrollToOptions) {
  }
  
  actual fun scrollBy(x: Double, y: Double) {
  }
  
  actual fun getComputedStyle(
    elt: Element,
    pseudoElt: String?
  ): CSSStyleDeclaration {
    TODO("Not yet implemented")
  }
}

actual inline operator fun Window.get(name: String): Any {
  TODO("Not yet implemented")
}