konan.libraries.push({
    kvdom_DElement_setAttribute: function (arena, obj, keyPtr, keyLen, valuePtr, valueLen) {
        var key = toUTF16String(keyPtr, keyLen);
        var value = toUTF16String(valuePtr, valueLen);
        kotlinObject(arena, obj).setAttribute(key, value);
    },
    kvdom_DElement_removeAttribute: function (arena, obj, keyPtr, keyLen) {
        var key = toUTF16String(keyPtr, keyLen);
        kotlinObject(arena, obj).removeAttribute(key, value);
    },
    kvdom_DElement_appendChild: function (arena, obj, childArena, childObj) {
        kotlinObject(arena, obj).appendChild(kotlinObject(childArena, childObj))
    },
    kvdom_DElement_childNodes: function (arena, obj) {
        var nodes = kotlinObject(arena, obj).childNodes;
        return toArena(arena, nodes)
    }
});