package lt.petuska.kvdom.dom.w3c.dom

actual abstract external class TextTrackCueList {
  actual open val length: Int
  actual fun getCueById(id: String): TextTrackCue?
}

@Suppress("UnsafeCastFromDynamic")
actual operator fun TextTrackCueList.get(index: Int): TextTrackCue? = asDynamic()[index]