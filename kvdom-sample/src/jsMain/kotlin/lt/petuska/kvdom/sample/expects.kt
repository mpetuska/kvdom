package lt.petuska.kvdom.sample

import kotlin.browser.window

actual fun onLoaded(action: () -> Unit) {
    window.onload = {
        action()
    }
}

actual fun setInterval(ms: Int, action: () -> Unit) {
    window.setInterval(timeout = ms, handler = {
        action()
    })
}