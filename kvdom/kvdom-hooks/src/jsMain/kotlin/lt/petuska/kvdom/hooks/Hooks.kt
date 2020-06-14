package lt.petuska.kvdom.hooks

import lt.petuska.kvdom.core.module.*

@DslMarker
annotation class HooksDSL

interface StateStore {
  val index: Int
  operator fun unaryPlus(): StateStore
  operator fun get(index: Int): Any?
  operator fun set(index: Int, value: Any?)
}

internal class StateStoreImpl : StateStore {
  override var index = 0; internal set
  private val store = mutableMapOf<Int, Any?>()
  
  override operator fun unaryPlus() = this.apply { index++ }
  override operator fun get(index: Int) = store[index]
  override operator fun set(index: Int, value: Any?) {
    store[index] = value
  }
}

object Hooks : Module<ModuleData> {
  private val storesStore = mutableMapOf<String, StateStore>()
  
  internal fun store(name: String): StateStore {
    val store = storesStore[name] ?: StateStoreImpl()
    storesStore[name] = store
    return store
  }
  
  override val pre: () -> Unit = {
    storesStore.values.forEach { (it as StateStoreImpl).index = 0 }
  }
  
  override fun toString(): String = id
}
