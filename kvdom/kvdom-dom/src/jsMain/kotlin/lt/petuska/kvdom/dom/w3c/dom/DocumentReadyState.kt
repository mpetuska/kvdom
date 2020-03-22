package lt.petuska.kvdom.dom.w3c.dom

import org.w3c.dom.COMPLETE
import org.w3c.dom.INTERACTIVE
import org.w3c.dom.LOADING

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual typealias DocumentReadyState = org.w3c.dom.DocumentReadyState

actual val DocumentReadyState.LOADING: DocumentReadyState
  get() = org.w3c.dom.DocumentReadyState.LOADING
actual val DocumentReadyState.INTERACTIVE: DocumentReadyState
  get() = org.w3c.dom.DocumentReadyState.INTERACTIVE
actual val DocumentReadyState.COMPLETE: DocumentReadyState
  get() = org.w3c.dom.DocumentReadyState.COMPLETE