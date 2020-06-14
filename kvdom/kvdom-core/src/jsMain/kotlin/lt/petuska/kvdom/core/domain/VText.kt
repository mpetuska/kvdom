package lt.petuska.kvdom.core.domain

import org.w3c.dom.*
import kotlin.browser.*

data class VText internal constructor(
  var text: String,
  override var ref: Text?,
) : VNode<Text>() {
  
  override fun copy(): VText = VText(text, ref)
  
  override fun toHtml(): String = text
  
  override fun render(): Text = document.createTextNode(text)
}
