package lt.petuska.kvdom.core.module.hooks

import kotlin.reflect.KProperty

private val store = Hooks.store("useState") as StateStoreImpl
public typealias GetState<T> = () -> T
public typealias SetState<T> = (value: T) -> Unit

public class StateDelegate<T> internal constructor(public val getState: GetState<T>, public val setState: SetState<T>) {
  public operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
    return getState()
  }

  public operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
    setState(value)
  }
}

@HooksDSL
public fun <T> useState(initValue: T): StateDelegate<T> {
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
