package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Screen](https://developer.mozilla.org/en/docs/Web/API/Screen) to Kotlin
 */
expect abstract class Screen() {
  open val availWidth: Int
  open val availHeight: Int
  open val width: Int
  open val height: Int
  open val colorDepth: Int
  open val pixelDepth: Int
}