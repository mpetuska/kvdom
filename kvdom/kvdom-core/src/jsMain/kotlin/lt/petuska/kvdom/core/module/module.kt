package lt.petuska.kvdom.core.module

import lt.petuska.kvdom.core.domain.*
import org.w3c.dom.*


interface ModuleData {
  fun copy(): ModuleData
}

interface Module<T : ModuleData> {
  val id: String; get() = this::class.simpleName!!
  
  /**
   * Patch process begins
   */
  val pre: () -> Unit; get() = {}
  
  /**
   * DOM element has been created based on a VElement
   */
  val create: VElement<*>.(ref: Element, moduleData: T?) -> Unit; get() = { _, _ -> }
  
  /**
   * Element is being updated
   */
  val update: VElement<*>.(oldVNode: VElement<*>, moduleData: T?) -> Unit; get() = { _, _ -> }
  
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
  val destroy: VElement<*>.(moduleData: T?) -> Unit; get() = {}
  
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
  val remove: VElement<*>.(removeCallback: () -> Unit, moduleData: T?) -> Unit; get() = { cb, _ -> cb() }
  
  /**
   * Patch process is done
   */
  val post: () -> Unit; get() = {}
}
