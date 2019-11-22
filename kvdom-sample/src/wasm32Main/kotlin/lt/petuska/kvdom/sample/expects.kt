package lt.petuska.kvdom.sample


actual fun onLoaded(action: () -> Unit) {
    action()
}

actual fun setInterval(ms: Int, action: () -> Unit) {
    kotlinx.interop.wasm.dom.setInterval(ms) {
        action()
    }
}