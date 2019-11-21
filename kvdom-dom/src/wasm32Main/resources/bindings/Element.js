konan.libraries.push({
    kvdom_Element_setAttribute: function (arena, obj, keyPtr, keyLen, valuePtr, valueLen) {
        let key = toUTF16String(keyPtr, keyLen);
        let value = toUTF16String(valuePtr, valueLen);
        kotlinObject(arena, obj).setAttribute(key, value);
    },
    kvdom_Element_removeAttribute: function (arena, obj, keyPtr, keyLen) {
        let key = toUTF16String(keyPtr, keyLen);
        kotlinObject(arena, obj).removeAttribute(key);
    }
});