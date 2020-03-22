package lt.petuska.kvdom.dom.w3c.fetch


/**
 * Exposes the JavaScript [Promise object](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Promise) to Kotlin.
 */
expect open class Promise<out T>(executor: (resolve: (T) -> Unit, reject: (Throwable) -> Unit) -> Unit) {
  public open fun <S> then(onFulfilled: ((T) -> S)?): Promise<S>
  public open fun <S> then(onFulfilled: ((T) -> S)?, onRejected: ((Throwable) -> S)?): Promise<S>
  
  public open fun <S> catch(onRejected: (Throwable) -> S): Promise<S>
  
  companion object {
    public fun <S> all(promise: Array<out Promise<S>>): Promise<Array<out S>>
    
    public fun <S> race(promise: Array<out Promise<S>>): Promise<S>
    
    public fun reject(e: Throwable): Promise<Nothing>
    
    public fun <S> resolve(e: S): Promise<S>
    public fun <S> resolve(e: Promise<S>): Promise<S>
  }
}

// It's workaround for KT-19672 since we can fix it properly until KT-11265 isn't fixed.
expect inline fun <T, S> Promise<Promise<T>>.then(noinline onFulfilled: ((T) -> S)?): Promise<S>

expect inline fun <T, S> Promise<Promise<T>>.then(noinline onFulfilled: ((T) -> S)?, noinline onRejected: ((Throwable) -> S)?): Promise<S>