package lt.petuska.kvdom.domain.attribute

abstract class Attribute<T> {
    abstract val key: String
    abstract val value: T

    open fun valueAsString(): String = "$value"
}

data class StringAttribute(override val key: String, override val value: String) : Attribute<String>()
data class BooleanAttribute(override val key: String, override val value: Boolean) : Attribute<Boolean>()
data class NumberAttribute(override val key: String, override val value: Number) : Attribute<Number>()