package lt.petuska.kvdom.dom.w3c.dom

expect interface GetRootNodeOptions {
  var composed: Boolean? /* = false */
}

inline fun GetRootNodeOptions(composed: Boolean? = false): GetRootNodeOptions = object : GetRootNodeOptions {
  override var composed: Boolean? = composed
}
