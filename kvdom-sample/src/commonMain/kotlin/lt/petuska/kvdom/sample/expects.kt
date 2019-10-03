package lt.petuska.kvdom.sample

expect fun onLoaded(action: () -> Unit)

expect fun setInterval(ms: Int, action: () -> Unit)