package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

/**
 * Exposes the JavaScript [ValidityState](https://developer.mozilla.org/en/docs/Web/API/ValidityState) to Kotlin
 */
@NoWASM
expect abstract class ValidityState {
  open val valueMissing: Boolean
  open val typeMismatch: Boolean
  open val patternMismatch: Boolean
  open val tooLong: Boolean
  open val tooShort: Boolean
  open val rangeUnderflow: Boolean
  open val rangeOverflow: Boolean
  open val stepMismatch: Boolean
  open val badInput: Boolean
  open val customError: Boolean
  open val valid: Boolean
}