package lt.petuska.kvdom.dom

expect abstract class Element : Node {
  fun removeAttribute(qualifiedName: String)
  fun setAttribute(qualifiedName: String, value: String)
}
