package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.css.CSSStyleDeclaration
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget
import lt.petuska.kvdom.dom.w3c.performance.GlobalPerformance

/**
 * Exposes the JavaScript [Window](https://developer.mozilla.org/en/docs/Web/API/Window) to Kotlin
 */
actual abstract external class Window : EventTarget, GlobalEventHandlers,
  WindowEventHandlers,
  WindowOrWorkerGlobalScope,
  WindowSessionStorage,
  WindowLocalStorage, GlobalPerformance,
  UnionMessagePortOrWindowProxy {
  actual open val window: Window
  actual open val self: Window
  actual open val document: Document
  actual open var name: String
  actual open val location: Location
  actual open val history: History
  actual open val customElements: CustomElementRegistry
  actual open val locationbar: BarProp
  actual open val menubar: BarProp
  actual open val personalbar: BarProp
  actual open val scrollbars: BarProp
  actual open val statusbar: BarProp
  actual open val toolbar: BarProp
  actual open var status: String
  actual open val closed: Boolean
  actual open val frames: Window
  actual open val length: Int
  actual open val top: Window
  actual open var opener: Any?
  actual open val parent: Window
  actual open val frameElement: Element?
  actual open val navigator: Navigator
  actual open val applicationCache: ApplicationCache
  actual open val expect: External
  actual open val screen: Screen
  actual open val innerWidth: Int
  actual open val innerHeight: Int
  actual open val scrollX: Double
  actual open val pageXOffset: Double
  actual open val scrollY: Double
  actual open val pageYOffset: Double
  actual open val screenX: Int
  actual open val screenY: Int
  actual open val outerWidth: Int
  actual open val outerHeight: Int
  actual open val devicePixelRatio: Double
  actual fun close()
  actual fun stop()
  actual fun focus()
  actual fun blur()
  actual fun open(
    url: String,
    target: String,
    features: String
  ): Window?
  
  actual fun alert()
  actual fun alert(message: String)
  actual fun confirm(message: String): Boolean
  actual fun prompt(message: String, default: String): String?
  actual fun print()
  actual fun requestAnimationFrame(callback: (String) -> Unit): Int
  actual fun cancelAnimationFrame(handle: Int)
  actual fun postMessage(message: Any?, targetOrigin: String, transfer: Array<Dynamic>)
  actual fun captureEvents()
  actual fun releaseEvents()
  actual fun matchMedia(query: String): MediaQueryList
  actual fun moveTo(x: Int, y: Int)
  actual fun moveBy(x: Int, y: Int)
  actual fun resizeTo(x: Int, y: Int)
  actual fun resizeBy(x: Int, y: Int)
  actual fun scroll(options: ScrollToOptions)
  actual fun scroll(x: Double, y: Double)
  actual fun scrollTo(options: ScrollToOptions)
  actual fun scrollTo(x: Double, y: Double)
  actual fun scrollBy(options: ScrollToOptions)
  actual fun scrollBy(x: Double, y: Double)
  actual fun getComputedStyle(elt: Element, pseudoElt: String?): CSSStyleDeclaration
}

@Suppress("UnsafeCastFromDynamic")
actual operator fun Window.get(name: String): Dynamic = asDynamic()[name]