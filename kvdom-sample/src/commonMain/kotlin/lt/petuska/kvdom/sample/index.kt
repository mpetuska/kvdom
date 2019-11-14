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
            )
        )
        val vApp = ElementNode(
            "div",
            children = mutableListOf(
                ElementNode("h1", children = mutableListOf(TextNode("Platform: $platform"))),
                vBtn
            )
        )
        val dRoot = mountRoot(vApp)!!
        vBtn.eventListeners["click"] = { event ->
            clickCount++
            vBtn.eventListeners.remove("click")
            countText.text = "Clicked $clickCount times"
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