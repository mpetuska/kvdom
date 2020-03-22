package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.w3c.dom.events.Event

/**
 * Exposes the JavaScript [WindowEventHandlers](https://developer.mozilla.org/en/docs/Web/API/WindowEventHandlers) to Kotlin
 */
actual interface WindowEventHandlers {
  actual var onafterprint: ((Event) -> Any)?
  actual var onbeforeprint: ((Event) -> Any)?
  actual var onbeforeunload: ((BeforeUnloadEvent) -> String?)?
  actual var onhashchange: ((HashChangeEvent) -> Any)?
  actual var onlanguagechange: ((Event) -> Any)?
  actual var onmessage: ((MessageEvent) -> Any)?
  actual var onoffline: ((Event) -> Any)?
  actual var ononline: ((Event) -> Any)?
  actual var onpagehide: ((PageTransitionEvent) -> Any)?
  actual var onpageshow: ((PageTransitionEvent) -> Any)?
  actual var onpopstate: ((PopStateEvent) -> Any)?
  actual var onrejectionhandled: ((Event) -> Any)?
  actual var onstorage: ((StorageEvent) -> Any)?
  actual var onunhandledrejection: ((PromiseRejectionEvent) -> Any)?
  actual var onunload: ((Event) -> Any)?
}