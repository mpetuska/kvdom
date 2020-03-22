package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [DOMPointInit](https://developer.mozilla.org/en/docs/Web/API/DOMPointInit) to Kotlin
 */
expect interface DOMPointInit {
  var x: Double? /* = 0.0 */
  var y: Double? /* = 0.0 */
  var z: Double? /* = 0.0 */
  var w: Double? /* = 1.0 */
}

inline fun DOMPointInit(x: Double? = 0.0, y: Double? = 0.0, z: Double? = 0.0, w: Double? = 1.0): DOMPointInit =
  object : DOMPointInit {
    override var x: Double? = x
    override var y: Double? = y
    override var z: Double? = z
    override var w: Double? = w
  }
