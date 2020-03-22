package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.css.CSSStyleDeclaration
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.performance.GlobalPerformance

/**
 * Exposes the JavaScript [Window](https://developer.mozilla.org/en/docs/Web/API/Window) to Kotlin
 */
expect abstract class Window() : EventTarget,
  GlobalEventHandlers,
  WindowEventHandlers,
  WindowOrWorkerGlobalScope,
  WindowSessionStorage,
  WindowLocalStorage, GlobalPerformance,
  UnionMessagePortOrWindowProxy {
  open val window: Window
  open val self: Window
  open val document: Document
  open var name: String
  open val location: Location
  open val history: History
  open val customElements: CustomElementRegistry
  open val locationbar: BarProp
  open val menubar: BarProp
  open val personalbar: BarProp
  open val scrollbars: BarProp
  open val statusbar: BarProp
  open val toolbar: BarProp
  open var status: String
  open val closed: Boolean
  open val frames: Window
  open val length: Int
  open val top: Window
  open var opener: Any?
  open val parent: Window
  open val frameElement: Element?
  open val navigator: Navigator
  open val applicationCache: ApplicationCache
  open val external: External
  open val screen: Screen
  open val innerWidth: Int
  open val innerHeight: Int
  open val scrollX: Double
  open val pageXOffset: Double
  open val scrollY: Double
  open val pageYOffset: Double
  open val screenX: Int
  open val screenY: Int
  open val outerWidth: Int
  open val outerHeight: Int
  open val devicePixelRatio: Double
  fun close()
  fun stop()
  fun focus()
  fun blur()
  fun open(url: String, target: String, features: String): Window?
  fun alert()
  fun alert(message: String)
  fun confirm(message: String): Boolean
  fun prompt(message: String, default: String): String?
  fun print()
  fun requestAnimationFrame(callback: (Double) -> Unit): Int
  fun cancelAnimationFrame(handle: Int)
  fun postMessage(message: Any?, targetOrigin: String, transfer: Array<Any>)
  fun captureEvents()
  fun releaseEvents()
  fun matchMedia(query: String): MediaQueryList
  fun moveTo(x: Int, y: Int)
  fun moveBy(x: Int, y: Int)
  fun resizeTo(x: Int, y: Int)
  fun resizeBy(x: Int, y: Int)
  fun scroll(options: ScrollToOptions)
  fun scroll(x: Double, y: Double)
  fun scrollTo(options: ScrollToOptions)
  fun scrollTo(x: Double, y: Double)
  fun scrollBy(options: ScrollToOptions)
  fun scrollBy(x: Double, y: Double)
  fun getComputedStyle(elt: Element, pseudoElt: String?): CSSStyleDeclaration
}

expect inline operator fun Window.get(name: String): Any
