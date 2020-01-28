package lt.petuska.kvdom.sample

import lt.petuska.kvdom.core.node.VText
import lt.petuska.kvdom.core.node.html.VDiv
import lt.petuska.kvdom.dsl.*
import lt.petuska.kvdom.core.node.text
import lt.petuska.kvdom.dom.document
import lt.petuska.kvdom.dom.node.html.HTMLElement
import lt.petuska.kvdom.dom.node.setInterval
import lt.petuska.kvdom.dom.window

expect val platform: String


fun main() {
    var clickCount = 0

    // Build your VDOM tree
    val root = VDiv().apply {
        h2 {
            text("Platform: $platform")
        }
        lateinit var countText: VText
        val clickButton = button {
            countText = text("Clicked $clickCount times")
            attributes["disabled"] = "true"
        }
        val enableButton = button {
            text("EnableCounter")
        }
        val disableButton = button {
            text("Disable counter")
            attributes["disabled"] = "true"
        }
        val clicksContainer = div()
        enableButton.eventListeners["click"] = {
            clickButton.eventListeners["click"] = {
                clickCount++
                countText.text = "Clicked $clickCount times"
                println("Clicked!")
                clicksContainer.apply {
                    text("#$clickCount ")
                }
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
        htmlElement<HTMLElement>("br")
        children.add(clicksContainer)
    }

    // Mount your rendered root VElement
    val dRoot = document.getElementById("root")!!

    // Start render timer
    window.setInterval(100) {
        root.patch(dRoot)
    }
}