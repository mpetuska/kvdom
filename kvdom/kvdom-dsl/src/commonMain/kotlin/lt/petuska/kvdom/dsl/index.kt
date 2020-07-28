package lt.petuska.kvdom.dsl

import lt.petuska.kvdom.core.KvdomDSL
import lt.petuska.kvdom.core.domain.VBuilder
import lt.petuska.kvdom.core.domain.element
import lt.petuska.kvdom.dom.html.*

@KvdomDSL
inline fun VBuilder<*>.a(block: VBuilder<HTMLAnchorElement>.() -> Unit = {}) =
  element("a", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.button(block: VBuilder<HTMLButtonElement>.() -> Unit = {}) =
  element("button", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.div(block: VBuilder<HTMLDivElement>.() -> Unit = {}) =
  element("div", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.h1(block: VBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h1", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.h2(block: VBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h2", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.h3(block: VBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h3", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.h4(block: VBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h4", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.h5(block: VBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h5", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.h6(block: VBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h6", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.hr(block: VBuilder<HTMLHRElement>.() -> Unit = {}) =
  element("hr", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.input(block: VBuilder<HTMLInputElement>.() -> Unit = {}) =
  element("input", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.label(block: VBuilder<HTMLLabelElement>.() -> Unit = {}) =
  element("label", attrs, block = block)

@KvdomDSL
inline fun VBuilder<*>.br(block: VBuilder<HTMLBRElement>.() -> Unit = {}) =
  element("br", attrs, block = block)
