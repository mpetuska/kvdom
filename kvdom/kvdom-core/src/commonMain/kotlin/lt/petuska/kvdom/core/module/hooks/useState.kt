package lt.petuska.kvdom.core.module.hooks

import kotlin.reflect.*

private val store = Hooks.store("useState") as StateStoreImpl
typealias GetState<T> = () -> T
typealias SetState<T> = (value: T) -> Unit

class StateDelegate<T> internal constructor(val getState: GetState<T>, val setState: SetState<T>) {
  operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
    return getState()
  }

  operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
    setState(value)
  }
}

@HooksDSL
fun <T> useState(initValue: T): StateDelegate<T> {
  val currentIndex = store.index + 1
  store.index++
  store[currentIndex] = store[currentIndex] ?: initValue
  return StateDelegate(
    {
      @Suppress("UNCHECKED_CAST")
      store[currentIndex] as T
    },
    {
      store[currentIndex] = it
    }
  )
}
