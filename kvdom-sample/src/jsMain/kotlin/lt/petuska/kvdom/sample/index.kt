package lt.petuska.kvdom.sample

import lt.petuska.kvdom.core.*
import lt.petuska.kvdom.core.domain.*
import lt.petuska.kvdom.core.module.events.*
import lt.petuska.kvdom.dsl.*
import lt.petuska.kvdom.hooks.*
import org.w3c.dom.*
import kotlin.browser.*
import kotlin.math.*

val modules = arrayOf(
//  LifecycleLogger,
  Events,
  Hooks,
)
val patch = kvdom<HTMLDivElement>(document.getElementById("root")!!, *modules)
var tree: VElement<HTMLDivElement>? = null

fun main() {
  // Build your VDOM tree
  fun render() = vBuilder {
    var clickDisabled by useState(false)
    var clickCount by useState(0)
    h2 {
      +"Platform: $platform"
    }
    button {
      attrs["disabled"] = "$clickDisabled"
      on("contextmenu") {
        it.preventDefault()
        clickCount = max(clickCount - 1, 0)
        // Conditional Event handling
        if (clickCount > 4) {
          println(clickCount)
        }
      }
      // Conditional Event Handlers
      if (clickCount >= 4) {
        on("click") {
          clickCount++
          println(clickCount)
        }
      } else {
        on("click") {
          clickCount++
        }
      }
      +"Clicked $clickCount times"
    }
    button {
      attrs["disabled"] = "${!clickDisabled}"
      on("click") {
        clickDisabled = false
      }
      +"EnableCounter"
    }
    button {
      attrs["disabled"] = "$clickDisabled"
      on("click") {
        clickDisabled = true
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
  }, 33)
}
