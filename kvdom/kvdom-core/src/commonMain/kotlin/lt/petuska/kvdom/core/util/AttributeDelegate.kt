package lt.petuska.kvdom.core.util

import lt.petuska.kvdom.core.node.VElement
import kotlin.reflect.KProperty

class AttributeDelegate<T : VElement<*>> {
    operator fun getValue(thisRef: T, prop: KProperty<*>): String? {
        return thisRef.attributes[prop.name]
    }

    operator fun setValue(thisRef: T, prop: KProperty<*>, value: String?) {
        value?.let {
            thisRef.attributes[prop.name] = it
        } ?: thisRef.attributes.remove(prop.name)
    }
}