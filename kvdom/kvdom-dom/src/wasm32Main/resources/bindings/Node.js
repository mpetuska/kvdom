konan.libraries.push({
  kvdom_Node_appendChild: function(arena, obj, childArena, childObj) {
    kotlinObject(arena, obj).appendChild(kotlinObject(childArena, childObj));
  },
  kvdom_Node_childNodes: function(arena, obj) {
    let nodes = kotlinObject(arena, obj).childNodes;
    return toArena(arena, nodes);
  },
});