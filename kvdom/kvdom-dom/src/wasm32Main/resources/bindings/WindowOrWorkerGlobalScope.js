konan.libraries.push({
  kvdom_Global_getWindow: function(resultArena) {
    return toArena(resultArena, window);
  },
  kvdom_WindowOrWorkerGlobalScope_setInterval: function(
      arena, obj, funcPtr, delay) {
    let func = konan_dependencies.env.Konan_js_wrapLambda(arena, funcPtr);
    let kObj = kotlinObject(arena, obj);
    return kObj.setInterval(func, delay);
  },
  kvdom_WindowOrWorkerGlobalScope_clearInterval: function(
      arena, obj, intervalId) {
    let kObj = kotlinObject(arena, obj);
    kObj.clearInterval(intervalId);
  },
  kvdom_WindowOrWorkerGlobalScope_setTimeout: function(
      arena, obj, funcPtr, delay) {
    let func = konan_dependencies.env.Konan_js_wrapLambda(arena, funcPtr);
    let kObj = kotlinObject(arena, obj);
    return kObj.setTimeout(func, delay);
  },
  kvdom_WindowOrWorkerGlobalScope_clearTimeout: function(
      arena, obj, timeoutId) {
    let kObj = kotlinObject(arena, obj);
    kObj.clearTimeout(timeoutId);
  },
});