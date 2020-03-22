package lt.petuska.kvdom.dom.w3c.dom

/**
 * Exposes the JavaScript [ValidityState](https://developer.mozilla.org/en/docs/Web/API/ValidityState) to Kotlin
 */
actual abstract class ValidityState actual constructor() {
  actual open val valueMissing: Boolean
    get() = TODO("Not yet implemented")
  actual open val typeMismatch: Boolean
    get() = TODO("Not yet implemented")
  actual open val patternMismatch: Boolean
    get() = TODO("Not yet implemented")
  actual open val tooLong: Boolean
    get() = TODO("Not yet implemented")
  actual open val tooShort: Boolean
    get() = TODO("Not yet implemented")
  actual open val rangeUnderflow: Boolean
    get() = TODO("Not yet implemented")
  actual open val rangeOverflow: Boolean
    get() = TODO("Not yet implemented")
  actual open val stepMismatch: Boolean
    get() = TODO("Not yet implemented")
  actual open val badInput: Boolean
    get() = TODO("Not yet implemented")
  actual open val customError: Boolean
    get() = TODO("Not yet implemented")
  actual open val valid: Boolean
    get() = TODO("Not yet implemented")
}