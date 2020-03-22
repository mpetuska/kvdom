package lt.petuska.kvdom.dom.w3c.dom

expect interface ElementDefinitionOptions {
  var extends: String?
}

inline fun ElementDefinitionOptions(extends: String? = null): ElementDefinitionOptions =
  object : ElementDefinitionOptions {
    override var extends: String? = extends
  }
