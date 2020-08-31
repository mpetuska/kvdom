package lt.petuska.kvdom.dsl

import kotlinx.css.*
import kotlinx.html.*
import lt.petuska.kvdom.dom.Event

public inline fun CommonAttributeGroupFacade<Event>.css(crossinline block: CSSBuilder.() -> Unit): String =
  CSSBuilder().apply(block).toString().also {
    this@css.style = it
  }
