//package lt.petuska.kvdom.dom
//
//import lt.petuska.kvdom.domain.node.Node
//import lt.petuska.kvdom.domain.node.TextNode
//import lt.petuska.kvdom.jsexternal.DElement
//import lt.petuska.kvdom.jsexternal.DNode
//import lt.petuska.kvdom.jsexternal.StubDElement
//import lt.petuska.kvdom.jsexternal.StubDNode
//import lt.petuska.kvdom.testutil.ValueProvider
//import kotlin.test.Test
//
//class PatchTest {
//    @Test
//    fun diffTextNode() {
//        val old: Node = ValueProvider.textNode("I'm so old :/")
//        val oldDNode: DNode = mockk<StubDNode> {
//            every { replaceWith(allAny<StubDNode>()) } returns Unit
//        }
//        val newDNode: DNode = mockk<StubDNode>()
//        val new = spyk(ValueProvider.textNode("Brand new day, baby!")) {
//            every { render() } returns newDNode
//        }
//
//        val patch = old.diff(new)
//        patch(oldDNode)
//
//        verify(exactly = 1) { new.render() }
//        verify(exactly = 1) { oldDNode.replaceWith(newDNode) }
//    }
//
//    @Test
//    fun diffElementNode() {
//        val old = ValueProvider.elementNode()
//        val oldDNode: DElement = mockk<StubDElement> {
//            TODO()
//        }
//        val new = spyk(ValueProvider.elementNode(
//            tag = "${old.tag}new",
//            attributes = mutableMapOf("new" to "reallyNew").apply {
//                putAll(old.attributes)
//            },
//            children = mutableListOf<Node>(TextNode("I'm new")).apply { addAll(old.children) }
//        ))
//        val newDNode: DElement = mockk<StubDElement> {
//            TODO()
//        }
//
//        val patch = old.diff(new)
//        patch(oldDNode)
//
//        TODO("Verifications")
//    }
//}