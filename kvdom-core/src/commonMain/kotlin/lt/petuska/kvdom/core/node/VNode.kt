package lt.petuska.kvdom.core.node

import lt.petuska.kvdom.core.util.UUID
import lt.petuska.kvdom.dom.node.Node

abstract class VNode(internal val uuid: Long = UUID.next(), node: Node? = null) {
    protected var `$node`: Node? = node; private set
    internal var snapshot: VNode? = null; private set

    internal abstract fun diff(): () -> Node?

    fun patch(dParent: Node?) {
        when {
            dParent == null -> {
                onRemove {
                    `$node`!!.remove()
                    onDestroy()
                }
            }
            snapshot == null -> {
                onInit()
                val dNode = render()
                (this as? VElement)?.children?.forEach {
                    it.patch(dNode)
                }
                `$node` = dNode
                onCreate()
                snapshot = copy()
                onInsert()
                dParent.appendChild(dNode)
            }
            else -> {
                val oldVNode = snapshot?.copy()
                onPrePatch(oldVNode)
                val patch = diff()
                onUpdate(oldVNode)
                snapshot = copy()
                `$node` = patch.invoke()
                onPostPatch(snapshot?.copy())
            }
        }
    }

    abstract fun copy(): VNode
    abstract fun toHtml(): String
    internal abstract fun render(): Node

    /**
     * This hook is invoked during the patch process when a new virtual node has been found.
     * The hook is called before the vNode is processed in any way.
     * i.e.: before it has created a DOM node based on the vNode.
     */
    protected open fun onInit() {}

    /**
     * Called straight after a DOM element has been created based on a vNode and before it is inserted into Document.
     */
    protected open fun onCreate() {}

    /**
     * Called straight after a DOM element has been inserted into Document.
     */
    protected open fun onInsert() {}

    /**
     * Called just before the element is about to be patched.
     */
    protected open fun onPrePatch(oldVnode: VNode?) {}

    /**
     * Called after the element has been diffed and is about to be updated.
     * At this stage vNode is already updated, but DOM node is yet to be updated.
     */
    protected open fun onUpdate(oldVnode: VNode?) {}

    /**
     * Called after both, vNode and DOM node has been updated.
     */
    protected open fun onPostPatch(oldVnode: VNode?) {}

    /**
     * Called after the node has been removed. This is a full removal, removing both, vNode and DOM node.
     */
    protected open fun onDestroy() {}

    /**
     * Called before the DOM element is being removed from DOM. The callback must be invoked to continue with the operation.
     */
    protected open fun onRemove(removeCallback: () -> Unit) {
        removeCallback()
    }
}