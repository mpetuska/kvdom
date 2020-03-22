package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

actual typealias Window = org.w3c.dom.Window

actual inline operator fun Window.get(name: String): Any = get(name) as Any