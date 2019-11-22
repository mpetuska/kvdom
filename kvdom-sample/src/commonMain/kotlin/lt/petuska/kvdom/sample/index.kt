package lt.petuska.kvdom.sample

import lt.petuska.kvdom.dom.document
import lt.petuska.kvdom.dom.mount
import lt.petuska.kvdom.dom.node.Element
import lt.petuska.kvdom.domain.node.VElement
import lt.petuska.kvdom.domain.node.VText

expect val platform: String


fun main() {
    var clickCount = 0

    // Build your VDOM tree
    val root = VElement("div").apply {
        val countText = VText("Clicked $clickCount times")
        val clickButton = VElement(
            "button",
            children = mutableListOf(
                countText
            ),
            attributes = mutableMapOf("disabled" to "true")
        )
        val enableButton = VElement(
            "button",
            children = mutableListOf(
                VText("Enable counter")
            )
        )
        val disableButton = VElement(
            "button",
            children = mutableListOf(
                VText("Disable counter")
            ),
            attributes = mutableMapOf("disabled" to "true")
        )

        enableButton.eventListeners["click"] = {
            clickButton.eventListeners["click"] = {
                clickCount++
                countText.text = "Clicked $clickCount times"
            }
            enableButton.attributes["disabled"] = "true"
            disableButton.attributes.remove("disabled")
            clickButton.attributes.remove("disabled")
        }
        disableButton.eventListeners["click"] = {
            clickButton.eventListeners.remove("click")
            clickButton.attributes["disabled"] = "true"
            disableButton.attributes["disabled"] = "true"
            enableButton.attributes.remove("disabled")
        }
        children.add(clickButton)
        children.add(enableButton)
        children.add(disableButton)
    }

    // Capture your VDOM snapshot for future diffs
    var snapshot = root.copy()

    // Mount your rendered root VElement
    var domRoot = document.getElementById("root")!!.mount(root.render())

    // Start render timer
    setInterval(100) {
        val patch = snapshot.diff(root)
        snapshot = root.copy()
        patch(domRoot)!!.also { domRoot = it as Element }
    }
}