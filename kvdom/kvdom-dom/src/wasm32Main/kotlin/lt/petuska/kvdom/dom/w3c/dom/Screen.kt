package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [Screen](https://developer.mozilla.org/en/docs/Web/API/Screen) to Kotlin
 */
actual abstract class Screen actual constructor() {
  actual open val availWidth: Int
    get() = TODO("Not yet implemented")
  actual open val availHeight: Int
    get() = TODO("Not yet implemented")
  actual open val width: Int
    get() = TODO("Not yet implemented")
  actual open val height: Int
    get() = TODO("Not yet implemented")
  actual open val colorDepth: Int
    get() = TODO("Not yet implemented")
  actual open val pixelDepth: Int
    get() = TODO("Not yet implemented")
}