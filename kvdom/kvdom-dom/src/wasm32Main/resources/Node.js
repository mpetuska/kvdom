konan.libraries.push({
    kvdom_Node_appendChild: function (arena, obj, childArena, childObj) {
        const parent = kotlinObject(arena, obj);
        const child = kotlinObject(childArena, childObj);
        parent.appendChild(child);
    },
    kvdom_Node_removeChild: function (arena, obj, childArena, childObj) {
        const parent = kotlinObject(arena, obj);
        const child = kotlinObject(childArena, childObj);
        parent.removeChild(child);
    },
    kvdom_Node_hasChildNodes: function (arena, obj) {
        const bool = kotlinObject(arena, obj).hasChildNodes();
        return bool === undefined ? -1 : bool ? 1 : 0;
    },
    kvdom_Node_childNodes: function (arena, obj) {
        const nodes = kotlinObject(arena, obj).childNodes;
        return toArena(arena, nodes);
    },
});
