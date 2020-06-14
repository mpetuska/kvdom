package lt.petuska.kvdom.sample

import lt.petuska.kvdom.core.*
import lt.petuska.kvdom.core.domain.*
import lt.petuska.kvdom.core.module.*
import lt.petuska.kvdom.dsl.*
import org.w3c.dom.*
import kotlin.browser.*
import kotlin.math.*

val modules = arrayOf(LifecycleLogger)
val patch = kvdom<HTMLDivElement>(document.getElementById("root")!!, *modules)
var tree: VElement<HTMLDivElement>? = null

fun main() {
  //STATE
  val state = object {
    var clickCount = 0
    var clickDisabled = true
  }
  
  // Build your VDOM tree
  fun render() = element<HTMLDivElement>("div") {
    h2 {
      +"Platform: $platform"
    }
    button {
      attrs["disabled"] = "${state.clickDisabled}"
      hooks.create = {
        it.addEventListener("click", {
          state.clickCount++
        })
        it.addEventListener("contextmenu", { e ->
          e.preventDefault()
          state.clickCount = max(state.clickCount - 1, 0)
        })
      }
      +"Clicked ${state.clickCount} times"
    }
    button {
      attrs["disabled"] = "${!state.clickDisabled}"
      hooks.create = {
        it.addEventListener("click", {
          state.clickDisabled = false
        })
      }
      +"EnableCounter"
    }
    button {
      attrs["disabled"] = "${state.clickDisabled}"
      hooks {
        create = {
          it.addEventListener("click", {
            state.clickDisabled = true
          })
        }
      }
      +"DisableCounter"
    }
    element<HTMLBRElement>("br")
    div {
      repeat(state.clickCount) {
        div {
          +"Click #${it + 1}"
        }
      }
    }
  }
  
  window.setInterval({
    tree = null.patch(render())
  }, 500)
}
