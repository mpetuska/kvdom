package lt.petuska.kvdom.sample

import lt.petuska.kvdom.core.*
import lt.petuska.kvdom.core.domain.*
import lt.petuska.kvdom.dsl.*
import lt.petuska.kvdom.hooks.*
import org.w3c.dom.*
import kotlin.browser.*
import kotlin.math.*

val modules = arrayOf(
//  LifecycleLogger,
  Hooks,
)
val patch = kvdom<HTMLDivElement>(document.getElementById("root")!!, *modules)
var tree: VElement<HTMLDivElement>? = null

fun main() {
  // Build your VDOM tree
  fun render() = element<HTMLDivElement>("div") {
    var clickDisabled by useState(false)
    var clickCount by useState(0)
    h2 {
      +"Platform: $platform"
    }
    button {
      attrs["disabled"] = "$clickDisabled"
      hooks.create = {
        it.addEventListener("click", {
          clickCount++
        })
        it.addEventListener("contextmenu", { e ->
          e.preventDefault()
          clickCount = max(clickCount - 1, 0)
        })
      }
      +"Clicked $clickCount times"
    }
    button {
      attrs["disabled"] = "${!clickDisabled}"
      hooks.create = {
        it.addEventListener("click", {
          clickDisabled = false
        })
      }
      +"EnableCounter"
    }
    button {
      attrs["disabled"] = "$clickDisabled"
      hooks {
        create = {
          it.addEventListener("click", {
            clickDisabled = true
          })
        }
      }
      +"DisableCounter"
    }
    element<HTMLBRElement>("br")
    div {
      repeat(clickCount) {
        div {
          +"Click #${it + 1}"
        }
      }
    }
  }
  
  window.setInterval({
    tree = tree.patch(render())
//    tree = null.patch(render())
  }, 33)
}
