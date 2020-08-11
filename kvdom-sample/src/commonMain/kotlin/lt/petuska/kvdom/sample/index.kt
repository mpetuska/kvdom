package lt.petuska.kvdom.sample

import kotlinx.css.*
import kotlinx.html.*
import kotlinx.html.js.*
import lt.petuska.kvdom.core.*
import lt.petuska.kvdom.core.domain.*
import lt.petuska.kvdom.core.module.events.*
import lt.petuska.kvdom.core.module.hooks.*
import lt.petuska.kvdom.dom.*
import lt.petuska.kvdom.dom.html.*
import lt.petuska.kvdom.dsl.*
import kotlin.math.*
import kotlin.random.*

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
    css {
      backgroundColor = if (!clickDisabled) Color.blue else Color.gray
      color = Color.white
    }
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
    css {
      backgroundColor = if (clickDisabled) Color.green else Color.gray
      color = Color.white
    }
    disabled = !clickDisabled
    if (clickDisabled) {
      onClickFunction = {
        clickDisabled = false
      }
    }
    +"EnableCounter"
  }
  button {
    css {
      backgroundColor = if (!clickDisabled) Color.red else Color.gray
      color = Color.white
    }
    disabled = clickDisabled
    if (!clickDisabled) {
      onClickFunction = {
        clickDisabled = true
      }
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
      val random = Random(currentTimeMillis())
      (0 until random.nextInt(100, 1000)).toList().map { random.nextInt(0, 1000) }.forEach {
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
  window.setInterval(150) {
    val next = renderKotlinx()
    tree = tree.patch(next)
  }
}
