package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get


actual typealias Document = org.w3c.dom.Document

actual inline operator fun Document.get(name: String): Any = get(name) as Any