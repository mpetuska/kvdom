package lt.petuska.kvdom.core

import lt.petuska.kvdom.core.domain.*
import org.w3c.dom.*


@DslMarker
annotation class VBuilderDSL

@VBuilderDSL
inline fun <T : Element> TypedVBuilder<T>.hooks(block: TypedVBuilder.VElementHooksBuilder<T>.() -> Unit) = hooks.block()
