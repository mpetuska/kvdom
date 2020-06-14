package lt.petuska.kvdom.sandbox

import lt.petuska.kvdom.core.*
import lt.petuska.kvdom.core.domain.*
import lt.petuska.kvdom.core.module.*
import lt.petuska.kvdom.dsl.*
import org.w3c.dom.*
import kotlin.browser.*

actual val platform: String = "JS"

val modules = arrayOf(LifecycleLogger)
val patch = kvdom<HTMLDivElement>(document.getElementById("root")!!, *modules)
var tree: VElement<HTMLDivElement>? = null

var count = 10
var clickCount = 0
fun render(): VElement<HTMLDivElement> {
  return element("div") {
    h2 {
      +"Platform: $platform"
    }
    button {
      hooks.create = {
        it.addEventListener("click", {
          clickCount++
          println(clickCount)
        })
      }
      +"I've been clicked $clickCount times"
    }
    if (count > 0) {
      countdown()
    }
  }
}

fun VBuilder.countdown() = div {
  +"Disappearing in $count"
  var localC = 0
  repeat(--count) {
    div {
      +"Line #${count - localC++}!"
    }
  }
}

fun update() {
  tree = tree.patch(render())
}

fun main() {
  console.info("Using modules: $modules")
  console.log("Starting...")
  window.setInterval({
    tree = null.patch(render())
//    tree = if(count > 0) {
//      null.patch(render())
//    } else {
//      tree.patch(null)
//    }
  }, 500)
}
