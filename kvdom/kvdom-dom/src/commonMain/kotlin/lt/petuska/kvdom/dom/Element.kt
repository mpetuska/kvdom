package lt.petuska.kvdom.dom

public expect abstract class Element : Node {
  public fun removeAttribute(qualifiedName: String)
  public fun setAttribute(qualifiedName: String, value: String)
}
