package lt.petuska.kvdom.dom.w3c.fetch

import kotlin.js.then

/**
 * Exposes the JavaScript [Promise object](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Promise) to Kotlin.
 */
actual typealias Promise<out T> = kotlin.js.Promise<T>

actual inline fun <T, S> Promise<Promise<T>>.then(noinline onFulfilled: ((T) -> S)?): Promise<S> = then(onFulfilled)
actual inline fun <T, S> Promise<Promise<T>>.then(
  noinline onFulfilled: ((T) -> S)?,
  noinline onRejected: ((Throwable) -> S)?
): Promise<S> = then(onFulfilled, onRejected)