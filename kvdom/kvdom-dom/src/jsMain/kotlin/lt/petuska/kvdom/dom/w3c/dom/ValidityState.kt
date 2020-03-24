package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [ValidityState](https://developer.mozilla.org/en/docs/Web/API/ValidityState) to Kotlin
 */
actual abstract external class ValidityState {
  actual open val valueMissing: Boolean
  actual open val typeMismatch: Boolean
  actual open val patternMismatch: Boolean
  actual open val tooLong: Boolean
  actual open val tooShort: Boolean
  actual open val rangeUnderflow: Boolean
  actual open val rangeOverflow: Boolean
  actual open val stepMismatch: Boolean
  actual open val badInput: Boolean
  actual open val customError: Boolean
  actual open val valid: Boolean
}