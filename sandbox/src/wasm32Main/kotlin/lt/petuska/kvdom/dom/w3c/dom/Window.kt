package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.NoWASM
import lt.petuska.kvdom.dom.w3c.dom.css.CSSStyleDeclaration
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.performance.GlobalPerformance

/**
 * Exposes the JavaScript [Window](https://developer.mozilla.org/en/docs/Web/API/Window) to Kotlin
 */
@NoWASM
actual abstract class Window : EventTarget(), GlobalEventHandlers,
  WindowEventHandlers,
  WindowOrWorkerGlobalScope,
  WindowSessionStorage,
  WindowLocalStorage, GlobalPerformance,
  UnionMessagePortOrWindowProxy {
  actual open val window: Window = TODO()
  actual open val self: Window = TODO()
  actual open val document: Document = TODO()
  actual open var name: String = TODO()
  actual open val location: Location = TODO()
  actual open val history: History = TODO()
  actual open val customElements: CustomElementRegistry = TODO()
  actual open val locationbar: BarProp = TODO()
  actual open val menubar: BarProp = TODO()
  actual open val personalbar: BarProp = TODO()
  actual open val scrollbars: BarProp = TODO()
  actual open val statusbar: BarProp = TODO()
  actual open val toolbar: BarProp = TODO()
  actual open var status: String = TODO()
  actual open val closed: Boolean = TODO()
  actual open val frames: Window = TODO()
  actual open val length: Int = TODO()
  actual open val top: Window = TODO()
  actual open var opener: Any? = TODO()
  actual open val parent: Window = TODO()
  actual open val frameElement: Element? = TODO()
  actual open val navigator: Navigator = TODO()
  actual open val applicationCache: ApplicationCache = TODO()
  actual open val expect: External = TODO()
  actual open val screen: Screen = TODO()
  actual open val innerWidth: Int = TODO()
  actual open val innerHeight: Int = TODO()
  actual open val scrollX: Double = TODO()
  actual open val pageXOffset: Double = TODO()
  actual open val scrollY: Double = TODO()
  actual open val pageYOffset: Double = TODO()
  actual open val screenX: Int = TODO()
  actual open val screenY: Int = TODO()
  actual open val outerWidth: Int = TODO()
  actual open val outerHeight: Int = TODO()
  actual open val devicePixelRatio: Double = TODO()
  actual fun close() {
    TODO()
  }
  
  actual fun stop() {
    TODO()
  }
  
  actual fun focus() {
    TODO()
  }
  
  actual fun blur() {
    TODO()
  }
  
  actual fun open(
    url: String,
    target: String,
    features: String
  ): Window? {
    TODO()
  }
  
  actual fun alert() {
    TODO()
  }
  
  actual fun alert(message: String) {
    TODO()
  }
  
  actual fun confirm(message: String): Boolean {
    TODO()
  }
  
  actual fun prompt(message: String, default: String): String? {
    TODO()
  }
  
  actual fun print() {
    TODO()
  }
  
  actual fun requestAnimationFrame(callback: (String) -> Unit): Int {
    TODO()
  }
  
  actual fun cancelAnimationFrame(handle: Int) {
    TODO()
  }
  
  actual fun postMessage(message: Any?, targetOrigin: String, transfer: Array<Dynamic>) {
    TODO()
  }
  
  actual fun captureEvents() {
    TODO()
  }
  
  actual fun releaseEvents() {
    TODO()
  }
  
  actual fun matchMedia(query: String): MediaQueryList {
    TODO()
  }
  
  actual fun moveTo(x: Int, y: Int) {
    TODO()
  }
  
  actual fun moveBy(x: Int, y: Int) {
    TODO()
  }
  
  actual fun resizeTo(x: Int, y: Int) {
    TODO()
  }
  
  actual fun resizeBy(x: Int, y: Int) {
    TODO()
  }
  
  actual fun scroll(options: ScrollToOptions) {
    TODO()
  }
  
  actual fun scroll(x: Double, y: Double) {
    TODO()
  }
  
  actual fun scrollTo(options: ScrollToOptions) {
    TODO()
  }
  
  actual fun scrollTo(x: Double, y: Double) {
    TODO()
  }
  
  actual fun scrollBy(options: ScrollToOptions) {
    TODO()
  }
  
  actual fun scrollBy(x: Double, y: Double) {
    TODO()
  }
  
  actual fun getComputedStyle(elt: Element, pseudoElt: String?): CSSStyleDeclaration {
    TODO()
  }
}

@NoWASM
actual operator fun Window.get(name: String): Dynamic {
  TODO()
}