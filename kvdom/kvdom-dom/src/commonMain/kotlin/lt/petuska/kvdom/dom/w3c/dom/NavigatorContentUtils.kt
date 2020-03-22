package lt.petuska.kvdom.dom.w3c.dom

expect interface NavigatorContentUtils {
  fun registerProtocolHandler(scheme: String, url: String, title: String)
  fun registerContentHandler(mimeType: String, url: String, title: String)
  fun isProtocolHandlerRegistered(scheme: String, url: String): String
  fun isContentHandlerRegistered(mimeType: String, url: String): String
  fun unregisterProtocolHandler(scheme: String, url: String)
  fun unregisterContentHandler(mimeType: String, url: String)
}