package lt.petuska.kvdom.sample

import lt.petuska.kvdom.dom.createElement
import lt.petuska.kvdom.dom.mount
import lt.petuska.kvdom.domain.node.ElementNode
import lt.petuska.kvdom.domain.node.TextNode
import lt.petuska.kvdom.jsexternal.IDNode
import lt.petuska.kvdom.jsexternal.document
import kotlin.random.Random

val gifs = listOf(
    "https://media.giphy.com/media/xUPJPylKigYLL8asTK/giphy.gif",
    "https://media.giphy.com/media/xT5LMpu4n4WxVoEzNS/giphy.gif",
    "https://media.giphy.com/media/l2JdYU2kS8hTGtS4o/giphy.gif"
)

val random = Random(123)

expect val platform: String

fun main() {
    onLoaded {
        var count = 0
        var vApp = createVApp(count)
        var dRoot: IDNode? = document.getElementById("root")!!.mount(vApp.render())

        setInterval(1000) {
            count = random.nextInt(0, 8)
            val vNewApp = createVApp(count)
            val patch = vApp.diff(vNewApp)

            vApp = vNewApp
            dRoot = dRoot?.let(patch)
        }
    }
}


fun createVApp(count: Int) = createElement(
    tag = "div",
    attributes = mapOf(
        "id" to "app",
        "dataCount" to "$count"
    ),
    children = listOf(
        createElement("h3", children = listOf(TextNode("Platform: $platform"))),
        createElement("div", children = listOf(
            TextNode("Static"),
            createElement(
                tag = "div",
                attributes = mapOf("id" to "static"),
                children = listOf(
                    createImage(),
                    createImage()
                )
            ),
            ElementNode("br"),
            ElementNode("br"),
            TextNode("Dynamic"),
            createElement(
                tag = "div",
                children = listOf(
                    TextNode("The current count is: "),
                    TextNode("$count")
                )
            ),
            createElement(
                tag = "div",
                attributes = mapOf("id" to "dynamic"),
                children = listOf(
                    *Array(count) {
                        createImage()
                    }
                )
            )
        ))
    )
)

fun createImage() = createElement(
    tag = "img",
    attributes = mapOf(
        "src" to gifs[random.nextInt(gifs.size)],
        "width" to "352px",
        "height" to "270px"
    ),
    children = listOf(TextNode("Hello"))
)