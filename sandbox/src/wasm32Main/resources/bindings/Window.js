konan.libraries.push({
  kvdom_Global_getWindow: function(resultArena) {
    return toArena(resultArena, window);
  },
});