package lt.petuska.kvdom.core.domain

import lt.petuska.kvdom.dom.*

interface VElementHooks<T : Element> {
  /**
   * VNode has been added
   *
   * This hook is invoked during the patch process when a new virtual node has been found.
   * The hook is called before KVDOM has processed the node in any way.
   * i.e., before it has created a DOM node based on the vnode.
   */
  val init: (VElement<T>.() -> Unit)?; get() = null

  /**
   * DOM element has been created based on a VNode
   */
  val create: (VElement<T>.(ref: T) -> Unit)?; get() = null

  /**
   * Element has been inserted into the DOM
   *
   * This hook is invoked once the DOM element for a vnode has been inserted into the document
   * and the rest of the patch cycle is done. This means that you can do DOM measurements
   * (like using getBoundingClientRect in this hook safely, knowing that no elements will be changed
   * afterwards that could affect the position of the inserted elements.
   */
  val insert: (VElement<T>.(ref: T) -> Unit)?; get() = null

  /**
   * Element is about to be patched
   */
  val prePatch: (VElement<T>.(oldVNode: VElement<T>) -> Unit)?; get() = null

  /**
   * Element is being updated
   */
  val update: (VElement<T>.(oldVNode: VElement<T>) -> Unit)?; get() = null

  /**
   * Element has been patched
   */
  val postPatch: (VElement<T>.(oldVNode: VElement<T>) -> Unit)?; get() = null

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
  val destroy: (VElement<T>.() -> Unit)?; get() = null

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
  val remove: (VElement<T>.(removeCallback: () -> Unit) -> Unit)?; get() = null
}
