package lt.petuska.kvdom.dom.w3c.performance

import lt.petuska.kvdom.dom.w3c.dom.events.EventTarget


/**
 * Exposes the JavaScript [Performance](https://developer.mozilla.org/en/docs/Web/API/Performance) to Kotlin
 */
public abstract external class Performance : EventTarget {
  open val timing: PerformanceTiming
  open val navigation: PerformanceNavigation
  fun now(): Double
}

external interface GlobalPerformance {
  val performance: Performance
}

/**
 * Exposes the JavaScript [PerformanceTiming](https://developer.mozilla.org/en/docs/Web/API/PerformanceTiming) to Kotlin
 */
public abstract external class PerformanceTiming {
  open val navigationStart: Number
  open val unloadEventStart: Number
  open val unloadEventEnd: Number
  open val redirectStart: Number
  open val redirectEnd: Number
  open val fetchStart: Number
  open val domainLookupStart: Number
  open val domainLookupEnd: Number
  open val connectStart: Number
  open val connectEnd: Number
  open val secureConnectionStart: Number
  open val requestStart: Number
  open val responseStart: Number
  open val responseEnd: Number
  open val domLoading: Number
  open val domInteractive: Number
  open val domContentLoadedEventStart: Number
  open val domContentLoadedEventEnd: Number
  open val domComplete: Number
  open val loadEventStart: Number
  open val loadEventEnd: Number
}

/**
 * Exposes the JavaScript [PerformanceNavigation](https://developer.mozilla.org/en/docs/Web/API/PerformanceNavigation) to Kotlin
 */
public abstract external class PerformanceNavigation {
  open val type: Short
  open val redirectCount: Short
  
  companion object {
    val TYPE_NAVIGATE: Short
    val TYPE_RELOAD: Short
    val TYPE_BACK_FORWARD: Short
    val TYPE_RESERVED: Short
  }
}