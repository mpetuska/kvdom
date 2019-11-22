package lt.petuska.kvdom.sample

import lt.petuska.kvdom.dom.document
import lt.petuska.kvdom.dom.mount
import lt.petuska.kvdom.dom.node.Node
import lt.petuska.kvdom.domain.node.VElement
import lt.petuska.kvdom.domain.node.VNode
import lt.petuska.kvdom.domain.node.VText

expect val platform: String


lateinit var old: VNode
fun render(node: Node, vNode: VNode) {
    val patch = old.diff(vNode)
    old = vNode.copy()
    patch(node)
}

fun main() {
    onLoaded {
        println("Starting")
        var clickCount = 0
        val countText = VText("Clicked $clickCount times")
        val vBtn = VElement(
            "button",
            children = mutableListOf(
                countText
            ),
            attributes = mutableMapOf("disabled" to "true")
        )
        val removeListenerButton = VElement(
            "button",
            children = mutableListOf(
                VText("Disable counter")
            ),
            attributes = mutableMapOf("disabled" to "true")
        )
        val addListenerButton = VElement(
            "button",
            children = mutableListOf(
                VText("Enable counter")
            )
        )
        val vApp = VElement(
            "div",
            children = mutableListOf(
                VElement("h1", children = mutableListOf(VText("Platform: $platform"))),
                vBtn,
                addListenerButton,
                removeListenerButton
            )
        )
        val dRoot = mountRoot(vApp)
        addListenerButton.eventListeners["click"] = {
            vBtn.eventListeners["click"] = {
                clickCount++
                countText.text = "Clicked $clickCount times"
            }
            addListenerButton.attributes["disabled"] = "true"
            removeListenerButton.attributes.remove("disabled")
            vBtn.attributes.remove("disabled")
        }
        removeListenerButton.eventListeners["click"] = {
            vBtn.eventListeners.remove("click")
            vBtn.attributes["disabled"] = "true"
            removeListenerButton.attributes["disabled"] = "true"
            addListenerButton.attributes.remove("disabled")
        }

        setInterval(100) {
            render(dRoot, vApp)
        }
    }
}

fun mountRoot(element: VElement) = run {
    val root = document.getElementById("root")!!
    println("Mounting on root: $root")
    old = element.copy()
    root.mount(element.render())
}