package lt.petuska.kvdom.dom.w3c.dom

expect abstract class TextTrackCueList() {
  open val length: Int
  fun getCueById(id: String): TextTrackCue?
}

expect inline operator fun TextTrackCueList.get(index: Int): TextTrackCue?
