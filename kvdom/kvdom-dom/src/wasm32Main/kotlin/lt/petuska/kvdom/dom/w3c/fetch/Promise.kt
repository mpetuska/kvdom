package lt.petuska.kvdom.dom.w3c.fetch

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [Promise object](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Promise) to Kotlin.
 */
@Suppress("NOT_DOCUMENTED")
@NoWASM
actual open class Promise<out T> actual constructor(executor: (resolve: (T) -> Unit, reject: (Throwable) -> Unit) -> Unit) {
  actual open fun <S> then(onFulfilled: ((T) -> S)?): Promise<S> {
    TODO("Not yet implemented")
  }
  
  actual open fun <S> then(
    onFulfilled: ((T) -> S)?,
    onRejected: ((Throwable) -> S)?
  ): Promise<S> {
    TODO("Not yet implemented")
  }
  
  actual open fun <S> catch(onRejected: (Throwable) -> S): Promise<S> {
    TODO("Not yet implemented")
  }
  
  actual companion object {
    actual fun <S> all(promise: Array<out Promise<S>>): Promise<Array<out S>> {
      TODO("Not yet implemented")
    }
    
    actual fun <S> race(promise: Array<out Promise<S>>): Promise<S> {
      TODO("Not yet implemented")
    }
    
    actual fun reject(e: Throwable): Promise<Nothing> {
      TODO("Not yet implemented")
    }
    
    actual fun <S> resolve(e: S): Promise<S> {
      TODO("Not yet implemented")
    }
    
    actual fun <S> resolve(e: Promise<S>): Promise<S> {
      TODO("Not yet implemented")
    }
    
  }
  
}