package lt.petuska.kvdom.core.module.hooks

import lt.petuska.kvdom.core.module.*

@DslMarker
annotation class HooksDSL

internal class StateStore {
  var index = 0
  private val store = mutableMapOf<Int, Any?>()
  
  operator fun unaryPlus() = this.apply { index++ }
  operator fun get(index: Int) = store[index]
  operator fun set(index: Int, value: Any?) {
    store[index] = value
  }
}

object Hooks : Module<ModuleData> {
  private val storesStore = mutableMapOf<String, StateStore>()
  
  internal fun store(name: String): StateStore {
    val store = storesStore[name] ?: StateStore()
    storesStore[name] = store
    return store
  }
  
  override val pre: () -> Unit = {
    storesStore.values.forEach { it.index = 0 }
  }
  
  override fun toString(): String = id
}
