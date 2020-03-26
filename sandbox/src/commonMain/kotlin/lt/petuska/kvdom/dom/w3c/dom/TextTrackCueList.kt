package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

@NoWASM
expect abstract class TextTrackCueList {
  open val length: Int
  fun getCueById(id: String): TextTrackCue?
}

@NoWASM
expect operator fun TextTrackCueList.get(index: Int): TextTrackCue?
