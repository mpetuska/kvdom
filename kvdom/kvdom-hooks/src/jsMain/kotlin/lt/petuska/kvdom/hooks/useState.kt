package lt.petuska.kvdom.hooks

import lt.petuska.kvdom.core.domain.*
import kotlin.reflect.*


private val store = Hooks.store("useState")
typealias GetState<T> = () -> T
typealias SetState<T> = (value: T) -> Unit

class UseStateDelegate<T> internal constructor(val getState: GetState<T>, val setState: SetState<T>) {
  operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
    return getState()
  }
  
  operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
    setState(value)
  }
}

@HooksDSL
fun <T> VBuilder.useState(initValue: T): UseStateDelegate<T> {
  val currentIndex = store.index
  store[currentIndex] = store[currentIndex] ?: initValue
  +store
  return UseStateDelegate({
    @Suppress("UNCHECKED_CAST")
    store[currentIndex] as T
  }, {
    store[currentIndex] = it
  })
}
