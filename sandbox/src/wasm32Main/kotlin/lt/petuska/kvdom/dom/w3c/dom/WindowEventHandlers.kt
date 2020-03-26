package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [WindowEventHandlers](https://developer.mozilla.org/en/docs/Web/API/WindowEventHandlers) to Kotlin
 */
actual interface WindowEventHandlers {
  actual var onafterprint: ((Event) -> Dynamic)?
  actual var onbeforeprint: ((Event) -> Dynamic)?
  actual var onbeforeunload: ((BeforeUnloadEvent) -> String?)?
  actual var onhashchange: ((HashChangeEvent) -> Dynamic)?
  actual var onlanguagechange: ((Event) -> Dynamic)?
  actual var onmessage: ((MessageEvent) -> Dynamic)?
  actual var onoffline: ((Event) -> Dynamic)?
  actual var ononline: ((Event) -> Dynamic)?
  actual var onpagehide: ((PageTransitionEvent) -> Dynamic)?
  actual var onpageshow: ((PageTransitionEvent) -> Dynamic)?
  actual var onpopstate: ((PopStateEvent) -> Dynamic)?
  actual var onrejectionhandled: ((Event) -> Dynamic)?
  actual var onstorage: ((StorageEvent) -> Dynamic)?
  actual var onunhandledrejection: ((PromiseRejectionEvent) -> Dynamic)?
  actual var onunload: ((Event) -> Dynamic)?
}