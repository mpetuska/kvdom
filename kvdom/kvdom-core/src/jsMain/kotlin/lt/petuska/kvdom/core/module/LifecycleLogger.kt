package lt.petuska.kvdom.core.module

import lt.petuska.kvdom.core.domain.*
import org.w3c.dom.*

object LifecycleLogger : Module<ModuleData> {
  override val destroy: VElement<*>.(moduleData: ModuleData?) -> Unit = {
    print("Destroying "); println(ref)
  }
  override val remove: VElement<*>.(removeCallback: () -> Unit, moduleData: ModuleData?) -> Unit = { cb, _ ->
    print("Removing "); println(ref)
    cb()
  }
  override val pre: () -> Unit = {
    println("Pre")
  }
  override val create: VElement<*>.(ref: Element, moduleData: ModuleData?) -> Unit = { ref, _ ->
    print("Creating "); println(ref)
  }
  override val update: VElement<*>.(oldVNode: VElement<*>, moduleData: ModuleData?) -> Unit = { _, _ ->
    print("Updating "); println(ref)
  }
  override val post: () -> Unit = {
    println("Post")
  }
  
  override fun toString(): String = id
}
