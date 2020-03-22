package lt.petuska.kvdom.dom

import lt.petuska.kvdom.dom.node.Document
import lt.petuska.kvdom.dom.node.Window

actual external val document: Document
actual external val window: Window
actual external val definedExternally: Nothing = kotlin.js.definedExternally