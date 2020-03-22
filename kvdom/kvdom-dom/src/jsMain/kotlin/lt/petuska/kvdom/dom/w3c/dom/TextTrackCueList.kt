package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.get

actual typealias TextTrackCueList = org.w3c.dom.TextTrackCueList

actual inline operator fun TextTrackCueList.get(index: Int): TextTrackCue? =get(index)