package lt.petuska.kvdom.dom

@RequiresOptIn(message = "This API is not implemented on WASM. Use with caution and expect lots of NotImplementedException(s).")
@Retention(AnnotationRetention.BINARY)
@Target(
  AnnotationTarget.CLASS,
  AnnotationTarget.PROPERTY,
  AnnotationTarget.FUNCTION
)
annotation class NoWASM