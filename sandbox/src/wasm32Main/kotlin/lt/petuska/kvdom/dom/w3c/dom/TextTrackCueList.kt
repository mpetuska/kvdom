package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

@NoWASM
actual abstract class TextTrackCueList {
  actual open val length: Int
    get() = TODO("Not yet implemented")
  
  actual fun getCueById(id: String): TextTrackCue? {
    TODO("Not yet implemented")
  }
}

@NoWASM
actual operator fun TextTrackCueList.get(index: Int): TextTrackCue? {
  TODO("Not yet implemented")
}