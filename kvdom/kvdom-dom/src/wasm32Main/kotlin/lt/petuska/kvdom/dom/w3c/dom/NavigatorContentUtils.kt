package lt.petuska.kvdom.dom.w3c.dom

actual interface NavigatorContentUtils {
  actual fun registerProtocolHandler(scheme: String, url: String, title: String)
  actual fun registerContentHandler(mimeType: String, url: String, title: String)
  actual fun isProtocolHandlerRegistered(scheme: String, url: String): String
  actual fun isContentHandlerRegistered(mimeType: String, url: String): String
  actual fun unregisterProtocolHandler(scheme: String, url: String)
  actual fun unregisterContentHandler(mimeType: String, url: String)
}