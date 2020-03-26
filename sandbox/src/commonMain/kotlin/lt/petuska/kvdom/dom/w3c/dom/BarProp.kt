package lt.petuska.kvdom.dom.w3c.dom

import lt.petuska.kvdom.dom.NoWASM

@NoWASM
expect abstract class BarProp {
  open val visible: Boolean
}