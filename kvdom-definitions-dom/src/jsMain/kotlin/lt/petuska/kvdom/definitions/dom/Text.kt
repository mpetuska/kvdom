package lt.petuska.kvdom.definitions.dom


/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Text
 */
actual external interface Text : Node, ChildNode

actual external class TextImpl : NodeImpl, Text