package lt.petuska.kvdom.dsl

import lt.petuska.kvdom.core.*
import lt.petuska.kvdom.core.domain.*
import org.w3c.dom.*

@KvdomDSL
inline fun VBuilder.a(block: TypedVBuilder<HTMLAnchorElement>.() -> Unit = {}) =
  element("a", attrs, block = block)

@KvdomDSL
inline fun VBuilder.button(block: TypedVBuilder<HTMLButtonElement>.() -> Unit = {}) =
  element("button", attrs, block = block)

@KvdomDSL
inline fun VBuilder.div(block: TypedVBuilder<HTMLDivElement>.() -> Unit = {}) =
  element("div", attrs, block = block)

@KvdomDSL
inline fun VBuilder.h1(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h1", attrs, block = block)

@KvdomDSL
inline fun VBuilder.h2(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h2", attrs, block = block)

@KvdomDSL
inline fun VBuilder.h3(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h3", attrs, block = block)

@KvdomDSL
inline fun VBuilder.h4(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h4", attrs, block = block)

@KvdomDSL
inline fun VBuilder.h5(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h5", attrs, block = block)

@KvdomDSL
inline fun VBuilder.h6(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  element("h6", attrs, block = block)

@KvdomDSL
inline fun VBuilder.hr(block: TypedVBuilder<HTMLHRElement>.() -> Unit = {}) =
  element("hr", attrs, block = block)

@KvdomDSL
inline fun VBuilder.input(block: TypedVBuilder<HTMLInputElement>.() -> Unit = {}) =
  element("input", attrs, block = block)

@KvdomDSL
inline fun VBuilder.label(block: TypedVBuilder<HTMLLabelElement>.() -> Unit = {}) =
  element("label", attrs, block = block)
