package lt.petuska.kvdom.dom.w3c.dom

expect interface ElementCreationOptions {
  var `is`: String?
}

inline fun ElementCreationOptions(`is`: String? = null): ElementCreationOptions = object : ElementCreationOptions {
  override var `is`: String? = `is`
}
