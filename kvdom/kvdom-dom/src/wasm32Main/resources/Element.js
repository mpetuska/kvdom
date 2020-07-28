konan.libraries.push({
    kvdom_Element_setAttribute: function (
        arena, obj, keyPtr, keyLen, valuePtr, valueLen) {
        let key = toUTF16String(keyPtr, keyLen);
        let value = toUTF16String(valuePtr, valueLen);
        kotlinObject(arena, obj).setAttribute(key, value);
    },
    kvdom_Element_removeAttribute: function (arena, obj, keyPtr, keyLen) {
        let key = toUTF16String(keyPtr, keyLen);
        kotlinObject(arena, obj).removeAttribute(key);
    },
    kvdom_Element_getAttribute_length: function (arena, obj, namePtr, nameLen) {
        let name = toUTF16String(namePtr, nameLen);
        let attr = kotlinObject(arena, obj).getAttribute(name);
        if (attr !== undefined && attr != null) {
            return attr.toString().length;
        } else {
            return -1;
        }
    },
    kvdom_Element_getAttribute_char: function (
        arena, obj, namePtr, nameLen, charIndex) {
        let name = toUTF16String(namePtr, nameLen);
        return kotlinObject(arena, obj).getAttribute(name).toString().charCodeAt(charIndex);
    },
});