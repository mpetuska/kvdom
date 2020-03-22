package lt.petuska.kvdom.dom.w3c.dom

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
expect interface DocumentReadyState {
  companion object
}

expect val DocumentReadyState.LOADING: DocumentReadyState

expect val DocumentReadyState.INTERACTIVE: DocumentReadyState

expect val DocumentReadyState.COMPLETE: DocumentReadyState
