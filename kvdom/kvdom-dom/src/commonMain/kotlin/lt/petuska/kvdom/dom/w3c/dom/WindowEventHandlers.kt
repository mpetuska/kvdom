package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [WindowEventHandlers](https://developer.mozilla.org/en/docs/Web/API/WindowEventHandlers) to Kotlin
 */
expect interface WindowEventHandlers {
  var onafterprint: ((Event) -> Any)?
  var onbeforeprint: ((Event) -> Any)?
  var onbeforeunload: ((BeforeUnloadEvent) -> String?)?
  var onhashchange: ((HashChangeEvent) -> Any)?
  var onlanguagechange: ((Event) -> Any)?
  var onmessage: ((MessageEvent) -> Any)?
  var onoffline: ((Event) -> Any)?
  var ononline: ((Event) -> Any)?
  var onpagehide: ((PageTransitionEvent) -> Any)?
  var onpageshow: ((PageTransitionEvent) -> Any)?
  var onpopstate: ((PopStateEvent) -> Any)?
  var onrejectionhandled: ((Event) -> Any)?
  var onstorage: ((StorageEvent) -> Any)?
  var onunhandledrejection: ((PromiseRejectionEvent) -> Any)?
  var onunload: ((Event) -> Any)?
}