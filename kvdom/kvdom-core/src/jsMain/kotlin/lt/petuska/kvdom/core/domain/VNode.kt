package lt.petuska.kvdom.core.domain

import org.w3c.dom.*

abstract class VNode<T : Node> internal constructor() {
  abstract var ref: T?; internal set
  abstract fun copy(): VNode<T>
  abstract fun toHtml(): String
  abstract fun render(): T
}
