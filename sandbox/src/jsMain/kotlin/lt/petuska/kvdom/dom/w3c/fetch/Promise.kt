package lt.petuska.kvdom.dom.w3c.fetch

/**
 * Exposes the JavaScript [Promise object](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Promise) to Kotlin.
 */
@Suppress("NOT_DOCUMENTED")
actual open external class Promise<out T> actual constructor(executor: (resolve: (T) -> Unit, reject: (Throwable) -> Unit) -> Unit) {
  actual open fun <S> then(onFulfilled: ((T) -> S)?): Promise<S>
  actual open fun <S> then(
    onFulfilled: ((T) -> S)?,
    onRejected: ((Throwable) -> S)?
  ): Promise<S>
  
  actual open fun <S> catch(onRejected: (Throwable) -> S): Promise<S>
  
  actual companion object {
    actual fun <S> all(promise: Array<out Promise<S>>): Promise<Array<out S>>
    
    actual fun <S> race(promise: Array<out Promise<S>>): Promise<S>
    
    actual fun reject(e: Throwable): Promise<Nothing>
    
    actual fun <S> resolve(e: S): Promise<S>
    
    actual fun <S> resolve(e: Promise<S>): Promise<S>
  }
}