package lt.petuska.kvdom.dom.w3c.dom

expect interface AssignedNodesOptions {
  var flatten: Boolean? /* = false */
}

inline fun AssignedNodesOptions(flatten: Boolean? = false): AssignedNodesOptions = object : AssignedNodesOptions {
  override var flatten: Boolean? = flatten
}