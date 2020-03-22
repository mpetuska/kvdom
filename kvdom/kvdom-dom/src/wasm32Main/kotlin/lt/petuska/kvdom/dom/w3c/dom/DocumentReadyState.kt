package lt.petuska.kvdom.dom.w3c.dom

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual interface DocumentReadyState {
  actual companion object
}

actual val DocumentReadyState.LOADING: DocumentReadyState
  get() = TODO("Not yet implemented")
actual val DocumentReadyState.INTERACTIVE: DocumentReadyState
  get() = TODO("Not yet implemented")
actual val DocumentReadyState.COMPLETE: DocumentReadyState
  get() = TODO("Not yet implemented")