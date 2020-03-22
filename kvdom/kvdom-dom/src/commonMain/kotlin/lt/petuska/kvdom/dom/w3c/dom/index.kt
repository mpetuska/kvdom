package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.css.LinkStyle
import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget


/**
 * Exposes the JavaScript [TextMetrics](https://developer.mozilla.org/en/docs/Web/API/TextMetrics) to Kotlin
 */
public external abstract class TextMetrics {
  open val width: Double
  open val actualBoundingBoxLeft: Double
  open val actualBoundingBoxRight: Double
  open val fontBoundingBoxAscent: Double
  open val fontBoundingBoxDescent: Double
  open val actualBoundingBoxAscent: Double
  open val actualBoundingBoxDescent: Double
  open val emHeightAscent: Double
  open val emHeightDescent: Double
  open val hangingBaseline: Double
  open val alphabeticBaseline: Double
  open val ideographicBaseline: Double
}

public external interface HitRegionOptions {
  var path: Path2D? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var fillRule: CanvasFillRule? /* = CanvasFillRule.NONZERO */
    get() = definedExternally
    set(value) = definedExternally
  var id: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var parentID: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var cursor: String? /* = "inherit" */
    get() = definedExternally
    set(value) = definedExternally
  var control: Element? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var label: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var role: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun HitRegionOptions(path: Path2D? = null, fillRule: CanvasFillRule? = CanvasFillRule.NONZERO, id: String? = "", parentID: String? = null, cursor: String? = "inherit", control: Element? = null, label: String? = null, role: String? = null): HitRegionOptions {
  val o = js("({})")
  o["path"] = path
  o["fillRule"] = fillRule
  o["id"] = id
  o["parentID"] = parentID
  o["cursor"] = cursor
  o["control"] = control
  o["label"] = label
  o["role"] = role
  return o
}

/**
 * Exposes the JavaScript [ImageData](https://developer.mozilla.org/en/docs/Web/API/ImageData) to Kotlin
 */
public external open class ImageData : ImageBitmapSource, TexImageSource {
  constructor(sw: Int, sh: Int)
  constructor(data: Uint8ClampedArray, sw: Int, sh: Int = definedExternally)
  open val width: Int
  open val height: Int
  open val data: Uint8ClampedArray
}

/**
 * Exposes the JavaScript [Path2D](https://developer.mozilla.org/en/docs/Web/API/Path2D) to Kotlin
 */
public external open class Path2D() : CanvasPath {
  constructor(path: Path2D)
  constructor(paths: Array<Path2D>, fillRule: CanvasFillRule = definedExternally)
  constructor(d: String)
  fun addPath(path: Path2D, transform: dynamic = definedExternally)
  override fun closePath()
  override fun moveTo(x: Double, y: Double)
  override fun lineTo(x: Double, y: Double)
  override fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)
  override fun bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double)
  override fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)
  override fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radiusX: Double, radiusY: Double, rotation: Double)
  override fun rect(x: Double, y: Double, w: Double, h: Double)
  override fun arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean /* = definedExternally */)
  override fun ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean /* = definedExternally */)
}

/**
 * Exposes the JavaScript [ImageBitmapRenderingContext](https://developer.mozilla.org/en/docs/Web/API/ImageBitmapRenderingContext) to Kotlin
 */
public external abstract class ImageBitmapRenderingContext {
  open val canvas: HTMLCanvasElement
  fun transferFromImageBitmap(bitmap: ImageBitmap?)
}

