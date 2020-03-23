package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.Dynamic
import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [WindowEventHandlers](https://developer.mozilla.org/en/docs/Web/API/WindowEventHandlers) to Kotlin
 */
expect interface WindowEventHandlers {
  var onafterprint: ((Event) -> Dynamic)?
  var onbeforeprint: ((Event) -> Dynamic)?
  var onbeforeunload: ((BeforeUnloadEvent) -> String?)?
  var onhashchange: ((HashChangeEvent) -> Dynamic)?
  var onlanguagechange: ((Event) -> Dynamic)?
  var onmessage: ((MessageEvent) -> Dynamic)?
  var onoffline: ((Event) -> Dynamic)?
  var ononline: ((Event) -> Dynamic)?
  var onpagehide: ((PageTransitionEvent) -> Dynamic)?
  var onpageshow: ((PageTransitionEvent) -> Dynamic)?
  var onpopstate: ((PopStateEvent) -> Dynamic)?
  var onrejectionhandled: ((Event) -> Dynamic)?
  var onstorage: ((StorageEvent) -> Dynamic)?
  var onunhandledrejection: ((PromiseRejectionEvent) -> Dynamic)?
  var onunload: ((Event) -> Dynamic)?
}