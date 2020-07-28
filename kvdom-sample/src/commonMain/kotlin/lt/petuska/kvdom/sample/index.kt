package lt.petuska.kvdom.sample

import kotlinx.html.*
import kotlinx.html.js.onClickFunction
import kotlinx.html.js.onContextMenuFunction
import lt.petuska.kvdom.core.domain.VElement
import lt.petuska.kvdom.core.domain.vBuilder
import lt.petuska.kvdom.core.kvdom
import lt.petuska.kvdom.core.module.events.Events
import lt.petuska.kvdom.core.module.events.on
import lt.petuska.kvdom.core.module.hooks.Hooks
import lt.petuska.kvdom.core.module.hooks.useState
import lt.petuska.kvdom.dom.document
import lt.petuska.kvdom.dom.html.HTMLDivElement
import lt.petuska.kvdom.dom.setInterval
import lt.petuska.kvdom.dom.window
import lt.petuska.kvdom.dsl.*
import kotlin.math.max
import kotlin.random.Random


// Build your VDOM tree
fun render() = vBuilder {
  var clickDisabled by useState(false)
  var clickCount by useState(0)
  h2 {
    +"Platform: $platform"
  }
  h3 {
    +"Rendered with: vBuilder"
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
  br()
  div {
    repeat(clickCount) {
      div {
        +"Click #${it + 1}"
      }
    }
  }
}

fun renderKotlinx() = KVDOMBuilder {
  var clickDisabled by useState(false)
  var clickCount by useState(0)
  var surprising by useState(false)
  h2 {
    +"Platform: $platform"
  }
  h3 {
    +"Rendered with: kotlinx-html"
  }
  button {
    disabled = clickDisabled
    onContextMenuFunction = {
      it.preventDefault()
      clickCount = max(clickCount - 1, 0)
      // Conditional Event handling
      if (clickCount > 4) {
        println(clickCount)
      }
    }
    // Conditional Event Handlers
    if (clickCount >= 4) {
      onClickFunction = {
        clickCount++
        println(clickCount)
      }
    } else {
      onClickFunction = {
        clickCount++
      }
    }
    +"Clicked $clickCount times"
  }
  button {
    disabled = !clickDisabled
    onClickFunction = {
      clickDisabled = false
    }
    +"EnableCounter"
  }
  button {
    disabled = clickDisabled
    onClickFunction = {
      clickDisabled = true
    }
    +"DisableCounter"
  }
  button {
    onClickFunction = {
      surprising = !surprising
    }
    +if (surprising) "Enough!" else "Surprise Me!"
  }
  br()
  div {
    if (!surprising) {
      repeat(clickCount) {
        div {
          +"Click #${it + 1}"
        }
      }
    } else {
      repeat(Random(currentTimeMillis()).nextInt(100, 1000)) {
        span {
          +"Surprise #$it"
        }
      }
    }
  }
}

val modules = arrayOf(
//  LifecycleLogger,
  Events,
  Hooks,
)

fun main() {
  val container = document.getElementById("root")!!
  val patch = kvdom(container, *modules)
  var tree: VElement<HTMLDivElement>? = null
  window.setInterval(33) {
//    val next = render()
    val next = renderKotlinx()
    tree = tree.patch(next)
  }
}
