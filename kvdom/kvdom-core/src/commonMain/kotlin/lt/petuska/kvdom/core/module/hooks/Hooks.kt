package lt.petuska.kvdom.core.module.hooks

import lt.petuska.kvdom.core.module.Module
import lt.petuska.kvdom.core.module.ModuleData

@DslMarker
public annotation class HooksDSL

public interface StateStore {
  public val index: Int
  public operator fun get(index: Int): Any?
  public operator fun set(index: Int, value: Any?)
}

internal class StateStoreImpl : StateStore {
  override var index = 0; internal set
  private val store = mutableMapOf<Int, Any?>()

  override operator fun get(index: Int) = store[index]
  override operator fun set(index: Int, value: Any?) {
    store[index] = value
  }
}

public object Hooks : Module<ModuleData> {
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
