package lt.petuska.kvdom.core.module

import lt.petuska.kvdom.core.VBuilderDSL
import lt.petuska.kvdom.core.domain.VBuilder
import lt.petuska.kvdom.core.domain.VElement
import lt.petuska.kvdom.dom.Element

public interface ModuleData {
  public fun copy(): ModuleData
}

public interface Module<T : ModuleData> {
  public val id: String; get() = this::class.simpleName!!
  public val defaultModuleData: () -> T?; get() = { null }
  public val dependencies: List<Module<*>>; get() = listOf()

  /**
   * Patch process begins
   */
  public val pre: () -> Unit; get() = {}

  /**
   * DOM element has been created based on a VElement
   */
  public val create: VElement<*>.(ref: Element) -> Unit; get() = { _ -> }

  /**
   * Element is being updated
   */
  public val update: VElement<*>.(oldVNode: VElement<*>, moduleData: T?) -> Unit; get() = { _, _ -> }

  /**
   * Element is directly or indirectly being removed
   *
   * This hook is invoked on a virtual node when its DOM element is removed from the DOM or if its parent is being removed from the DOM.
   * To see the difference between this hook and the remove hook, consider an example.
   *
   * var vnode1 = h('div', [h('div', [h('span', 'Hello')])]);
   * var vnode2 = h('div', []);
   * patch(container, vnode1);
   * patch(vnode1, vnode2);
   *
   * Here destroy is triggered for both the inner div element and the span element it contains. remove, on the other hand,
   * is only triggered on the div element because it is the only element being detached from its parent.
   *
   * You can, for instance, use remove to trigger an animation when an element is being removed and use the destroy hook
   * to additionally animate the disappearance of the removed element's children.
   */
  public val destroy: VElement<*>.(moduleData: T?) -> Unit; get() = {}

  /**
   * Element is directly being removed from the DOM
   *
   * Allows you to hook into the removal of an element. The hook is called once a vnode is to be removed from the DOM.
   * The handling function receives both the vnode and a callback. You can control and delay the removal with the callback.
   * The callback should be invoked once the hook is done doing its business, and the element will only be removed once all
   * remove hooks have invoked their callback.
   *
   * The hook is only triggered when an element is to be removed from its parent – not if it is the child of an
   * element that is removed. For that, see the destroy hook.
   */
  public val remove: VElement<*>.(removeCallback: () -> Unit, moduleData: T?) -> Unit; get() = { cb, _ -> cb() }

  /**
   * Patch process is done
   */
  public val post: () -> Unit; get() = {}
}

@VBuilderDSL
public inline fun <T : Element> VBuilder<T>.moduleHooks(block: VBuilder.VElementHooksBuilder<T>.() -> Unit): Unit = hooks.block()
