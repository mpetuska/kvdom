package lt.petuska.kvdom.dom.w3c.dom

actual abstract class TextTrackCueList actual constructor() {
  actual open val length: Int
    get() = TODO("Not yet implemented")
  
  actual fun getCueById(id: String): TextTrackCue? {
    TODO("Not yet implemented")
  }
}

actual inline operator fun TextTrackCueList.get(index: Int): TextTrackCue? {
  TODO("Not yet implemented")
}