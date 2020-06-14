package lt.petuska.kvdom.hooks

import lt.petuska.kvdom.core.domain.*
import kotlin.reflect.*

typealias GetState<T> = () -> T
typealias SetState<T> = (value: T) -> Unit

operator fun <T> Pair<GetState<T>, SetState<T>>.getValue(thisRef: Any?, property: KProperty<*>): T {
  return first()
}

operator fun <T> Pair<GetState<T>, SetState<T>>.setValue(thisRef: Any?, property: KProperty<*>, value: T) {
  second(value)
}

private val store = Hooks.store("useState")

@HooksDSL
fun <T> VBuilder.useState(initValue: T): Pair<GetState<T>, SetState<T>> {
  val currentIndex = store.index
  store[currentIndex] = store[currentIndex] ?: initValue
  
  val getState = fun(): GetState<T> {
    return fun(): T {
      @Suppress("UNCHECKED_CAST")
      return store[currentIndex] as T
    }
  }()
  val setState = fun(): SetState<T> {
    return fun(value: T) {
      store[currentIndex] = value
    }
  }()
  +store
  return getState to setState
}
