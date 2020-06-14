package lt.petuska.kvdom.dsl

import lt.petuska.kvdom.core.*
import lt.petuska.kvdom.core.domain.*
import org.w3c.dom.*

@KVDOMDsl
fun VBuilder.a(block: TypedVBuilder<HTMLAnchorElement>.() -> Unit = {}) =
  TypedVBuilder("a", attrs.toMutableMap(), block = block)(this)

@KVDOMDsl
fun VBuilder.button(block: TypedVBuilder<HTMLButtonElement>.() -> Unit = {}) =
  TypedVBuilder("button", attrs.toMutableMap(), block = block)(this)

@KVDOMDsl
fun VBuilder.div(block: TypedVBuilder<HTMLDivElement>.() -> Unit = {}) =
  TypedVBuilder("div", attrs.toMutableMap(), block = block)(this)

@KVDOMDsl
fun VBuilder.h1(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  TypedVBuilder("h1", attrs.toMutableMap(), block = block)(this)

@KVDOMDsl
fun VBuilder.h2(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  TypedVBuilder("h2", attrs.toMutableMap(), block = block)(this)

@KVDOMDsl
fun VBuilder.h3(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  TypedVBuilder("h3", attrs.toMutableMap(), block = block)(this)

@KVDOMDsl
fun VBuilder.h4(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  TypedVBuilder("h4", attrs.toMutableMap(), block = block)(this)

@KVDOMDsl
fun VBuilder.h5(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  TypedVBuilder("h5", attrs.toMutableMap(), block = block)(this)

@KVDOMDsl
fun VBuilder.h6(block: TypedVBuilder<HTMLHeadingElement>.() -> Unit = {}) =
  TypedVBuilder("h6", attrs.toMutableMap(), block = block)(this)

@KVDOMDsl
fun VBuilder.hr(block: TypedVBuilder<HTMLHRElement>.() -> Unit = {}) =
  TypedVBuilder("hr", attrs.toMutableMap(), block = block)(this)

@KVDOMDsl
fun VBuilder.input(block: TypedVBuilder<HTMLInputElement>.() -> Unit = {}) =
  TypedVBuilder("input", attrs.toMutableMap(), block = block)(this)

@KVDOMDsl
fun VBuilder.label(block: TypedVBuilder<HTMLLabelElement>.() -> Unit = {}) =
  TypedVBuilder("label", attrs.toMutableMap(), block = block)(this)
