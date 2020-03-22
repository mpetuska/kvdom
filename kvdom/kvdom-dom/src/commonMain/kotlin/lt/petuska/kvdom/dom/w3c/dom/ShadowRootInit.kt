package lt.petuska.kvdom.dom.w3c.dom

expect interface ShadowRootInit {
  var mode: ShadowRootMode?
}

inline fun ShadowRootInit(mode: ShadowRootMode?): ShadowRootInit = object : ShadowRootInit {
  override var mode: ShadowRootMode? = mode
}