public external interface ImageBitmapRenderingContextSettings {
  var alpha: Boolean? /* = true */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun ImageBitmapRenderingContextSettings(alpha: Boolean? = true): ImageBitmapRenderingContextSettings {
  val o = js("({})")
  o["alpha"] = alpha
  return o
}

/**
 * Exposes the JavaScript [CustomElementRegistry](https://developer.mozilla.org/en/docs/Web/API/CustomElementRegistry) to Kotlin
 */
public external abstract class CustomElementRegistry {
  fun define(name: String, constructor: () -> dynamic, options: ElementDefinitionOptions = definedExternally)
  fun get(name: String): Any?
  fun whenDefined(name: String): Promise<Unit>
}

public external interface ElementDefinitionOptions {
  var extends: String?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun ElementDefinitionOptions(extends: String? = undefined): ElementDefinitionOptions {
  val o = js("({})")
  o["extends"] = extends
  return o
}

/**
 * Exposes the JavaScript [DataTransfer](https://developer.mozilla.org/en/docs/Web/API/DataTransfer) to Kotlin
 */
public external abstract class DataTransfer {
  open var dropEffect: String
  open var effectAllowed: String
  open val items: DataTransferItemList
  open val types: Array<out String>
  open val files: FileList
  fun setDragImage(image: Element, x: Int, y: Int)
  fun getData(format: String): String
  fun setData(format: String, data: String)
  fun clearData(format: String = definedExternally)
}

/**
 * Exposes the JavaScript [DataTransferItemList](https://developer.mozilla.org/en/docs/Web/API/DataTransferItemList) to Kotlin
 */
public external abstract class DataTransferItemList {
  open val length: Int
  fun add(data: String, type: String): DataTransferItem?
  fun add(data: File): DataTransferItem?
  fun remove(index: Int)
  fun clear()
}

@kotlin.internal.InlineOnly
public inline operator fun DataTransferItemList.get(index: Int): DataTransferItem? = asDynamic()[index]

/**
 * Exposes the JavaScript [DataTransferItem](https://developer.mozilla.org/en/docs/Web/API/DataTransferItem) to Kotlin
 */
public external abstract class DataTransferItem {
  open val kind: String
  open val type: String
  fun getAsString(_callback: ((String) -> Unit)?)
  fun getAsFile(): File?
}

/**
 * Exposes the JavaScript [DragEvent](https://developer.mozilla.org/en/docs/Web/API/DragEvent) to Kotlin
 */
public external open class DragEvent(type: String, eventInitDict: DragEventInit = definedExternally) : MouseEvent {
  open val dataTransfer: DataTransfer?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external interface DragEventInit : MouseEventInit {
  var dataTransfer: DataTransfer? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun DragEventInit(dataTransfer: DataTransfer? = null, screenX: Int? = 0, screenY: Int? = 0, clientX: Int? = 0, clientY: Int? = 0, button: Short? = 0, buttons: Short? = 0, relatedTarget: EventTarget? = null, region: String? = null, ctrlKey: Boolean? = false, shiftKey: Boolean? = false, altKey: Boolean? = false, metaKey: Boolean? = false, modifierAltGraph: Boolean? = false, modifierCapsLock: Boolean? = false, modifierFn: Boolean? = false, modifierFnLock: Boolean? = false, modifierHyper: Boolean? = false, modifierNumLock: Boolean? = false, modifierScrollLock: Boolean? = false, modifierSuper: Boolean? = false, modifierSymbol: Boolean? = false, modifierSymbolLock: Boolean? = false, view: Window? = null, detail: Int? = 0, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): DragEventInit {
  val o = js("({})")
  o["dataTransfer"] = dataTransfer
  o["screenX"] = screenX
  o["screenY"] = screenY
  o["clientX"] = clientX
  o["clientY"] = clientY
  o["button"] = button
  o["buttons"] = buttons
  o["relatedTarget"] = relatedTarget
  o["region"] = region
  o["ctrlKey"] = ctrlKey
  o["shiftKey"] = shiftKey
  o["altKey"] = altKey
  o["metaKey"] = metaKey
  o["modifierAltGraph"] = modifierAltGraph
  o["modifierCapsLock"] = modifierCapsLock
  o["modifierFn"] = modifierFn
  o["modifierFnLock"] = modifierFnLock
  o["modifierHyper"] = modifierHyper
  o["modifierNumLock"] = modifierNumLock
  o["modifierScrollLock"] = modifierScrollLock
  o["modifierSuper"] = modifierSuper
  o["modifierSymbol"] = modifierSymbol
  o["modifierSymbolLock"] = modifierSymbolLock
  o["view"] = view
  o["detail"] = detail
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [Window](https://developer.mozilla.org/en/docs/Web/API/Window) to Kotlin
 */
public external abstract class Window : EventTarget, GlobalEventHandlers, WindowEventHandlers, WindowOrWorkerGlobalScope, WindowSessionStorage, WindowLocalStorage, GlobalPerformance, UnionMessagePortOrWindowProxy {
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
  fun open(url: String = definedExternally, target: String = definedExternally, features: String = definedExternally): Window?
  fun alert()
  fun alert(message: String)
  fun confirm(message: String = definedExternally): Boolean
  fun prompt(message: String = definedExternally, default: String = definedExternally): String?
  fun print()
  fun requestAnimationFrame(callback: (Double) -> Unit): Int
  fun cancelAnimationFrame(handle: Int)
  fun postMessage(message: Any?, targetOrigin: String, transfer: Array<dynamic> = definedExternally)
  fun captureEvents()
  fun releaseEvents()
  fun matchMedia(query: String): MediaQueryList
  fun moveTo(x: Int, y: Int)
  fun moveBy(x: Int, y: Int)
  fun resizeTo(x: Int, y: Int)
  fun resizeBy(x: Int, y: Int)
  fun scroll(options: ScrollToOptions = definedExternally)
  fun scroll(x: Double, y: Double)
  fun scrollTo(options: ScrollToOptions = definedExternally)
  fun scrollTo(x: Double, y: Double)
  fun scrollBy(options: ScrollToOptions = definedExternally)
  fun scrollBy(x: Double, y: Double)
  fun getComputedStyle(elt: Element, pseudoElt: String? = definedExternally): CSSStyleDeclaration
}

@kotlin.internal.InlineOnly
public inline operator fun Window.get(name: String): dynamic = asDynamic()[name]

public external abstract class BarProp {
  open val visible: Boolean
}

/**
 * Exposes the JavaScript [History](https://developer.mozilla.org/en/docs/Web/API/History) to Kotlin
 */
public external abstract class History {
  open val length: Int
  open var scrollRestoration: ScrollRestoration
  open val state: Any?
  fun go(delta: Int = definedExternally)
  fun back()
  fun forward()
  fun pushState(data: Any?, title: String, url: String? = definedExternally)
  fun replaceState(data: Any?, title: String, url: String? = definedExternally)
}

/**
 * Exposes the JavaScript [Location](https://developer.mozilla.org/en/docs/Web/API/Location) to Kotlin
 */
public external abstract class Location {
  open var href: String
  open val origin: String
  open var protocol: String
  open var host: String
  open var hostname: String
  open var port: String
  open var pathname: String
  open var search: String
  open var hash: String
  open val ancestorOrigins: Array<out String>
  fun assign(url: String)
  fun replace(url: String)
  fun reload()
}

/**
 * Exposes the JavaScript [PopStateEvent](https://developer.mozilla.org/en/docs/Web/API/PopStateEvent) to Kotlin
 */
public external open class PopStateEvent(type: String, eventInitDict: PopStateEventInit = definedExternally) : Event {
  open val state: Any?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external interface PopStateEventInit : EventInit {
  var state: Any? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun PopStateEventInit(state: Any? = null, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): PopStateEventInit {
  val o = js("({})")
  o["state"] = state
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [HashChangeEvent](https://developer.mozilla.org/en/docs/Web/API/HashChangeEvent) to Kotlin
 */
public external open class HashChangeEvent(type: String, eventInitDict: HashChangeEventInit = definedExternally) : Event {
  open val oldURL: String
  open val newURL: String
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external interface HashChangeEventInit : EventInit {
  var oldURL: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var newURL: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun HashChangeEventInit(oldURL: String? = "", newURL: String? = "", bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): HashChangeEventInit {
  val o = js("({})")
  o["oldURL"] = oldURL
  o["newURL"] = newURL
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [PageTransitionEvent](https://developer.mozilla.org/en/docs/Web/API/PageTransitionEvent) to Kotlin
 */
public external open class PageTransitionEvent(type: String, eventInitDict: PageTransitionEventInit = definedExternally) : Event {
  open val persisted: Boolean
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external interface PageTransitionEventInit : EventInit {
  var persisted: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun PageTransitionEventInit(persisted: Boolean? = false, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): PageTransitionEventInit {
  val o = js("({})")
  o["persisted"] = persisted
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [BeforeUnloadEvent](https://developer.mozilla.org/en/docs/Web/API/BeforeUnloadEvent) to Kotlin
 */
public external open class BeforeUnloadEvent : Event {
  var returnValue: String
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external abstract class ApplicationCache : EventTarget {
  open val status: Short
  open var onchecking: ((Event) -> dynamic)?
  open var onerror: ((Event) -> dynamic)?
  open var onnoupdate: ((Event) -> dynamic)?
  open var ondownloading: ((Event) -> dynamic)?
  open var onprogress: ((ProgressEvent) -> dynamic)?
  open var onupdateready: ((Event) -> dynamic)?
  open var oncached: ((Event) -> dynamic)?
  open var onobsolete: ((Event) -> dynamic)?
  fun update()
  fun abort()
  fun swapCache()
  
  companion object {
    val UNCACHED: Short
    val IDLE: Short
    val CHECKING: Short
    val DOWNLOADING: Short
    val UPDATEREADY: Short
    val OBSOLETE: Short
  }
}

/**
 * Exposes the JavaScript [NavigatorOnLine](https://developer.mozilla.org/en/docs/Web/API/NavigatorOnLine) to Kotlin
 */
public external interface NavigatorOnLine {
  val onLine: Boolean
}

/**
 * Exposes the JavaScript [ErrorEvent](https://developer.mozilla.org/en/docs/Web/API/ErrorEvent) to Kotlin
 */
public external open class ErrorEvent(type: String, eventInitDict: ErrorEventInit = definedExternally) : Event {
  open val message: String
  open val filename: String
  open val lineno: Int
  open val colno: Int
  open val error: Any?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external interface ErrorEventInit : EventInit {
  var message: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var filename: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var lineno: Int? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var colno: Int? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var error: Any? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun ErrorEventInit(message: String? = "", filename: String? = "", lineno: Int? = 0, colno: Int? = 0, error: Any? = null, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ErrorEventInit {
  val o = js("({})")
  o["message"] = message
  o["filename"] = filename
  o["lineno"] = lineno
  o["colno"] = colno
  o["error"] = error
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [PromiseRejectionEvent](https://developer.mozilla.org/en/docs/Web/API/PromiseRejectionEvent) to Kotlin
 */
public external open class PromiseRejectionEvent(type: String, eventInitDict: PromiseRejectionEventInit) : Event {
  open val promise: Promise<Any?>
  open val reason: Any?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external interface PromiseRejectionEventInit : EventInit {
  var promise: Promise<Any?>?
    get() = definedExternally
    set(value) = definedExternally
  var reason: Any?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun PromiseRejectionEventInit(promise: Promise<Any?>?, reason: Any? = undefined, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): PromiseRejectionEventInit {
  val o = js("({})")
  o["promise"] = promise
  o["reason"] = reason
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [WindowEventHandlers](https://developer.mozilla.org/en/docs/Web/API/WindowEventHandlers) to Kotlin
 */
public external interface WindowEventHandlers {
  var onafterprint: ((Event) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onbeforeprint: ((Event) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onbeforeunload: ((BeforeUnloadEvent) -> String?)?
    get() = definedExternally
    set(value) = definedExternally
  var onhashchange: ((HashChangeEvent) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onlanguagechange: ((Event) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onmessage: ((MessageEvent) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onoffline: ((Event) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var ononline: ((Event) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onpagehide: ((PageTransitionEvent) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onpageshow: ((PageTransitionEvent) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onpopstate: ((PopStateEvent) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onrejectionhandled: ((Event) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onstorage: ((StorageEvent) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onunhandledrejection: ((PromiseRejectionEvent) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
  var onunload: ((Event) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Exposes the JavaScript [WindowOrWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/WindowOrWorkerGlobalScope) to Kotlin
 */
public external interface WindowOrWorkerGlobalScope {
  val origin: String
  val caches: CacheStorage
  fun btoa(data: String): String
  fun atob(data: String): String
  fun setTimeout(handler: dynamic, timeout: Int = definedExternally, vararg arguments: Any?): Int
  fun clearTimeout(handle: Int = definedExternally)
  fun setInterval(handler: dynamic, timeout: Int = definedExternally, vararg arguments: Any?): Int
  fun clearInterval(handle: Int = definedExternally)
  fun createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions = definedExternally): Promise<ImageBitmap>
  fun createImageBitmap(image: ImageBitmapSource, sx: Int, sy: Int, sw: Int, sh: Int, options: ImageBitmapOptions = definedExternally): Promise<ImageBitmap>
  fun fetch(input: dynamic, init: RequestInit = definedExternally): Promise<Response>
}

/**
 * Exposes the JavaScript [Navigator](https://developer.mozilla.org/en/docs/Web/API/Navigator) to Kotlin
 */
public external abstract class Navigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorContentUtils, NavigatorCookies, NavigatorPlugins, NavigatorConcurrentHardware {
  open val clipboard: Clipboard
  open val mediaDevices: MediaDevices
  open val maxTouchPoints: Int
  open val serviceWorker: ServiceWorkerContainer
  fun getUserMedia(constraints: MediaStreamConstraints, successCallback: (MediaStream) -> Unit, errorCallback: (dynamic) -> Unit)
  fun vibrate(pattern: dynamic): Boolean
}

/**
 * Exposes the JavaScript [NavigatorID](https://developer.mozilla.org/en/docs/Web/API/NavigatorID) to Kotlin
 */
public external interface NavigatorID {
  val appCodeName: String
  val appName: String
  val appVersion: String
  val platform: String
  val product: String
  val productSub: String
  val userAgent: String
  val vendor: String
  val vendorSub: String
  val oscpu: String
  fun taintEnabled(): Boolean
}

/**
 * Exposes the JavaScript [NavigatorLanguage](https://developer.mozilla.org/en/docs/Web/API/NavigatorLanguage) to Kotlin
 */
public external interface NavigatorLanguage {
  val language: String
  val languages: Array<out String>
}

public external interface NavigatorContentUtils {
  fun registerProtocolHandler(scheme: String, url: String, title: String)
  fun registerContentHandler(mimeType: String, url: String, title: String)
  fun isProtocolHandlerRegistered(scheme: String, url: String): String
  fun isContentHandlerRegistered(mimeType: String, url: String): String
  fun unregisterProtocolHandler(scheme: String, url: String)
  fun unregisterContentHandler(mimeType: String, url: String)
}

public external interface NavigatorCookies {
  val cookieEnabled: Boolean
}

/**
 * Exposes the JavaScript [NavigatorPlugins](https://developer.mozilla.org/en/docs/Web/API/NavigatorPlugins) to Kotlin
 */
public external interface NavigatorPlugins {
  val plugins: PluginArray
  val mimeTypes: MimeTypeArray
  fun javaEnabled(): Boolean
}

/**
 * Exposes the JavaScript [PluginArray](https://developer.mozilla.org/en/docs/Web/API/PluginArray) to Kotlin
 */
public external abstract class PluginArray : ItemArrayLike<Plugin> {
  fun refresh(reload: Boolean = definedExternally)
  override fun item(index: Int): Plugin?
  fun namedItem(name: String): Plugin?
}

@kotlin.internal.InlineOnly
public inline operator fun PluginArray.get(index: Int): Plugin? = asDynamic()[index]

@kotlin.internal.InlineOnly
public inline operator fun PluginArray.get(name: String): Plugin? = asDynamic()[name]

/**
 * Exposes the JavaScript [MimeTypeArray](https://developer.mozilla.org/en/docs/Web/API/MimeTypeArray) to Kotlin
 */
public external abstract class MimeTypeArray : ItemArrayLike<MimeType> {
  override fun item(index: Int): MimeType?
  fun namedItem(name: String): MimeType?
}

@kotlin.internal.InlineOnly
public inline operator fun MimeTypeArray.get(index: Int): MimeType? = asDynamic()[index]

@kotlin.internal.InlineOnly
public inline operator fun MimeTypeArray.get(name: String): MimeType? = asDynamic()[name]

/**
 * Exposes the JavaScript [Plugin](https://developer.mozilla.org/en/docs/Web/API/Plugin) to Kotlin
 */
public external abstract class Plugin : ItemArrayLike<MimeType> {
  open val name: String
  open val description: String
  open val filename: String
  override fun item(index: Int): MimeType?
  fun namedItem(name: String): MimeType?
}

@kotlin.internal.InlineOnly
public inline operator fun Plugin.get(index: Int): MimeType? = asDynamic()[index]

@kotlin.internal.InlineOnly
public inline operator fun Plugin.get(name: String): MimeType? = asDynamic()[name]

/**
 * Exposes the JavaScript [MimeType](https://developer.mozilla.org/en/docs/Web/API/MimeType) to Kotlin
 */
public external abstract class MimeType {
  open val type: String
  open val description: String
  open val suffixes: String
  open val enabledPlugin: Plugin
}

/**
 * Exposes the JavaScript [ImageBitmap](https://developer.mozilla.org/en/docs/Web/API/ImageBitmap) to Kotlin
 */
public external abstract class ImageBitmap : CanvasImageSource, TexImageSource {
  open val width: Int
  open val height: Int
  fun close()
}

public external interface ImageBitmapOptions {
  var imageOrientation: ImageOrientation? /* = ImageOrientation.NONE */
    get() = definedExternally
    set(value) = definedExternally
  var premultiplyAlpha: PremultiplyAlpha? /* = PremultiplyAlpha.DEFAULT */
    get() = definedExternally
    set(value) = definedExternally
  var colorSpaceConversion: ColorSpaceConversion? /* = ColorSpaceConversion.DEFAULT */
    get() = definedExternally
    set(value) = definedExternally
  var resizeWidth: Int?
    get() = definedExternally
    set(value) = definedExternally
  var resizeHeight: Int?
    get() = definedExternally
    set(value) = definedExternally
  var resizeQuality: ResizeQuality? /* = ResizeQuality.LOW */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun ImageBitmapOptions(imageOrientation: ImageOrientation? = ImageOrientation.NONE, premultiplyAlpha: PremultiplyAlpha? = PremultiplyAlpha.DEFAULT, colorSpaceConversion: ColorSpaceConversion? = ColorSpaceConversion.DEFAULT, resizeWidth: Int? = undefined, resizeHeight: Int? = undefined, resizeQuality: ResizeQuality? = ResizeQuality.LOW): ImageBitmapOptions {
  val o = js("({})")
  o["imageOrientation"] = imageOrientation
  o["premultiplyAlpha"] = premultiplyAlpha
  o["colorSpaceConversion"] = colorSpaceConversion
  o["resizeWidth"] = resizeWidth
  o["resizeHeight"] = resizeHeight
  o["resizeQuality"] = resizeQuality
  return o
}

/**
 * Exposes the JavaScript [MessageEvent](https://developer.mozilla.org/en/docs/Web/API/MessageEvent) to Kotlin
 */
public external open class MessageEvent(type: String, eventInitDict: MessageEventInit = definedExternally) : Event {
  open val data: Any?
  open val origin: String
  open val lastEventId: String
  open val source: UnionMessagePortOrWindowProxy?
  open val ports: Array<out MessagePort>
  fun initMessageEvent(type: String, bubbles: Boolean, cancelable: Boolean, data: Any?, origin: String, lastEventId: String, source: UnionMessagePortOrWindowProxy?, ports: Array<MessagePort>)
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external interface MessageEventInit : EventInit {
  var data: Any? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var origin: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var lastEventId: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var source: UnionMessagePortOrWindowProxy? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var ports: Array<MessagePort>? /* = arrayOf() */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun MessageEventInit(data: Any? = null, origin: String? = "", lastEventId: String? = "", source: UnionMessagePortOrWindowProxy? = null, ports: Array<MessagePort>? = arrayOf(), bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): MessageEventInit {
  val o = js("({})")
  o["data"] = data
  o["origin"] = origin
  o["lastEventId"] = lastEventId
  o["source"] = source
  o["ports"] = ports
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [EventSource](https://developer.mozilla.org/en/docs/Web/API/EventSource) to Kotlin
 */
public external open class EventSource(url: String, eventSourceInitDict: EventSourceInit = definedExternally) : EventTarget {
  open val url: String
  open val withCredentials: Boolean
  open val readyState: Short
  var onopen: ((Event) -> dynamic)?
  var onmessage: ((MessageEvent) -> dynamic)?
  var onerror: ((Event) -> dynamic)?
  fun close()
  
  companion object {
    val CONNECTING: Short
    val OPEN: Short
    val CLOSED: Short
  }
}

public external interface EventSourceInit {
  var withCredentials: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun EventSourceInit(withCredentials: Boolean? = false): EventSourceInit {
  val o = js("({})")
  o["withCredentials"] = withCredentials
  return o
}

/**
 * Exposes the JavaScript [WebSocket](https://developer.mozilla.org/en/docs/Web/API/WebSocket) to Kotlin
 */
public external open class WebSocket(url: String, protocols: dynamic = definedExternally) : EventTarget {
  open val url: String
  open val readyState: Short
  open val bufferedAmount: Number
  var onopen: ((Event) -> dynamic)?
  var onerror: ((Event) -> dynamic)?
  var onclose: ((Event) -> dynamic)?
  open val extensions: String
  open val protocol: String
  var onmessage: ((MessageEvent) -> dynamic)?
  var binaryType: BinaryType
  fun close(code: Short = definedExternally, reason: String = definedExternally)
  fun send(data: String)
  fun send(data: Blob)
  fun send(data: ArrayBuffer)
  fun send(data: ArrayBufferView)
  
  companion object {
    val CONNECTING: Short
    val OPEN: Short
    val CLOSING: Short
    val CLOSED: Short
  }
}

/**
 * Exposes the JavaScript [CloseEvent](https://developer.mozilla.org/en/docs/Web/API/CloseEvent) to Kotlin
 */
public external open class CloseEvent(type: String, eventInitDict: CloseEventInit = definedExternally) : Event {
  open val wasClean: Boolean
  open val code: Short
  open val reason: String
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external interface CloseEventInit : EventInit {
  var wasClean: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var code: Short? /* = 0 */
    get() = definedExternally
    set(value) = definedExternally
  var reason: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun CloseEventInit(wasClean: Boolean? = false, code: Short? = 0, reason: String? = "", bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): CloseEventInit {
  val o = js("({})")
  o["wasClean"] = wasClean
  o["code"] = code
  o["reason"] = reason
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [MessageChannel](https://developer.mozilla.org/en/docs/Web/API/MessageChannel) to Kotlin
 */
public external open class MessageChannel {
  open val port1: MessagePort
  open val port2: MessagePort
}

/**
 * Exposes the JavaScript [MessagePort](https://developer.mozilla.org/en/docs/Web/API/MessagePort) to Kotlin
 */
public external abstract class MessagePort : EventTarget, UnionMessagePortOrWindowProxy, UnionMessagePortOrServiceWorker, UnionClientOrMessagePortOrServiceWorker {
  open var onmessage: ((MessageEvent) -> dynamic)?
  fun postMessage(message: Any?, transfer: Array<dynamic> = definedExternally)
  fun start()
  fun close()
}

/**
 * Exposes the JavaScript [BroadcastChannel](https://developer.mozilla.org/en/docs/Web/API/BroadcastChannel) to Kotlin
 */
public external open class BroadcastChannel(name: String) : EventTarget {
  open val name: String
  var onmessage: ((MessageEvent) -> dynamic)?
  fun postMessage(message: Any?)
  fun close()
}

/**
 * Exposes the JavaScript [WorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/WorkerGlobalScope) to Kotlin
 */
public external abstract class WorkerGlobalScope : EventTarget, WindowOrWorkerGlobalScope, GlobalPerformance {
  open val self: WorkerGlobalScope
  open val location: WorkerLocation
  open val navigator: WorkerNavigator
  open var onerror: ((dynamic, String, Int, Int, Any?) -> dynamic)?
  open var onlanguagechange: ((Event) -> dynamic)?
  open var onoffline: ((Event) -> dynamic)?
  open var ononline: ((Event) -> dynamic)?
  open var onrejectionhandled: ((Event) -> dynamic)?
  open var onunhandledrejection: ((PromiseRejectionEvent) -> dynamic)?
  fun importScripts(vararg urls: String)
}

/**
 * Exposes the JavaScript [DedicatedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/DedicatedWorkerGlobalScope) to Kotlin
 */
public external abstract class DedicatedWorkerGlobalScope : WorkerGlobalScope {
  open var onmessage: ((MessageEvent) -> dynamic)?
  fun postMessage(message: Any?, transfer: Array<dynamic> = definedExternally)
  fun close()
}

/**
 * Exposes the JavaScript [SharedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/SharedWorkerGlobalScope) to Kotlin
 */
public external abstract class SharedWorkerGlobalScope : WorkerGlobalScope {
  open val name: String
  open val applicationCache: ApplicationCache
  open var onconnect: ((Event) -> dynamic)?
  fun close()
}

/**
 * Exposes the JavaScript [AbstractWorker](https://developer.mozilla.org/en/docs/Web/API/AbstractWorker) to Kotlin
 */
public external interface AbstractWorker {
  var onerror: ((Event) -> dynamic)?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Exposes the JavaScript [Worker](https://developer.mozilla.org/en/docs/Web/API/Worker) to Kotlin
 */
public external open class Worker(scriptURL: String, options: WorkerOptions = definedExternally) : EventTarget, AbstractWorker {
  var onmessage: ((MessageEvent) -> dynamic)?
  override var onerror: ((Event) -> dynamic)?
  fun terminate()
  fun postMessage(message: Any?, transfer: Array<dynamic> = definedExternally)
}

public external interface WorkerOptions {
  var type: WorkerType? /* = WorkerType.CLASSIC */
    get() = definedExternally
    set(value) = definedExternally
  var credentials: RequestCredentials? /* = RequestCredentials.OMIT */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun WorkerOptions(type: WorkerType? = WorkerType.CLASSIC, credentials: RequestCredentials? = RequestCredentials.OMIT): WorkerOptions {
  val o = js("({})")
  o["type"] = type
  o["credentials"] = credentials
  return o
}

/**
 * Exposes the JavaScript [SharedWorker](https://developer.mozilla.org/en/docs/Web/API/SharedWorker) to Kotlin
 */
public external open class SharedWorker(scriptURL: String, name: String = definedExternally, options: WorkerOptions = definedExternally) : EventTarget, AbstractWorker {
  open val port: MessagePort
  override var onerror: ((Event) -> dynamic)?
}

/**
 * Exposes the JavaScript [NavigatorConcurrentHardware](https://developer.mozilla.org/en/docs/Web/API/NavigatorConcurrentHardware) to Kotlin
 */
public external interface NavigatorConcurrentHardware {
  val hardwareConcurrency: Number
}

/**
 * Exposes the JavaScript [WorkerNavigator](https://developer.mozilla.org/en/docs/Web/API/WorkerNavigator) to Kotlin
 */
public external abstract class WorkerNavigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorConcurrentHardware {
  open val serviceWorker: ServiceWorkerContainer
}

/**
 * Exposes the JavaScript [WorkerLocation](https://developer.mozilla.org/en/docs/Web/API/WorkerLocation) to Kotlin
 */
public external abstract class WorkerLocation {
  open val href: String
  open val origin: String
  open val protocol: String
  open val host: String
  open val hostname: String
  open val port: String
  open val pathname: String
  open val search: String
  open val hash: String
}

/**
 * Exposes the JavaScript [Storage](https://developer.mozilla.org/en/docs/Web/API/Storage) to Kotlin
 */
public external abstract class Storage {
  open val length: Int
  fun key(index: Int): String?
  fun removeItem(key: String)
  fun clear()
  fun getItem(key: String): String?
  fun setItem(key: String, value: String)
}

@kotlin.internal.InlineOnly
public inline operator fun Storage.get(key: String): String? = asDynamic()[key]

@kotlin.internal.InlineOnly
public inline operator fun Storage.set(key: String, value: String) { asDynamic()[key] = value }

/**
 * Exposes the JavaScript [WindowSessionStorage](https://developer.mozilla.org/en/docs/Web/API/WindowSessionStorage) to Kotlin
 */
public external interface WindowSessionStorage {
  val sessionStorage: Storage
}

/**
 * Exposes the JavaScript [WindowLocalStorage](https://developer.mozilla.org/en/docs/Web/API/WindowLocalStorage) to Kotlin
 */
public external interface WindowLocalStorage {
  val localStorage: Storage
}

/**
 * Exposes the JavaScript [StorageEvent](https://developer.mozilla.org/en/docs/Web/API/StorageEvent) to Kotlin
 */
public external open class StorageEvent(type: String, eventInitDict: StorageEventInit = definedExternally) : Event {
  open val key: String?
  open val oldValue: String?
  open val newValue: String?
  open val url: String
  open val storageArea: Storage?
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external interface StorageEventInit : EventInit {
  var key: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var oldValue: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var newValue: String? /* = null */
    get() = definedExternally
    set(value) = definedExternally
  var url: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var storageArea: Storage? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun StorageEventInit(key: String? = null, oldValue: String? = null, newValue: String? = null, url: String? = "", storageArea: Storage? = null, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): StorageEventInit {
  val o = js("({})")
  o["key"] = key
  o["oldValue"] = oldValue
  o["newValue"] = newValue
  o["url"] = url
  o["storageArea"] = storageArea
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

public external abstract class HTMLAppletElement : HTMLElement {
  open var align: String
  open var alt: String
  open var archive: String
  open var code: String
  open var codeBase: String
  open var height: String
  open var hspace: Int
  open var name: String
  open var _object: String
  open var vspace: Int
  open var width: String
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [HTMLMarqueeElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMarqueeElement) to Kotlin
 */
public external abstract class HTMLMarqueeElement : HTMLElement {
  open var behavior: String
  open var bgColor: String
  open var direction: String
  open var height: String
  open var hspace: Int
  open var loop: Int
  open var scrollAmount: Int
  open var scrollDelay: Int
  open var trueSpeed: Boolean
  open var vspace: Int
  open var width: String
  open var onbounce: ((Event) -> dynamic)?
  open var onfinish: ((Event) -> dynamic)?
  open var onstart: ((Event) -> dynamic)?
  fun start()
  fun stop()
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [HTMLFrameSetElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFrameSetElement) to Kotlin
 */
public external abstract class HTMLFrameSetElement : HTMLElement, WindowEventHandlers {
  open var cols: String
  open var rows: String
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

public external abstract class HTMLFrameElement : HTMLElement {
  open var name: String
  open var scrolling: String
  open var src: String
  open var frameBorder: String
  open var longDesc: String
  open var noResize: Boolean
  open val contentDocument: Document?
  open val contentWindow: Window?
  open var marginHeight: String
  open var marginWidth: String
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

public external abstract class HTMLDirectoryElement : HTMLElement {
  open var compact: Boolean
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [HTMLFontElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFontElement) to Kotlin
 */
public external abstract class HTMLFontElement : HTMLElement {
  open var color: String
  open var face: String
  open var size: String
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

public external interface External {
  fun AddSearchProvider()
  fun IsSearchProviderInstalled()
}

public external interface EventInit {
  var bubbles: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var cancelable: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var composed: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun EventInit(bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): EventInit {
  val o = js("({})")
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [CustomEvent](https://developer.mozilla.org/en/docs/Web/API/CustomEvent) to Kotlin
 */
public external open class CustomEvent(type: String, eventInitDict: CustomEventInit = definedExternally) : Event {
  open val detail: Any?
  fun initCustomEvent(type: String, bubbles: Boolean, cancelable: Boolean, detail: Any?)
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external interface CustomEventInit : EventInit {
  var detail: Any? /* = null */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun CustomEventInit(detail: Any? = null, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): CustomEventInit {
  val o = js("({})")
  o["detail"] = detail
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

public external interface EventListenerOptions {
  var capture: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun EventListenerOptions(capture: Boolean? = false): EventListenerOptions {
  val o = js("({})")
  o["capture"] = capture
  return o
}

public external interface AddEventListenerOptions : EventListenerOptions {
  var passive: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var once: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun AddEventListenerOptions(passive: Boolean? = false, once: Boolean? = false, capture: Boolean? = false): AddEventListenerOptions {
  val o = js("({})")
  o["passive"] = passive
  o["once"] = once
  o["capture"] = capture
  return o
}

public external interface NonElementParentNode {
  fun getElementById(elementId: String): Element?
}

/**
 * Exposes the JavaScript [DocumentOrShadowRoot](https://developer.mozilla.org/en/docs/Web/API/DocumentOrShadowRoot) to Kotlin
 */
public external interface DocumentOrShadowRoot {
  val fullscreenElement: Element?
    get() = definedExternally
}

/**
 * Exposes the JavaScript [ParentNode](https://developer.mozilla.org/en/docs/Web/API/ParentNode) to Kotlin
 */
public external interface ParentNode {
  val children: HTMLCollection
  val firstElementChild: Element?
    get() = definedExternally
  val lastElementChild: Element?
    get() = definedExternally
  val childElementCount: Int
  fun prepend(vararg nodes: dynamic)
  fun append(vararg nodes: dynamic)
  fun querySelector(selectors: String): Element?
  fun querySelectorAll(selectors: String): NodeList
}

/**
 * Exposes the JavaScript [NonDocumentTypeChildNode](https://developer.mozilla.org/en/docs/Web/API/NonDocumentTypeChildNode) to Kotlin
 */
public external interface NonDocumentTypeChildNode {
  val previousElementSibling: Element?
    get() = definedExternally
  val nextElementSibling: Element?
    get() = definedExternally
}

/**
 * Exposes the JavaScript [ChildNode](https://developer.mozilla.org/en/docs/Web/API/ChildNode) to Kotlin
 */
public external interface ChildNode {
  fun before(vararg nodes: dynamic)
  fun after(vararg nodes: dynamic)
  fun replaceWith(vararg nodes: dynamic)
  fun remove()
}

/**
 * Exposes the JavaScript [Slotable](https://developer.mozilla.org/en/docs/Web/API/Slotable) to Kotlin
 */
public external interface Slotable {
  val assignedSlot: HTMLSlotElement?
    get() = definedExternally
}

/**
 * Exposes the JavaScript [NodeList](https://developer.mozilla.org/en/docs/Web/API/NodeList) to Kotlin
 */
public external abstract class NodeList : ItemArrayLike<Node> {
  override fun item(index: Int): Node?
}

@kotlin.internal.InlineOnly
public inline operator fun NodeList.get(index: Int): Node? = asDynamic()[index]

@kotlin.internal.InlineOnly
public inline operator fun HTMLCollection.get(index: Int): Element? = asDynamic()[index]

@kotlin.internal.InlineOnly
public inline operator fun HTMLCollection.get(name: String): Element? = asDynamic()[name]

/**
 * Exposes the JavaScript [MutationObserver](https://developer.mozilla.org/en/docs/Web/API/MutationObserver) to Kotlin
 */
public external open class MutationObserver(callback: (Array<MutationRecord>, MutationObserver) -> Unit) {
  fun observe(target: Node, options: MutationObserverInit = definedExternally)
  fun disconnect()
  fun takeRecords(): Array<MutationRecord>
}

/**
 * Exposes the JavaScript [MutationObserverInit](https://developer.mozilla.org/en/docs/Web/API/MutationObserverInit) to Kotlin
 */
public external interface MutationObserverInit {
  var childList: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var attributes: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  var characterData: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  var subtree: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
  var attributeOldValue: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  var characterDataOldValue: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  var attributeFilter: Array<String>?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun MutationObserverInit(childList: Boolean? = false, attributes: Boolean? = undefined, characterData: Boolean? = undefined, subtree: Boolean? = false, attributeOldValue: Boolean? = undefined, characterDataOldValue: Boolean? = undefined, attributeFilter: Array<String>? = undefined): MutationObserverInit {
  val o = js("({})")
  o["childList"] = childList
  o["attributes"] = attributes
  o["characterData"] = characterData
  o["subtree"] = subtree
  o["attributeOldValue"] = attributeOldValue
  o["characterDataOldValue"] = characterDataOldValue
  o["attributeFilter"] = attributeFilter
  return o
}

/**
 * Exposes the JavaScript [MutationRecord](https://developer.mozilla.org/en/docs/Web/API/MutationRecord) to Kotlin
 */
public external abstract class MutationRecord {
  open val type: String
  open val target: Node
  open val addedNodes: NodeList
  open val removedNodes: NodeList
  open val previousSibling: Node?
  open val nextSibling: Node?
  open val attributeName: String?
  open val attributeNamespace: String?
  open val oldValue: String?
}

/**
 * Exposes the JavaScript [Node](https://developer.mozilla.org/en/docs/Web/API/Node) to Kotlin
 */
public external abstract class Node : EventTarget {
  open val nodeType: Short
  open val nodeName: String
  open val baseURI: String
  open val isConnected: Boolean
  open val ownerDocument: Document?
  open val parentNode: Node?
  open val parentElement: Element?
  open val childNodes: NodeList
  open val firstChild: Node?
  open val lastChild: Node?
  open val previousSibling: Node?
  open val nextSibling: Node?
  open var nodeValue: String?
  open var textContent: String?
  fun getRootNode(options: GetRootNodeOptions = definedExternally): Node
  fun hasChildNodes(): Boolean
  fun normalize()
  fun cloneNode(deep: Boolean = definedExternally): Node
  fun isEqualNode(otherNode: Node?): Boolean
  fun isSameNode(otherNode: Node?): Boolean
  fun compareDocumentPosition(other: Node): Short
  fun contains(other: Node?): Boolean
  fun lookupPrefix(namespace: String?): String?
  fun lookupNamespaceURI(prefix: String?): String?
  fun isDefaultNamespace(namespace: String?): Boolean
  fun insertBefore(node: Node, child: Node?): Node
  fun appendChild(node: Node): Node
  fun replaceChild(node: Node, child: Node): Node
  fun removeChild(child: Node): Node
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

public external interface GetRootNodeOptions {
  var composed: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun GetRootNodeOptions(composed: Boolean? = false): GetRootNodeOptions {
  val o = js("({})")
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [Document](https://developer.mozilla.org/en/docs/Web/API/Document) to Kotlin
 */
public external open class Document : Node, GlobalEventHandlers, DocumentAndElementEventHandlers, NonElementParentNode, DocumentOrShadowRoot, ParentNode, GeometryUtils {
  open val implementation: DOMImplementation
  open val URL: String
  open val documentURI: String
  open val origin: String
  open val compatMode: String
  open val characterSet: String
  open val charset: String
  open val inputEncoding: String
  open val contentType: String
  open val doctype: DocumentType?
  open val documentElement: Element?
  open val location: Location?
  var domain: String
  open val referrer: String
  var cookie: String
  open val lastModified: String
  open val readyState: DocumentReadyState
  var title: String
  var dir: String
  var body: HTMLElement?
  open val head: HTMLHeadElement?
  open val images: HTMLCollection
  open val embeds: HTMLCollection
  open val plugins: HTMLCollection
  open val links: HTMLCollection
  open val forms: HTMLCollection
  open val scripts: HTMLCollection
  open val currentScript: HTMLOrSVGScriptElement?
  open val defaultView: Window?
  open val activeElement: Element?
  var designMode: String
  var onreadystatechange: ((Event) -> dynamic)?
  var fgColor: String
  var linkColor: String
  var vlinkColor: String
  var alinkColor: String
  var bgColor: String
  open val anchors: HTMLCollection
  open val applets: HTMLCollection
  open val all: HTMLAllCollection
  open val scrollingElement: Element?
  open val styleSheets: StyleSheetList
  open val rootElement: SVGSVGElement?
  open val fullscreenEnabled: Boolean
  open val fullscreen: Boolean
  var onfullscreenchange: ((Event) -> dynamic)?
  var onfullscreenerror: ((Event) -> dynamic)?
  override var onabort: ((Event) -> dynamic)?
  override var onblur: ((FocusEvent) -> dynamic)?
  override var oncancel: ((Event) -> dynamic)?
  override var oncanplay: ((Event) -> dynamic)?
  override var oncanplaythrough: ((Event) -> dynamic)?
  override var onchange: ((Event) -> dynamic)?
  override var onclick: ((MouseEvent) -> dynamic)?
  override var onclose: ((Event) -> dynamic)?
  override var oncontextmenu: ((MouseEvent) -> dynamic)?
  override var oncuechange: ((Event) -> dynamic)?
  override var ondblclick: ((MouseEvent) -> dynamic)?
  override var ondrag: ((DragEvent) -> dynamic)?
  override var ondragend: ((DragEvent) -> dynamic)?
  override var ondragenter: ((DragEvent) -> dynamic)?
  override var ondragexit: ((DragEvent) -> dynamic)?
  override var ondragleave: ((DragEvent) -> dynamic)?
  override var ondragover: ((DragEvent) -> dynamic)?
  override var ondragstart: ((DragEvent) -> dynamic)?
  override var ondrop: ((DragEvent) -> dynamic)?
  override var ondurationchange: ((Event) -> dynamic)?
  override var onemptied: ((Event) -> dynamic)?
  override var onended: ((Event) -> dynamic)?
  override var onerror: ((dynamic, String, Int, Int, Any?) -> dynamic)?
  override var onfocus: ((FocusEvent) -> dynamic)?
  override var oninput: ((InputEvent) -> dynamic)?
  override var oninvalid: ((Event) -> dynamic)?
  override var onkeydown: ((KeyboardEvent) -> dynamic)?
  override var onkeypress: ((KeyboardEvent) -> dynamic)?
  override var onkeyup: ((KeyboardEvent) -> dynamic)?
  override var onload: ((Event) -> dynamic)?
  override var onloadeddata: ((Event) -> dynamic)?
  override var onloadedmetadata: ((Event) -> dynamic)?
  override var onloadend: ((Event) -> dynamic)?
  override var onloadstart: ((ProgressEvent) -> dynamic)?
  override var onmousedown: ((MouseEvent) -> dynamic)?
  override var onmouseenter: ((MouseEvent) -> dynamic)?
  override var onmouseleave: ((MouseEvent) -> dynamic)?
  override var onmousemove: ((MouseEvent) -> dynamic)?
  override var onmouseout: ((MouseEvent) -> dynamic)?
  override var onmouseover: ((MouseEvent) -> dynamic)?
  override var onmouseup: ((MouseEvent) -> dynamic)?
  override var onwheel: ((WheelEvent) -> dynamic)?
  override var onpause: ((Event) -> dynamic)?
  override var onplay: ((Event) -> dynamic)?
  override var onplaying: ((Event) -> dynamic)?
  override var onprogress: ((ProgressEvent) -> dynamic)?
  override var onratechange: ((Event) -> dynamic)?
  override var onreset: ((Event) -> dynamic)?
  override var onresize: ((Event) -> dynamic)?
  override var onscroll: ((Event) -> dynamic)?
  override var onseeked: ((Event) -> dynamic)?
  override var onseeking: ((Event) -> dynamic)?
  override var onselect: ((Event) -> dynamic)?
  override var onshow: ((Event) -> dynamic)?
  override var onstalled: ((Event) -> dynamic)?
  override var onsubmit: ((Event) -> dynamic)?
  override var onsuspend: ((Event) -> dynamic)?
  override var ontimeupdate: ((Event) -> dynamic)?
  override var ontoggle: ((Event) -> dynamic)?
  override var onvolumechange: ((Event) -> dynamic)?
  override var onwaiting: ((Event) -> dynamic)?
  override var ongotpointercapture: ((PointerEvent) -> dynamic)?
  override var onlostpointercapture: ((PointerEvent) -> dynamic)?
  override var onpointerdown: ((PointerEvent) -> dynamic)?
  override var onpointermove: ((PointerEvent) -> dynamic)?
  override var onpointerup: ((PointerEvent) -> dynamic)?
  override var onpointercancel: ((PointerEvent) -> dynamic)?
  override var onpointerover: ((PointerEvent) -> dynamic)?
  override var onpointerout: ((PointerEvent) -> dynamic)?
  override var onpointerenter: ((PointerEvent) -> dynamic)?
  override var onpointerleave: ((PointerEvent) -> dynamic)?
  override var oncopy: ((ClipboardEvent) -> dynamic)?
  override var oncut: ((ClipboardEvent) -> dynamic)?
  override var onpaste: ((ClipboardEvent) -> dynamic)?
  override val fullscreenElement: Element?
  override val children: HTMLCollection
  override val firstElementChild: Element?
  override val lastElementChild: Element?
  override val childElementCount: Int
  fun getElementsByTagName(qualifiedName: String): HTMLCollection
  fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection
  fun getElementsByClassName(classNames: String): HTMLCollection
  fun createElement(localName: String, options: ElementCreationOptions = definedExternally): Element
  fun createElementNS(namespace: String?, qualifiedName: String, options: ElementCreationOptions = definedExternally): Element
  fun createDocumentFragment(): DocumentFragment
  fun createTextNode(data: String): Text
  fun createCDATASection(data: String): CDATASection
  fun createComment(data: String): Comment
  fun createProcessingInstruction(target: String, data: String): ProcessingInstruction
  fun importNode(node: Node, deep: Boolean = definedExternally): Node
  fun adoptNode(node: Node): Node
  fun createAttribute(localName: String): Attr
  fun createAttributeNS(namespace: String?, qualifiedName: String): Attr
  fun createEvent(`interface`: String): Event
  fun createRange(): Range
  fun createNodeIterator(root: Node, whatToShow: Int = definedExternally, filter: NodeFilter? = definedExternally): NodeIterator
  fun createNodeIterator(root: Node, whatToShow: Int = definedExternally, filter: ((Node) -> Short)? = definedExternally): NodeIterator
  fun createTreeWalker(root: Node, whatToShow: Int = definedExternally, filter: NodeFilter? = definedExternally): TreeWalker
  fun createTreeWalker(root: Node, whatToShow: Int = definedExternally, filter: ((Node) -> Short)? = definedExternally): TreeWalker
  fun getElementsByName(elementName: String): NodeList
  fun open(type: String = definedExternally, replace: String = definedExternally): Document
  fun open(url: String, name: String, features: String): Window
  fun close()
  fun write(vararg text: String)
  fun writeln(vararg text: String)
  fun hasFocus(): Boolean
  fun execCommand(commandId: String, showUI: Boolean = definedExternally, value: String = definedExternally): Boolean
  fun queryCommandEnabled(commandId: String): Boolean
  fun queryCommandIndeterm(commandId: String): Boolean
  fun queryCommandState(commandId: String): Boolean
  fun queryCommandSupported(commandId: String): Boolean
  fun queryCommandValue(commandId: String): String
  fun clear()
  fun captureEvents()
  fun releaseEvents()
  fun elementFromPoint(x: Double, y: Double): Element?
  fun elementsFromPoint(x: Double, y: Double): Array<Element>
  fun caretPositionFromPoint(x: Double, y: Double): CaretPosition?
  fun createTouch(view: Window, target: EventTarget, identifier: Int, pageX: Int, pageY: Int, screenX: Int, screenY: Int): Touch
  fun createTouchList(vararg touches: Touch): TouchList
  fun exitFullscreen(): Promise<Unit>
  override fun getElementById(elementId: String): Element?
  override fun prepend(vararg nodes: dynamic)
  override fun append(vararg nodes: dynamic)
  override fun querySelector(selectors: String): Element?
  override fun querySelectorAll(selectors: String): NodeList
  override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
  override fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
  override fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
  override fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

@kotlin.internal.InlineOnly
public inline operator fun Document.get(name: String): dynamic = asDynamic()[name]

/**
 * Exposes the JavaScript [XMLDocument](https://developer.mozilla.org/en/docs/Web/API/XMLDocument) to Kotlin
 */
public external open class XMLDocument : Document {
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

public external interface ElementCreationOptions {
  var `is`: String?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun ElementCreationOptions(`is`: String? = undefined): ElementCreationOptions {
  val o = js("({})")
  o["is"] = `is`
  return o
}

/**
 * Exposes the JavaScript [DOMImplementation](https://developer.mozilla.org/en/docs/Web/API/DOMImplementation) to Kotlin
 */
public external abstract class DOMImplementation {
  fun createDocumentType(qualifiedName: String, publicId: String, systemId: String): DocumentType
  fun createDocument(namespace: String?, qualifiedName: String, doctype: DocumentType? = definedExternally): XMLDocument
  fun createHTMLDocument(title: String = definedExternally): Document
  fun hasFeature(): Boolean
}

/**
 * Exposes the JavaScript [DocumentType](https://developer.mozilla.org/en/docs/Web/API/DocumentType) to Kotlin
 */
public external abstract class DocumentType : Node, ChildNode {
  open val name: String
  open val publicId: String
  open val systemId: String
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [DocumentFragment](https://developer.mozilla.org/en/docs/Web/API/DocumentFragment) to Kotlin
 */
public external open class DocumentFragment : Node, NonElementParentNode, ParentNode {
  override val children: HTMLCollection
  override val firstElementChild: Element?
  override val lastElementChild: Element?
  override val childElementCount: Int
  override fun getElementById(elementId: String): Element?
  override fun prepend(vararg nodes: dynamic)
  override fun append(vararg nodes: dynamic)
  override fun querySelector(selectors: String): Element?
  override fun querySelectorAll(selectors: String): NodeList
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [ShadowRoot](https://developer.mozilla.org/en/docs/Web/API/ShadowRoot) to Kotlin
 */
public external open class ShadowRoot : DocumentFragment, DocumentOrShadowRoot {
  open val mode: ShadowRootMode
  open val host: Element
  override val fullscreenElement: Element?
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

public external interface ShadowRootInit {
  var mode: ShadowRootMode?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun ShadowRootInit(mode: ShadowRootMode?): ShadowRootInit {
  val o = js("({})")
  o["mode"] = mode
  return o
}

/**
 * Exposes the JavaScript [NamedNodeMap](https://developer.mozilla.org/en/docs/Web/API/NamedNodeMap) to Kotlin
 */
public external abstract class NamedNodeMap : ItemArrayLike<Attr> {
  fun getNamedItemNS(namespace: String?, localName: String): Attr?
  fun setNamedItem(attr: Attr): Attr?
  fun setNamedItemNS(attr: Attr): Attr?
  fun removeNamedItem(qualifiedName: String): Attr
  fun removeNamedItemNS(namespace: String?, localName: String): Attr
  override fun item(index: Int): Attr?
  fun getNamedItem(qualifiedName: String): Attr?
}

@kotlin.internal.InlineOnly
public inline operator fun NamedNodeMap.get(index: Int): Attr? = asDynamic()[index]

@kotlin.internal.InlineOnly
public inline operator fun NamedNodeMap.get(qualifiedName: String): Attr? = asDynamic()[qualifiedName]

/**
 * Exposes the JavaScript [Attr](https://developer.mozilla.org/en/docs/Web/API/Attr) to Kotlin
 */
public external abstract class Attr : Node {
  open val namespaceURI: String?
  open val prefix: String?
  open val localName: String
  open val name: String
  open var value: String
  open val ownerElement: Element?
  open val specified: Boolean
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [CharacterData](https://developer.mozilla.org/en/docs/Web/API/CharacterData) to Kotlin
 */
public external abstract class CharacterData : Node, NonDocumentTypeChildNode, ChildNode {
  open var data: String
  open val length: Int
  fun substringData(offset: Int, count: Int): String
  fun appendData(data: String)
  fun insertData(offset: Int, data: String)
  fun deleteData(offset: Int, count: Int)
  fun replaceData(offset: Int, count: Int, data: String)
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [Text](https://developer.mozilla.org/en/docs/Web/API/Text) to Kotlin
 */
public external open class Text(data: String = definedExternally) : CharacterData, Slotable, GeometryUtils {
  open val wholeText: String
  override val assignedSlot: HTMLSlotElement?
  override val previousElementSibling: Element?
  override val nextElementSibling: Element?
  fun splitText(offset: Int): Text
  override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
  override fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
  override fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
  override fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
  override fun before(vararg nodes: dynamic)
  override fun after(vararg nodes: dynamic)
  override fun replaceWith(vararg nodes: dynamic)
  override fun remove()
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [CDATASection](https://developer.mozilla.org/en/docs/Web/API/CDATASection) to Kotlin
 */
public external open class CDATASection : Text {
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [ProcessingInstruction](https://developer.mozilla.org/en/docs/Web/API/ProcessingInstruction) to Kotlin
 */
public external abstract class ProcessingInstruction : CharacterData, LinkStyle, UnionElementOrProcessingInstruction {
  open val target: String
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [Comment](https://developer.mozilla.org/en/docs/Web/API/Comment) to Kotlin
 */
public external open class Comment(data: String = definedExternally) : CharacterData {
  override val previousElementSibling: Element?
  override val nextElementSibling: Element?
  override fun before(vararg nodes: dynamic)
  override fun after(vararg nodes: dynamic)
  override fun replaceWith(vararg nodes: dynamic)
  override fun remove()
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [Range](https://developer.mozilla.org/en/docs/Web/API/Range) to Kotlin
 */
public external open class Range {
  open val startContainer: Node
  open val startOffset: Int
  open val endContainer: Node
  open val endOffset: Int
  open val collapsed: Boolean
  open val commonAncestorContainer: Node
  fun setStart(node: Node, offset: Int)
  fun setEnd(node: Node, offset: Int)
  fun setStartBefore(node: Node)
  fun setStartAfter(node: Node)
  fun setEndBefore(node: Node)
  fun setEndAfter(node: Node)
  fun collapse(toStart: Boolean = definedExternally)
  fun selectNode(node: Node)
  fun selectNodeContents(node: Node)
  fun compareBoundaryPoints(how: Short, sourceRange: Range): Short
  fun deleteContents()
  fun extractContents(): DocumentFragment
  fun cloneContents(): DocumentFragment
  fun insertNode(node: Node)
  fun surroundContents(newParent: Node)
  fun cloneRange(): Range
  fun detach()
  fun isPointInRange(node: Node, offset: Int): Boolean
  fun comparePoint(node: Node, offset: Int): Short
  fun intersectsNode(node: Node): Boolean
  fun getClientRects(): Array<DOMRect>
  fun getBoundingClientRect(): DOMRect
  fun createContextualFragment(fragment: String): DocumentFragment
  
  companion object {
    val START_TO_START: Short
    val START_TO_END: Short
    val END_TO_END: Short
    val END_TO_START: Short
  }
}

/**
 * Exposes the JavaScript [NodeIterator](https://developer.mozilla.org/en/docs/Web/API/NodeIterator) to Kotlin
 */
public external abstract class NodeIterator {
  open val root: Node
  open val referenceNode: Node
  open val pointerBeforeReferenceNode: Boolean
  open val whatToShow: Int
  open val filter: NodeFilter?
  fun nextNode(): Node?
  fun previousNode(): Node?
  fun detach()
}

/**
 * Exposes the JavaScript [TreeWalker](https://developer.mozilla.org/en/docs/Web/API/TreeWalker) to Kotlin
 */
public external abstract class TreeWalker {
  open val root: Node
  open val whatToShow: Int
  open val filter: NodeFilter?
  open var currentNode: Node
  fun parentNode(): Node?
  fun firstChild(): Node?
  fun lastChild(): Node?
  fun previousSibling(): Node?
  fun nextSibling(): Node?
  fun previousNode(): Node?
  fun nextNode(): Node?
}

/**
 * Exposes the JavaScript [NodeFilter](https://developer.mozilla.org/en/docs/Web/API/NodeFilter) to Kotlin
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface NodeFilter {
  fun acceptNode(node: Node): Short
  
  companion object {
    val FILTER_ACCEPT: Short
    val FILTER_REJECT: Short
    val FILTER_SKIP: Short
    val SHOW_ALL: Int
    val SHOW_ELEMENT: Int
    val SHOW_ATTRIBUTE: Int
    val SHOW_TEXT: Int
    val SHOW_CDATA_SECTION: Int
    val SHOW_ENTITY_REFERENCE: Int
    val SHOW_ENTITY: Int
    val SHOW_PROCESSING_INSTRUCTION: Int
    val SHOW_COMMENT: Int
    val SHOW_DOCUMENT: Int
    val SHOW_DOCUMENT_TYPE: Int
    val SHOW_DOCUMENT_FRAGMENT: Int
    val SHOW_NOTATION: Int
  }
}

/**
 * Exposes the JavaScript [DOMTokenList](https://developer.mozilla.org/en/docs/Web/API/DOMTokenList) to Kotlin
 */
public external abstract class DOMTokenList : ItemArrayLike<String> {
  open var value: String
  fun contains(token: String): Boolean
  fun add(vararg tokens: String)
  fun remove(vararg tokens: String)
  fun toggle(token: String, force: Boolean = definedExternally): Boolean
  fun replace(token: String, newToken: String)
  fun supports(token: String): Boolean
  override fun item(index: Int): String?
}

@kotlin.internal.InlineOnly
public inline operator fun DOMTokenList.get(index: Int): String? = asDynamic()[index]

/**
 * Exposes the JavaScript [DOMPointReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMPointReadOnly) to Kotlin
 */
public external open class DOMPointReadOnly(x: Double, y: Double, z: Double, w: Double) {
  open val x: Double
  open val y: Double
  open val z: Double
  open val w: Double
  fun matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint
}

/**
 * Exposes the JavaScript [DOMPoint](https://developer.mozilla.org/en/docs/Web/API/DOMPoint) to Kotlin
 */
public external open class DOMPoint : DOMPointReadOnly {
  constructor(point: DOMPointInit)
  constructor(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally)
  override var x: Double
  override var y: Double
  override var z: Double
  override var w: Double
}

/**
 * Exposes the JavaScript [DOMPointInit](https://developer.mozilla.org/en/docs/Web/API/DOMPointInit) to Kotlin
 */
public external interface DOMPointInit {
  var x: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var y: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var z: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var w: Double? /* = 1.0 */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun DOMPointInit(x: Double? = 0.0, y: Double? = 0.0, z: Double? = 0.0, w: Double? = 1.0): DOMPointInit {
  val o = js("({})")
  o["x"] = x
  o["y"] = y
  o["z"] = z
  o["w"] = w
  return o
}

/**
 * Exposes the JavaScript [DOMRect](https://developer.mozilla.org/en/docs/Web/API/DOMRect) to Kotlin
 */
public external open class DOMRect(x: Double = definedExternally, y: Double = definedExternally, width: Double = definedExternally, height: Double = definedExternally) : DOMRectReadOnly {
  override var x: Double
  override var y: Double
  override var width: Double
  override var height: Double
}

/**
 * Exposes the JavaScript [DOMRectReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMRectReadOnly) to Kotlin
 */
public external open class DOMRectReadOnly(x: Double, y: Double, width: Double, height: Double) {
  open val x: Double
  open val y: Double
  open val width: Double
  open val height: Double
  open val top: Double
  open val right: Double
  open val bottom: Double
  open val left: Double
}

public external interface DOMRectInit {
  var x: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var y: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var width: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
  var height: Double? /* = 0.0 */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun DOMRectInit(x: Double? = 0.0, y: Double? = 0.0, width: Double? = 0.0, height: Double? = 0.0): DOMRectInit {
  val o = js("({})")
  o["x"] = x
  o["y"] = y
  o["width"] = width
  o["height"] = height
  return o
}

public external interface DOMRectList : ItemArrayLike<DOMRect> {
  override fun item(index: Int): DOMRect?
}

@kotlin.internal.InlineOnly
public inline operator fun DOMRectList.get(index: Int): DOMRect? = asDynamic()[index]

/**
 * Exposes the JavaScript [DOMQuad](https://developer.mozilla.org/en/docs/Web/API/DOMQuad) to Kotlin
 */
public external open class DOMQuad {
  constructor(p1: DOMPointInit = definedExternally, p2: DOMPointInit = definedExternally, p3: DOMPointInit = definedExternally, p4: DOMPointInit = definedExternally)
  constructor(rect: DOMRectInit)
  open val p1: DOMPoint
  open val p2: DOMPoint
  open val p3: DOMPoint
  open val p4: DOMPoint
  open val bounds: DOMRectReadOnly
}

/**
 * Exposes the JavaScript [DOMMatrixReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMMatrixReadOnly) to Kotlin
 */
public external open class DOMMatrixReadOnly(numberSequence: Array<Double>) {
  open val a: Double
  open val b: Double
  open val c: Double
  open val d: Double
  open val e: Double
  open val f: Double
  open val m11: Double
  open val m12: Double
  open val m13: Double
  open val m14: Double
  open val m21: Double
  open val m22: Double
  open val m23: Double
  open val m24: Double
  open val m31: Double
  open val m32: Double
  open val m33: Double
  open val m34: Double
  open val m41: Double
  open val m42: Double
  open val m43: Double
  open val m44: Double
  open val is2D: Boolean
  open val isIdentity: Boolean
  fun translate(tx: Double, ty: Double, tz: Double = definedExternally): DOMMatrix
  fun scale(scale: Double, originX: Double = definedExternally, originY: Double = definedExternally): DOMMatrix
  fun scale3d(scale: Double, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix
  fun scaleNonUniform(scaleX: Double, scaleY: Double = definedExternally, scaleZ: Double = definedExternally, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix
  fun rotate(angle: Double, originX: Double = definedExternally, originY: Double = definedExternally): DOMMatrix
  fun rotateFromVector(x: Double, y: Double): DOMMatrix
  fun rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): DOMMatrix
  fun skewX(sx: Double): DOMMatrix
  fun skewY(sy: Double): DOMMatrix
  fun multiply(other: DOMMatrix): DOMMatrix
  fun flipX(): DOMMatrix
  fun flipY(): DOMMatrix
  fun inverse(): DOMMatrix
  fun transformPoint(point: DOMPointInit = definedExternally): DOMPoint
  fun toFloat32Array(): Float32Array
  fun toFloat64Array(): Float64Array
}

/**
 * Exposes the JavaScript [DOMMatrix](https://developer.mozilla.org/en/docs/Web/API/DOMMatrix) to Kotlin
 */
public external open class DOMMatrix() : DOMMatrixReadOnly {
  constructor(transformList: String)
  constructor(other: DOMMatrixReadOnly)
  constructor(array32: Float32Array)
  constructor(array64: Float64Array)
  constructor(numberSequence: Array<Double>)
  override var a: Double
  override var b: Double
  override var c: Double
  override var d: Double
  override var e: Double
  override var f: Double
  override var m11: Double
  override var m12: Double
  override var m13: Double
  override var m14: Double
  override var m21: Double
  override var m22: Double
  override var m23: Double
  override var m24: Double
  override var m31: Double
  override var m32: Double
  override var m33: Double
  override var m34: Double
  override var m41: Double
  override var m42: Double
  override var m43: Double
  override var m44: Double
  fun multiplySelf(other: DOMMatrix): DOMMatrix
  fun preMultiplySelf(other: DOMMatrix): DOMMatrix
  fun translateSelf(tx: Double, ty: Double, tz: Double = definedExternally): DOMMatrix
  fun scaleSelf(scale: Double, originX: Double = definedExternally, originY: Double = definedExternally): DOMMatrix
  fun scale3dSelf(scale: Double, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix
  fun scaleNonUniformSelf(scaleX: Double, scaleY: Double = definedExternally, scaleZ: Double = definedExternally, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix
  fun rotateSelf(angle: Double, originX: Double = definedExternally, originY: Double = definedExternally): DOMMatrix
  fun rotateFromVectorSelf(x: Double, y: Double): DOMMatrix
  fun rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): DOMMatrix
  fun skewXSelf(sx: Double): DOMMatrix
  fun skewYSelf(sy: Double): DOMMatrix
  fun invertSelf(): DOMMatrix
  fun setMatrixValue(transformList: String): DOMMatrix
}

public external interface ScrollOptions {
  var behavior: ScrollBehavior? /* = ScrollBehavior.AUTO */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun ScrollOptions(behavior: ScrollBehavior? = ScrollBehavior.AUTO): ScrollOptions {
  val o = js("({})")
  o["behavior"] = behavior
  return o
}

/**
 * Exposes the JavaScript [ScrollToOptions](https://developer.mozilla.org/en/docs/Web/API/ScrollToOptions) to Kotlin
 */
public external interface ScrollToOptions : ScrollOptions {
  var left: Double?
    get() = definedExternally
    set(value) = definedExternally
  var top: Double?
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun ScrollToOptions(left: Double? = undefined, top: Double? = undefined, behavior: ScrollBehavior? = ScrollBehavior.AUTO): ScrollToOptions {
  val o = js("({})")
  o["left"] = left
  o["top"] = top
  o["behavior"] = behavior
  return o
}

/**
 * Exposes the JavaScript [MediaQueryList](https://developer.mozilla.org/en/docs/Web/API/MediaQueryList) to Kotlin
 */
public external abstract class MediaQueryList : EventTarget {
  open val media: String
  open val matches: Boolean
  open var onchange: ((Event) -> dynamic)?
  fun addListener(listener: EventListener?)
  fun addListener(listener: ((Event) -> Unit)?)
  fun removeListener(listener: EventListener?)
  fun removeListener(listener: ((Event) -> Unit)?)
}

/**
 * Exposes the JavaScript [MediaQueryListEvent](https://developer.mozilla.org/en/docs/Web/API/MediaQueryListEvent) to Kotlin
 */
public external open class MediaQueryListEvent(type: String, eventInitDict: MediaQueryListEventInit = definedExternally) : Event {
  open val media: String
  open val matches: Boolean
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

public external interface MediaQueryListEventInit : EventInit {
  var media: String? /* = "" */
    get() = definedExternally
    set(value) = definedExternally
  var matches: Boolean? /* = false */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun MediaQueryListEventInit(media: String? = "", matches: Boolean? = false, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): MediaQueryListEventInit {
  val o = js("({})")
  o["media"] = media
  o["matches"] = matches
  o["bubbles"] = bubbles
  o["cancelable"] = cancelable
  o["composed"] = composed
  return o
}

/**
 * Exposes the JavaScript [Screen](https://developer.mozilla.org/en/docs/Web/API/Screen) to Kotlin
 */
public external abstract class Screen {
  open val availWidth: Int
  open val availHeight: Int
  open val width: Int
  open val height: Int
  open val colorDepth: Int
  open val pixelDepth: Int
}

/**
 * Exposes the JavaScript [CaretPosition](https://developer.mozilla.org/en/docs/Web/API/CaretPosition) to Kotlin
 */
public external abstract class CaretPosition {
  open val offsetNode: Node
  open val offset: Int
  fun getClientRect(): DOMRect?
}

public external interface ScrollIntoViewOptions : ScrollOptions {
  var block: ScrollLogicalPosition? /* = ScrollLogicalPosition.CENTER */
    get() = definedExternally
    set(value) = definedExternally
  var inline: ScrollLogicalPosition? /* = ScrollLogicalPosition.CENTER */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun ScrollIntoViewOptions(block: ScrollLogicalPosition? = ScrollLogicalPosition.CENTER, inline: ScrollLogicalPosition? = ScrollLogicalPosition.CENTER, behavior: ScrollBehavior? = ScrollBehavior.AUTO): ScrollIntoViewOptions {
  val o = js("({})")
  o["block"] = block
  o["inline"] = inline
  o["behavior"] = behavior
  return o
}

public external interface BoxQuadOptions {
  var box: CSSBoxType? /* = CSSBoxType.BORDER */
    get() = definedExternally
    set(value) = definedExternally
  var relativeTo: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun BoxQuadOptions(box: CSSBoxType? = CSSBoxType.BORDER, relativeTo: dynamic = undefined): BoxQuadOptions {
  val o = js("({})")
  o["box"] = box
  o["relativeTo"] = relativeTo
  return o
}

public external interface ConvertCoordinateOptions {
  var fromBox: CSSBoxType? /* = CSSBoxType.BORDER */
    get() = definedExternally
    set(value) = definedExternally
  var toBox: CSSBoxType? /* = CSSBoxType.BORDER */
    get() = definedExternally
    set(value) = definedExternally
}

@kotlin.internal.InlineOnly
public inline fun ConvertCoordinateOptions(fromBox: CSSBoxType? = CSSBoxType.BORDER, toBox: CSSBoxType? = CSSBoxType.BORDER): ConvertCoordinateOptions {
  val o = js("({})")
  o["fromBox"] = fromBox
  o["toBox"] = toBox
  return o
}

/**
 * Exposes the JavaScript [GeometryUtils](https://developer.mozilla.org/en/docs/Web/API/GeometryUtils) to Kotlin
 */
public external interface GeometryUtils {
  fun getBoxQuads(options: BoxQuadOptions = definedExternally): Array<DOMQuad>
  fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions = definedExternally): DOMQuad
  fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions = definedExternally): DOMQuad
  fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions = definedExternally): DOMPoint
}

/**
 * Exposes the JavaScript [Touch](https://developer.mozilla.org/en/docs/Web/API/Touch) to Kotlin
 */
public external abstract class Touch {
  open val identifier: Int
  open val target: EventTarget
  open val screenX: Int
  open val screenY: Int
  open val clientX: Int
  open val clientY: Int
  open val pageX: Int
  open val pageY: Int
  open val region: String?
}

public external abstract class TouchList : ItemArrayLike<Touch> {
  override fun item(index: Int): Touch?
}

@kotlin.internal.InlineOnly
public inline operator fun TouchList.get(index: Int): Touch? = asDynamic()[index]

public external open class TouchEvent : UIEvent {
  open val touches: TouchList
  open val targetTouches: TouchList
  open val changedTouches: TouchList
  open val altKey: Boolean
  open val metaKey: Boolean
  open val ctrlKey: Boolean
  open val shiftKey: Boolean
  
  companion object {
    val NONE: Short
    val CAPTURING_PHASE: Short
    val AT_TARGET: Short
    val BUBBLING_PHASE: Short
  }
}

/**
 * Exposes the JavaScript [Image](https://developer.mozilla.org/en/docs/Web/API/Image) to Kotlin
 */
public external open class Image(width: Int = definedExternally, height: Int = definedExternally) : HTMLImageElement {
  override var onabort: ((Event) -> dynamic)?
  override var onblur: ((FocusEvent) -> dynamic)?
  override var oncancel: ((Event) -> dynamic)?
  override var oncanplay: ((Event) -> dynamic)?
  override var oncanplaythrough: ((Event) -> dynamic)?
  override var onchange: ((Event) -> dynamic)?
  override var onclick: ((MouseEvent) -> dynamic)?
  override var onclose: ((Event) -> dynamic)?
  override var oncontextmenu: ((MouseEvent) -> dynamic)?
  override var oncuechange: ((Event) -> dynamic)?
  override var ondblclick: ((MouseEvent) -> dynamic)?
  override var ondrag: ((DragEvent) -> dynamic)?
  override var ondragend: ((DragEvent) -> dynamic)?
  override var ondragenter: ((DragEvent) -> dynamic)?
  override var ondragexit: ((DragEvent) -> dynamic)?
  override var ondragleave: ((DragEvent) -> dynamic)?
  override var ondragover: ((DragEvent) -> dynamic)?
  override var ondragstart: ((DragEvent) -> dynamic)?
  override var ondrop: ((DragEvent) -> dynamic)?
  override var ondurationchange: ((Event) -> dynamic)?
  override var onemptied: ((Event) -> dynamic)?
  override var onended: ((Event) -> dynamic)?
  override var onerror: ((dynamic, String, Int, Int, Any?) -> dynamic)?
  override var onfocus: ((FocusEvent) -> dynamic)?
  override var oninput: ((InputEvent) -> dynamic)?
  override var oninvalid: ((Event) -> dynamic)?
  override var onkeydown: ((KeyboardEvent) -> dynamic)?
  override var onkeypress: ((KeyboardEvent) -> dynamic)?
  override var onkeyup: ((KeyboardEvent) -> dynamic)?
  override var onload: ((Event) -> dynamic)?
  override var onloadeddata: ((Event) -> dynamic)?
  override var onloadedmetadata: ((Event) -> dynamic)?
  override var onloadend: ((Event) -> dynamic)?
  override var onloadstart: ((ProgressEvent) -> dynamic)?
  override var onmousedown: ((MouseEvent) -> dynamic)?
  override var onmouseenter: ((MouseEvent) -> dynamic)?
  override var onmouseleave: ((MouseEvent) -> dynamic)?
  override var onmousemove: ((MouseEvent) -> dynamic)?
  override var onmouseout: ((MouseEvent) -> dynamic)?
  override var onmouseover: ((MouseEvent) -> dynamic)?
  override var onmouseup: ((MouseEvent) -> dynamic)?
  override var onwheel: ((WheelEvent) -> dynamic)?
  override var onpause: ((Event) -> dynamic)?
  override var onplay: ((Event) -> dynamic)?
  override var onplaying: ((Event) -> dynamic)?
  override var onprogress: ((ProgressEvent) -> dynamic)?
  override var onratechange: ((Event) -> dynamic)?
  override var onreset: ((Event) -> dynamic)?
  override var onresize: ((Event) -> dynamic)?
  override var onscroll: ((Event) -> dynamic)?
  override var onseeked: ((Event) -> dynamic)?
  override var onseeking: ((Event) -> dynamic)?
  override var onselect: ((Event) -> dynamic)?
  override var onshow: ((Event) -> dynamic)?
  override var onstalled: ((Event) -> dynamic)?
  override var onsubmit: ((Event) -> dynamic)?
  override var onsuspend: ((Event) -> dynamic)?
  override var ontimeupdate: ((Event) -> dynamic)?
  override var ontoggle: ((Event) -> dynamic)?
  override var onvolumechange: ((Event) -> dynamic)?
  override var onwaiting: ((Event) -> dynamic)?
  override var ongotpointercapture: ((PointerEvent) -> dynamic)?
  override var onlostpointercapture: ((PointerEvent) -> dynamic)?
  override var onpointerdown: ((PointerEvent) -> dynamic)?
  override var onpointermove: ((PointerEvent) -> dynamic)?
  override var onpointerup: ((PointerEvent) -> dynamic)?
  override var onpointercancel: ((PointerEvent) -> dynamic)?
  override var onpointerover: ((PointerEvent) -> dynamic)?
  override var onpointerout: ((PointerEvent) -> dynamic)?
  override var onpointerenter: ((PointerEvent) -> dynamic)?
  override var onpointerleave: ((PointerEvent) -> dynamic)?
  override var oncopy: ((ClipboardEvent) -> dynamic)?
  override var oncut: ((ClipboardEvent) -> dynamic)?
  override var onpaste: ((ClipboardEvent) -> dynamic)?
  override var contentEditable: String
  override val isContentEditable: Boolean
  override val style: CSSStyleDeclaration
  override val children: HTMLCollection
  override val firstElementChild: Element?
  override val lastElementChild: Element?
  override val childElementCount: Int
  override val previousElementSibling: Element?
  override val nextElementSibling: Element?
  override val assignedSlot: HTMLSlotElement?
  override fun prepend(vararg nodes: dynamic)
  override fun append(vararg nodes: dynamic)
  override fun querySelector(selectors: String): Element?
  override fun querySelectorAll(selectors: String): NodeList
  override fun before(vararg nodes: dynamic)
  override fun after(vararg nodes: dynamic)
  override fun replaceWith(vararg nodes: dynamic)
  override fun remove()
  override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
  override fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
  override fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
  override fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

public external open class Audio(src: String = definedExternally) : HTMLAudioElement {
  override var onabort: ((Event) -> dynamic)?
  override var onblur: ((FocusEvent) -> dynamic)?
  override var oncancel: ((Event) -> dynamic)?
  override var oncanplay: ((Event) -> dynamic)?
  override var oncanplaythrough: ((Event) -> dynamic)?
  override var onchange: ((Event) -> dynamic)?
  override var onclick: ((MouseEvent) -> dynamic)?
  override var onclose: ((Event) -> dynamic)?
  override var oncontextmenu: ((MouseEvent) -> dynamic)?
  override var oncuechange: ((Event) -> dynamic)?
  override var ondblclick: ((MouseEvent) -> dynamic)?
  override var ondrag: ((DragEvent) -> dynamic)?
  override var ondragend: ((DragEvent) -> dynamic)?
  override var ondragenter: ((DragEvent) -> dynamic)?
  override var ondragexit: ((DragEvent) -> dynamic)?
  override var ondragleave: ((DragEvent) -> dynamic)?
  override var ondragover: ((DragEvent) -> dynamic)?
  override var ondragstart: ((DragEvent) -> dynamic)?
  override var ondrop: ((DragEvent) -> dynamic)?
  override var ondurationchange: ((Event) -> dynamic)?
  override var onemptied: ((Event) -> dynamic)?
  override var onended: ((Event) -> dynamic)?
  override var onerror: ((dynamic, String, Int, Int, Any?) -> dynamic)?
  override var onfocus: ((FocusEvent) -> dynamic)?
  override var oninput: ((InputEvent) -> dynamic)?
  override var oninvalid: ((Event) -> dynamic)?
  override var onkeydown: ((KeyboardEvent) -> dynamic)?
  override var onkeypress: ((KeyboardEvent) -> dynamic)?
  override var onkeyup: ((KeyboardEvent) -> dynamic)?
  override var onload: ((Event) -> dynamic)?
  override var onloadeddata: ((Event) -> dynamic)?
  override var onloadedmetadata: ((Event) -> dynamic)?
  override var onloadend: ((Event) -> dynamic)?
  override var onloadstart: ((ProgressEvent) -> dynamic)?
  override var onmousedown: ((MouseEvent) -> dynamic)?
  override var onmouseenter: ((MouseEvent) -> dynamic)?
  override var onmouseleave: ((MouseEvent) -> dynamic)?
  override var onmousemove: ((MouseEvent) -> dynamic)?
  override var onmouseout: ((MouseEvent) -> dynamic)?
  override var onmouseover: ((MouseEvent) -> dynamic)?
  override var onmouseup: ((MouseEvent) -> dynamic)?
  override var onwheel: ((WheelEvent) -> dynamic)?
  override var onpause: ((Event) -> dynamic)?
  override var onplay: ((Event) -> dynamic)?
  override var onplaying: ((Event) -> dynamic)?
  override var onprogress: ((ProgressEvent) -> dynamic)?
  override var onratechange: ((Event) -> dynamic)?
  override var onreset: ((Event) -> dynamic)?
  override var onresize: ((Event) -> dynamic)?
  override var onscroll: ((Event) -> dynamic)?
  override var onseeked: ((Event) -> dynamic)?
  override var onseeking: ((Event) -> dynamic)?
  override var onselect: ((Event) -> dynamic)?
  override var onshow: ((Event) -> dynamic)?
  override var onstalled: ((Event) -> dynamic)?
  override var onsubmit: ((Event) -> dynamic)?
  override var onsuspend: ((Event) -> dynamic)?
  override var ontimeupdate: ((Event) -> dynamic)?
  override var ontoggle: ((Event) -> dynamic)?
  override var onvolumechange: ((Event) -> dynamic)?
  override var onwaiting: ((Event) -> dynamic)?
  override var ongotpointercapture: ((PointerEvent) -> dynamic)?
  override var onlostpointercapture: ((PointerEvent) -> dynamic)?
  override var onpointerdown: ((PointerEvent) -> dynamic)?
  override var onpointermove: ((PointerEvent) -> dynamic)?
  override var onpointerup: ((PointerEvent) -> dynamic)?
  override var onpointercancel: ((PointerEvent) -> dynamic)?
  override var onpointerover: ((PointerEvent) -> dynamic)?
  override var onpointerout: ((PointerEvent) -> dynamic)?
  override var onpointerenter: ((PointerEvent) -> dynamic)?
  override var onpointerleave: ((PointerEvent) -> dynamic)?
  override var oncopy: ((ClipboardEvent) -> dynamic)?
  override var oncut: ((ClipboardEvent) -> dynamic)?
  override var onpaste: ((ClipboardEvent) -> dynamic)?
  override var contentEditable: String
  override val isContentEditable: Boolean
  override val style: CSSStyleDeclaration
  override val children: HTMLCollection
  override val firstElementChild: Element?
  override val lastElementChild: Element?
  override val childElementCount: Int
  override val previousElementSibling: Element?
  override val nextElementSibling: Element?
  override val assignedSlot: HTMLSlotElement?
  override fun prepend(vararg nodes: dynamic)
  override fun append(vararg nodes: dynamic)
  override fun querySelector(selectors: String): Element?
  override fun querySelectorAll(selectors: String): NodeList
  override fun before(vararg nodes: dynamic)
  override fun after(vararg nodes: dynamic)
  override fun replaceWith(vararg nodes: dynamic)
  override fun remove()
  override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
  override fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
  override fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
  override fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
  
  companion object {
    val NETWORK_EMPTY: Short
    val NETWORK_IDLE: Short
    val NETWORK_LOADING: Short
    val NETWORK_NO_SOURCE: Short
    val HAVE_NOTHING: Short
    val HAVE_METADATA: Short
    val HAVE_CURRENT_DATA: Short
    val HAVE_FUTURE_DATA: Short
    val HAVE_ENOUGH_DATA: Short
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

/**
 * Exposes the JavaScript [Option](https://developer.mozilla.org/en/docs/Web/API/Option) to Kotlin
 */
public external open class Option(text: String = definedExternally, value: String = definedExternally, defaultSelected: Boolean = definedExternally, selected: Boolean = definedExternally) : HTMLOptionElement {
  override var onabort: ((Event) -> dynamic)?
  override var onblur: ((FocusEvent) -> dynamic)?
  override var oncancel: ((Event) -> dynamic)?
  override var oncanplay: ((Event) -> dynamic)?
  override var oncanplaythrough: ((Event) -> dynamic)?
  override var onchange: ((Event) -> dynamic)?
  override var onclick: ((MouseEvent) -> dynamic)?
  override var onclose: ((Event) -> dynamic)?
  override var oncontextmenu: ((MouseEvent) -> dynamic)?
  override var oncuechange: ((Event) -> dynamic)?
  override var ondblclick: ((MouseEvent) -> dynamic)?
  override var ondrag: ((DragEvent) -> dynamic)?
  override var ondragend: ((DragEvent) -> dynamic)?
  override var ondragenter: ((DragEvent) -> dynamic)?
  override var ondragexit: ((DragEvent) -> dynamic)?
  override var ondragleave: ((DragEvent) -> dynamic)?
  override var ondragover: ((DragEvent) -> dynamic)?
  override var ondragstart: ((DragEvent) -> dynamic)?
  override var ondrop: ((DragEvent) -> dynamic)?
  override var ondurationchange: ((Event) -> dynamic)?
  override var onemptied: ((Event) -> dynamic)?
  override var onended: ((Event) -> dynamic)?
  override var onerror: ((dynamic, String, Int, Int, Any?) -> dynamic)?
  override var onfocus: ((FocusEvent) -> dynamic)?
  override var oninput: ((InputEvent) -> dynamic)?
  override var oninvalid: ((Event) -> dynamic)?
  override var onkeydown: ((KeyboardEvent) -> dynamic)?
  override var onkeypress: ((KeyboardEvent) -> dynamic)?
  override var onkeyup: ((KeyboardEvent) -> dynamic)?
  override var onload: ((Event) -> dynamic)?
  override var onloadeddata: ((Event) -> dynamic)?
  override var onloadedmetadata: ((Event) -> dynamic)?
  override var onloadend: ((Event) -> dynamic)?
  override var onloadstart: ((ProgressEvent) -> dynamic)?
  override var onmousedown: ((MouseEvent) -> dynamic)?
  override var onmouseenter: ((MouseEvent) -> dynamic)?
  override var onmouseleave: ((MouseEvent) -> dynamic)?
  override var onmousemove: ((MouseEvent) -> dynamic)?
  override var onmouseout: ((MouseEvent) -> dynamic)?
  override var onmouseover: ((MouseEvent) -> dynamic)?
  override var onmouseup: ((MouseEvent) -> dynamic)?
  override var onwheel: ((WheelEvent) -> dynamic)?
  override var onpause: ((Event) -> dynamic)?
  override var onplay: ((Event) -> dynamic)?
  override var onplaying: ((Event) -> dynamic)?
  override var onprogress: ((ProgressEvent) -> dynamic)?
  override var onratechange: ((Event) -> dynamic)?
  override var onreset: ((Event) -> dynamic)?
  override var onresize: ((Event) -> dynamic)?
  override var onscroll: ((Event) -> dynamic)?
  override var onseeked: ((Event) -> dynamic)?
  override var onseeking: ((Event) -> dynamic)?
  override var onselect: ((Event) -> dynamic)?
  override var onshow: ((Event) -> dynamic)?
  override var onstalled: ((Event) -> dynamic)?
  override var onsubmit: ((Event) -> dynamic)?
  override var onsuspend: ((Event) -> dynamic)?
  override var ontimeupdate: ((Event) -> dynamic)?
  override var ontoggle: ((Event) -> dynamic)?
  override var onvolumechange: ((Event) -> dynamic)?
  override var onwaiting: ((Event) -> dynamic)?
  override var ongotpointercapture: ((PointerEvent) -> dynamic)?
  override var onlostpointercapture: ((PointerEvent) -> dynamic)?
  override var onpointerdown: ((PointerEvent) -> dynamic)?
  override var onpointermove: ((PointerEvent) -> dynamic)?
  override var onpointerup: ((PointerEvent) -> dynamic)?
  override var onpointercancel: ((PointerEvent) -> dynamic)?
  override var onpointerover: ((PointerEvent) -> dynamic)?
  override var onpointerout: ((PointerEvent) -> dynamic)?
  override var onpointerenter: ((PointerEvent) -> dynamic)?
  override var onpointerleave: ((PointerEvent) -> dynamic)?
  override var oncopy: ((ClipboardEvent) -> dynamic)?
  override var oncut: ((ClipboardEvent) -> dynamic)?
  override var onpaste: ((ClipboardEvent) -> dynamic)?
  override var contentEditable: String
  override val isContentEditable: Boolean
  override val style: CSSStyleDeclaration
  override val children: HTMLCollection
  override val firstElementChild: Element?
  override val lastElementChild: Element?
  override val childElementCount: Int
  override val previousElementSibling: Element?
  override val nextElementSibling: Element?
  override val assignedSlot: HTMLSlotElement?
  override fun prepend(vararg nodes: dynamic)
  override fun append(vararg nodes: dynamic)
  override fun querySelector(selectors: String): Element?
  override fun querySelectorAll(selectors: String): NodeList
  override fun before(vararg nodes: dynamic)
  override fun after(vararg nodes: dynamic)
  override fun replaceWith(vararg nodes: dynamic)
  override fun remove()
  override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
  override fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
  override fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
  override fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
  
  companion object {
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short
    val TEXT_NODE: Short
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short
    val PROCESSING_INSTRUCTION_NODE: Short
    val COMMENT_NODE: Short
    val DOCUMENT_NODE: Short
    val DOCUMENT_TYPE_NODE: Short
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short
    val DOCUMENT_POSITION_DISCONNECTED: Short
    val DOCUMENT_POSITION_PRECEDING: Short
    val DOCUMENT_POSITION_FOLLOWING: Short
    val DOCUMENT_POSITION_CONTAINS: Short
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
  }
}

public external interface UnionElementOrRadioNodeList

public external interface UnionAudioTrackOrTextTrackOrVideoTrack

public external interface UnionElementOrMouseEvent

public external interface HTMLOrSVGImageElement : CanvasImageSource

public external interface ImageBitmapSource

public external interface UnionMessagePortOrWindowProxy

public external interface HTMLOrSVGScriptElement

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface DocumentReadyState {
  companion object
}

public inline val DocumentReadyState.Companion.LOADING: DocumentReadyState get() = "loading".asDynamic().unsafeCast<DocumentReadyState>()

public inline val DocumentReadyState.Companion.INTERACTIVE: DocumentReadyState get() = "interactive".asDynamic().unsafeCast<DocumentReadyState>()

public inline val DocumentReadyState.Companion.COMPLETE: DocumentReadyState get() = "complete".asDynamic().unsafeCast<DocumentReadyState>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface CanPlayTypeResult {
  companion object
}

public inline val CanPlayTypeResult.Companion.EMPTY: CanPlayTypeResult get() = "".asDynamic().unsafeCast<CanPlayTypeResult>()

public inline val CanPlayTypeResult.Companion.MAYBE: CanPlayTypeResult get() = "maybe".asDynamic().unsafeCast<CanPlayTypeResult>()

public inline val CanPlayTypeResult.Companion.PROBABLY: CanPlayTypeResult get() = "probably".asDynamic().unsafeCast<CanPlayTypeResult>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface TextTrackMode {
  companion object
}

public inline val TextTrackMode.Companion.DISABLED: TextTrackMode get() = "disabled".asDynamic().unsafeCast<TextTrackMode>()

public inline val TextTrackMode.Companion.HIDDEN: TextTrackMode get() = "hidden".asDynamic().unsafeCast<TextTrackMode>()

public inline val TextTrackMode.Companion.SHOWING: TextTrackMode get() = "showing".asDynamic().unsafeCast<TextTrackMode>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface TextTrackKind {
  companion object
}

public inline val TextTrackKind.Companion.SUBTITLES: TextTrackKind get() = "subtitles".asDynamic().unsafeCast<TextTrackKind>()

public inline val TextTrackKind.Companion.CAPTIONS: TextTrackKind get() = "captions".asDynamic().unsafeCast<TextTrackKind>()

public inline val TextTrackKind.Companion.DESCRIPTIONS: TextTrackKind get() = "descriptions".asDynamic().unsafeCast<TextTrackKind>()

public inline val TextTrackKind.Companion.CHAPTERS: TextTrackKind get() = "chapters".asDynamic().unsafeCast<TextTrackKind>()

public inline val TextTrackKind.Companion.METADATA: TextTrackKind get() = "metadata".asDynamic().unsafeCast<TextTrackKind>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface SelectionMode {
  companion object
}

public inline val SelectionMode.Companion.SELECT: SelectionMode get() = "select".asDynamic().unsafeCast<SelectionMode>()

public inline val SelectionMode.Companion.START: SelectionMode get() = "start".asDynamic().unsafeCast<SelectionMode>()

public inline val SelectionMode.Companion.END: SelectionMode get() = "end".asDynamic().unsafeCast<SelectionMode>()

public inline val SelectionMode.Companion.PRESERVE: SelectionMode get() = "preserve".asDynamic().unsafeCast<SelectionMode>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface CanvasFillRule {
  companion object
}

public inline val CanvasFillRule.Companion.NONZERO: CanvasFillRule get() = "nonzero".asDynamic().unsafeCast<CanvasFillRule>()

public inline val CanvasFillRule.Companion.EVENODD: CanvasFillRule get() = "evenodd".asDynamic().unsafeCast<CanvasFillRule>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ImageSmoothingQuality {
  companion object
}

public inline val ImageSmoothingQuality.Companion.LOW: ImageSmoothingQuality get() = "low".asDynamic().unsafeCast<ImageSmoothingQuality>()

public inline val ImageSmoothingQuality.Companion.MEDIUM: ImageSmoothingQuality get() = "medium".asDynamic().unsafeCast<ImageSmoothingQuality>()

public inline val ImageSmoothingQuality.Companion.HIGH: ImageSmoothingQuality get() = "high".asDynamic().unsafeCast<ImageSmoothingQuality>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface CanvasLineCap {
  companion object
}

public inline val CanvasLineCap.Companion.BUTT: CanvasLineCap get() = "butt".asDynamic().unsafeCast<CanvasLineCap>()

public inline val CanvasLineCap.Companion.ROUND: CanvasLineCap get() = "round".asDynamic().unsafeCast<CanvasLineCap>()

public inline val CanvasLineCap.Companion.SQUARE: CanvasLineCap get() = "square".asDynamic().unsafeCast<CanvasLineCap>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface CanvasLineJoin {
  companion object
}

public inline val CanvasLineJoin.Companion.ROUND: CanvasLineJoin get() = "round".asDynamic().unsafeCast<CanvasLineJoin>()

public inline val CanvasLineJoin.Companion.BEVEL: CanvasLineJoin get() = "bevel".asDynamic().unsafeCast<CanvasLineJoin>()

public inline val CanvasLineJoin.Companion.MITER: CanvasLineJoin get() = "miter".asDynamic().unsafeCast<CanvasLineJoin>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface CanvasTextAlign {
  companion object
}

public inline val CanvasTextAlign.Companion.START: CanvasTextAlign get() = "start".asDynamic().unsafeCast<CanvasTextAlign>()

public inline val CanvasTextAlign.Companion.END: CanvasTextAlign get() = "end".asDynamic().unsafeCast<CanvasTextAlign>()

public inline val CanvasTextAlign.Companion.LEFT: CanvasTextAlign get() = "left".asDynamic().unsafeCast<CanvasTextAlign>()

public inline val CanvasTextAlign.Companion.RIGHT: CanvasTextAlign get() = "right".asDynamic().unsafeCast<CanvasTextAlign>()

public inline val CanvasTextAlign.Companion.CENTER: CanvasTextAlign get() = "center".asDynamic().unsafeCast<CanvasTextAlign>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface CanvasTextBaseline {
  companion object
}

public inline val CanvasTextBaseline.Companion.TOP: CanvasTextBaseline get() = "top".asDynamic().unsafeCast<CanvasTextBaseline>()

public inline val CanvasTextBaseline.Companion.HANGING: CanvasTextBaseline get() = "hanging".asDynamic().unsafeCast<CanvasTextBaseline>()

public inline val CanvasTextBaseline.Companion.MIDDLE: CanvasTextBaseline get() = "middle".asDynamic().unsafeCast<CanvasTextBaseline>()

public inline val CanvasTextBaseline.Companion.ALPHABETIC: CanvasTextBaseline get() = "alphabetic".asDynamic().unsafeCast<CanvasTextBaseline>()

public inline val CanvasTextBaseline.Companion.IDEOGRAPHIC: CanvasTextBaseline get() = "ideographic".asDynamic().unsafeCast<CanvasTextBaseline>()

public inline val CanvasTextBaseline.Companion.BOTTOM: CanvasTextBaseline get() = "bottom".asDynamic().unsafeCast<CanvasTextBaseline>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface CanvasDirection {
  companion object
}

public inline val CanvasDirection.Companion.LTR: CanvasDirection get() = "ltr".asDynamic().unsafeCast<CanvasDirection>()

public inline val CanvasDirection.Companion.RTL: CanvasDirection get() = "rtl".asDynamic().unsafeCast<CanvasDirection>()

public inline val CanvasDirection.Companion.INHERIT: CanvasDirection get() = "inherit".asDynamic().unsafeCast<CanvasDirection>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ScrollRestoration {
  companion object
}

public inline val ScrollRestoration.Companion.AUTO: ScrollRestoration get() = "auto".asDynamic().unsafeCast<ScrollRestoration>()

public inline val ScrollRestoration.Companion.MANUAL: ScrollRestoration get() = "manual".asDynamic().unsafeCast<ScrollRestoration>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ImageOrientation {
  companion object
}

public inline val ImageOrientation.Companion.NONE: ImageOrientation get() = "none".asDynamic().unsafeCast<ImageOrientation>()

public inline val ImageOrientation.Companion.FLIPY: ImageOrientation get() = "flipY".asDynamic().unsafeCast<ImageOrientation>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface PremultiplyAlpha {
  companion object
}

public inline val PremultiplyAlpha.Companion.NONE: PremultiplyAlpha get() = "none".asDynamic().unsafeCast<PremultiplyAlpha>()

public inline val PremultiplyAlpha.Companion.PREMULTIPLY: PremultiplyAlpha get() = "premultiply".asDynamic().unsafeCast<PremultiplyAlpha>()

public inline val PremultiplyAlpha.Companion.DEFAULT: PremultiplyAlpha get() = "default".asDynamic().unsafeCast<PremultiplyAlpha>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ColorSpaceConversion {
  companion object
}

public inline val ColorSpaceConversion.Companion.NONE: ColorSpaceConversion get() = "none".asDynamic().unsafeCast<ColorSpaceConversion>()

public inline val ColorSpaceConversion.Companion.DEFAULT: ColorSpaceConversion get() = "default".asDynamic().unsafeCast<ColorSpaceConversion>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ResizeQuality {
  companion object
}

public inline val ResizeQuality.Companion.PIXELATED: ResizeQuality get() = "pixelated".asDynamic().unsafeCast<ResizeQuality>()

public inline val ResizeQuality.Companion.LOW: ResizeQuality get() = "low".asDynamic().unsafeCast<ResizeQuality>()

public inline val ResizeQuality.Companion.MEDIUM: ResizeQuality get() = "medium".asDynamic().unsafeCast<ResizeQuality>()

public inline val ResizeQuality.Companion.HIGH: ResizeQuality get() = "high".asDynamic().unsafeCast<ResizeQuality>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface BinaryType {
  companion object
}

public inline val BinaryType.Companion.BLOB: BinaryType get() = "blob".asDynamic().unsafeCast<BinaryType>()

public inline val BinaryType.Companion.ARRAYBUFFER: BinaryType get() = "arraybuffer".asDynamic().unsafeCast<BinaryType>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface WorkerType {
  companion object
}

public inline val WorkerType.Companion.CLASSIC: WorkerType get() = "classic".asDynamic().unsafeCast<WorkerType>()

public inline val WorkerType.Companion.MODULE: WorkerType get() = "module".asDynamic().unsafeCast<WorkerType>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ShadowRootMode {
  companion object
}

public inline val ShadowRootMode.Companion.OPEN: ShadowRootMode get() = "open".asDynamic().unsafeCast<ShadowRootMode>()

public inline val ShadowRootMode.Companion.CLOSED: ShadowRootMode get() = "closed".asDynamic().unsafeCast<ShadowRootMode>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ScrollBehavior {
  companion object
}

public inline val ScrollBehavior.Companion.AUTO: ScrollBehavior get() = "auto".asDynamic().unsafeCast<ScrollBehavior>()

public inline val ScrollBehavior.Companion.INSTANT: ScrollBehavior get() = "instant".asDynamic().unsafeCast<ScrollBehavior>()

public inline val ScrollBehavior.Companion.SMOOTH: ScrollBehavior get() = "smooth".asDynamic().unsafeCast<ScrollBehavior>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ScrollLogicalPosition {
  companion object
}

public inline val ScrollLogicalPosition.Companion.START: ScrollLogicalPosition get() = "start".asDynamic().unsafeCast<ScrollLogicalPosition>()

public inline val ScrollLogicalPosition.Companion.CENTER: ScrollLogicalPosition get() = "center".asDynamic().unsafeCast<ScrollLogicalPosition>()

public inline val ScrollLogicalPosition.Companion.END: ScrollLogicalPosition get() = "end".asDynamic().unsafeCast<ScrollLogicalPosition>()

public inline val ScrollLogicalPosition.Companion.NEAREST: ScrollLogicalPosition get() = "nearest".asDynamic().unsafeCast<ScrollLogicalPosition>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface CSSBoxType {
  companion object
}

public inline val CSSBoxType.Companion.MARGIN: CSSBoxType get() = "margin".asDynamic().unsafeCast<CSSBoxType>()

public inline val CSSBoxType.Companion.BORDER: CSSBoxType get() = "border".asDynamic().unsafeCast<CSSBoxType>()

public inline val CSSBoxType.Companion.PADDING: CSSBoxType get() = "padding".asDynamic().unsafeCast<CSSBoxType>()

public inline val CSSBoxType.Companion.CONTENT: CSSBoxType get() = "content".asDynamic().unsafeCast<CSSBoxType>()