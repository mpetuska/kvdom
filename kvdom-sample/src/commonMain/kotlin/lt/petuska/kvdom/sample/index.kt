package lt.petuska.kvdom.sample

import lt.petuska.kvdom.core.node.VElement
import lt.petuska.kvdom.core.node.VText
import lt.petuska.kvdom.dom.document
import lt.petuska.kvdom.dom.node.setInterval
import lt.petuska.kvdom.dom.window

expect val platform: String


fun main() {
    var clickCount = 0

    // Build your VDOM tree
    val root = VElement("div").apply {
        children.add(VElement("h2", children = mutableListOf(VText("Platform: $platform"))))
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
        val clicksContainer = VElement("div")

        enableButton.eventListeners["click"] = {
            clickButton.eventListeners["click"] = {
                clickCount++
                countText.text = "Clicked $clickCount times"
                println("Clicked!")
                clicksContainer.children.add(VText("#$clickCount "))
            }
            clickButton.eventListeners["contextmenu"] = {
                it.preventDefault()
                if (clickCount > 0) {
                    clickCount--
                    countText.text = "Clicked $clickCount times"
                    clicksContainer.children.removeAt(clickCount)
                    println("Unclicked!")
                }
            }
            enableButton.attributes["disabled"] = "true"
            disableButton.attributes.remove("disabled")
            clickButton.attributes.remove("disabled")
            println("Enabled!")
        }
        disableButton.eventListeners["click"] = {
            clickButton.eventListeners.remove("click")
            clickButton.eventListeners.remove("contextmenu")
            clickButton.attributes["disabled"] = "true"
            disableButton.attributes["disabled"] = "true"
            enableButton.attributes.remove("disabled")
            println("Disabled!")
        }
        children.add(clickButton)
        children.add(enableButton)
        children.add(disableButton)

        children.add(VElement("br"))
        children.add(clicksContainer)
    }

    // Mount your rendered root VElement
    val dRoot = document.getElementById("root")!!

    // Start render timer
    window.setInterval(100) {
        root.patch(dRoot)
    }
}