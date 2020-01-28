package lt.petuska.kvdom.dom.node

import lt.petuska.kvdom.dom.event.EventTarget


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Window
 */
expect class Window : EventTarget, WindowOrWorkerGlobalScope {
    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Window/document
     */
    val document: Document
}