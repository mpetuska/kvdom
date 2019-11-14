konan.libraries.push({
    kvdom_JsObject_getStringPropertyLength: function (arena, obj, namePtr, nameLen) {
        let name = toUTF16String(namePtr, nameLen);
        return kotlinObject(arena, obj)[name].length;
    },
    kvdom_JsObject_getStringPropertyChar: function (arena, obj, namePtr, nameLen, charIndex) {
        let name = toUTF16String(namePtr, nameLen);
        return kotlinObject(arena, obj)[name].charCodeAt(charIndex);
    }
});