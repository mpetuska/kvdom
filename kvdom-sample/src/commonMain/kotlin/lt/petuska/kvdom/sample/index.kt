package lt.petuska.kvdom.sample

import lt.petuska.kvdom.definitions.dom.document
import lt.petuska.kvdom.definitions.dom.node.Node
import lt.petuska.kvdom.definitions.vdom.VElement
import lt.petuska.kvdom.dom.mount
import lt.petuska.kvdom.domain.node.ElementNode
import lt.petuska.kvdom.domain.node.TextNode

expect val platform: String


lateinit var old: VElement
fun render(node: Node, vNode: ElementNode) {
    val patch = old.diff(vNode)
    old = vNode.copy()
    patch(node)
}

fun main() {
    onLoaded {
        println("Starting")
        var clickCount = 0
        val countText = TextNode("Clicked $clickCount times")
        val vBtn = ElementNode(
            "button",
            children = mutableListOf(
                countText
            ),
            attributes = mutableMapOf("disabled" to "true")
        )
        val removeListenerButton = ElementNode(
            "button",
            children = mutableListOf(
                TextNode("Disable counter")
            ),
            attributes = mutableMapOf("disabled" to "true")
        )
        val addListenerButton = ElementNode(
            "button",
            children = mutableListOf(
                TextNode("Enable counter")
            )
        )
        val vApp = ElementNode(
            "div",
            children = mutableListOf(
                ElementNode("h1", children = mutableListOf(TextNode("Platform: $platform"))),
                vBtn,
                addListenerButton,
                removeListenerButton
            )
        )
        val dRoot = mountRoot(vApp)!!
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
    val root = document.getElementById("root")
    println("Mounting on root: $root")
    old = element.copy()
    root?.mount(element.render())
}