# KVDOM Sample App

## Running

### JS
Simply execute `gradle jsBrowserRun` command which will open up a browser for you on port `3000`.
Alternatively you can run gradle wrapper from repository's root as `./gradlew kvdom-sample:jsBrowserRun`

### WASM
Build a bundle with `gradle wasmBundle` or from repository's root `./gradlew kvdom-sample:wasmBundle`
Change to `build/bundle/wasm` directory and start an [http server](https://www.npmjs.com/package/http-server) from there. 