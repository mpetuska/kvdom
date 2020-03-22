package lt.petuska.kvdom.dom.w3c.dom

expect interface ScrollOptions {
  var behavior: ScrollBehavior? /* = ScrollBehavior.AUTO */
}

inline fun ScrollOptions(behavior: ScrollBehavior? = ScrollBehavior.AUTO): ScrollOptions = object : ScrollOptions {
  override var behavior: ScrollBehavior? = behavior
}
