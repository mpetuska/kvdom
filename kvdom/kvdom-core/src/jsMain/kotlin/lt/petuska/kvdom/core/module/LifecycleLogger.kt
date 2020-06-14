package lt.petuska.kvdom.core.module

import lt.petuska.kvdom.core.domain.*
import org.w3c.dom.*

object LifecycleLogger : Module<ModuleData> {
  override val destroy: VElement<*>.(moduleData: ModuleData?) -> Unit = {
    console.log("Destroying", ref)
  }
  override val remove: VElement<*>.(removeCallback: () -> Unit, moduleData: ModuleData?) -> Unit = { cb, _ ->
    console.log("Removing", ref)
    cb()
  }
  override val pre: () -> Unit = { println("Pre") }
  override val create: VElement<*>.(ref: Element, moduleData: ModuleData?) -> Unit = { ref, _ ->
    console.log("Create", ref)
  }
  override val update: VElement<*>.(oldVNode: VElement<*>, moduleData: ModuleData?) -> Unit = { _, _ ->
    console.log("Update", ref)
  }
  override val post: () -> Unit = {
    println("Post")
  }
  
  override fun toString(): String = id
}
