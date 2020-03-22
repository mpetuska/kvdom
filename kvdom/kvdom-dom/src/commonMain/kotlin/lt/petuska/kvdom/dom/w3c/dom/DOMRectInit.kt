package lt.petuska.kvdom.dom.w3c.dom

expect interface DOMRectInit {
  var x: Double? /* = 0.0 */
  var y: Double? /* = 0.0 */
  var width: Double? /* = 0.0 */
  var height: Double? /* = 0.0 */
}

inline fun DOMRectInit(x: Double? = 0.0, y: Double? = 0.0, width: Double? = 0.0, height: Double? = 0.0): DOMRectInit =
  object : DOMRectInit {
    override var x: Double? = x
    override var y: Double? = y
    override var width: Double? = width
    override var height: Double? = height
  }
