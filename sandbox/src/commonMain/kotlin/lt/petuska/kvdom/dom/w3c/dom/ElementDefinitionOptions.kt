package lt.petuska.kvdom.dom.w3c.dom

expect interface ElementDefinitionOptions {
  var extends: String?
}

fun ElementDefinitionOptions(extends: String? = null) = object : ElementDefinitionOptions {
  override var extends: String? = extends
}