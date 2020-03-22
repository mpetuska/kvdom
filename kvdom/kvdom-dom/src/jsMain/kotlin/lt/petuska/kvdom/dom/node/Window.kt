package lt.petuska.kvdom.dom.node

import lt.petuska.kvdom.dom.event.EventTarget

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Window
 */
actual external class Window : EventTarget, WindowOrWorkerGlobalScope {
  override fun setInterval(func: () -> Unit, delay: Int): Int
  override fun clearInterval(intervalId: Int)
  override fun setTimeout(func: () -> Unit, delay: Int): Int
  override fun clearTimeout(timeoutId: Int)
  
  /**
   * https://developer.mozilla.org/en-US/docs/Web/API/Window/document
   */
  actual val document: Document
}