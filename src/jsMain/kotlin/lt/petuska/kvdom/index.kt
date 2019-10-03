package lt.petuska.kvdom

import lt.petuska.kvdom.dom.createElement
import lt.petuska.kvdom.dom.mount
import lt.petuska.kvdom.domain.node.TextNode
import lt.petuska.kvdom.jsexternal.DNode
import lt.petuska.kvdom.jsexternal.document
import kotlin.browser.window
import kotlin.math.floor
import kotlin.random.Random

fun main() {
    var count = 0

    window.onload = {
        var vApp = createVApp(count)
        var dRoot: DNode? = document.getElementById("root")!!.mount(vApp.render())
        val random = Random(123)
        window.setInterval(handler = {

            count = floor(random.nextDouble() * 10).toInt()
            val vNewApp = createVApp(count)
            val patch = vApp.diff(vNewApp)

            vApp = vNewApp
            dRoot = dRoot?.let(patch)
        }, timeout = 1000)
    }
}

fun createVApp(count: Int) = createElement(
    tag = "div",
    attributes = mapOf(
        "id" to "app",
        "dataCount" to "$count"
    ),
    children = listOf(
        createElement(
            tag = "div",
            children = listOf(

                TextNode("The current count is: "),
                TextNode("$count")
            )
        ),
        *Array(count) {
            createElement(
                "img",
                mapOf("src" to "https://media.giphy.com/media/3oKGzCvdJbyWsc5Nni/giphy.gif"),
                listOf(TextNode("Hello"))
            )
        }
    )
)