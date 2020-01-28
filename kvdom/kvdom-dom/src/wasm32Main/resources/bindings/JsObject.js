konan.libraries.push({
    kvdom_JsObject_getStringPropertyLength: function (arena, obj, namePtr, nameLen) {
        let name = toUTF16String(namePtr, nameLen);
        let prop = kotlinObject(arena, obj)[name];
        if (prop !== undefined && prop != null) {
            return prop.toString().length
        } else {
            return -1;
        }
    },
    kvdom_JsObject_getStringPropertyChar: function (arena, obj, namePtr, nameLen, charIndex) {
        let name = toUTF16String(namePtr, nameLen);
        return kotlinObject(arena, obj)[name].charCodeAt(charIndex);
    }
    ,
    kvdom_JsObject_setStringProperty: function (arena, obj, namePtr, nameLen, valuePtr, valueLen) {
        let name = toUTF16String(namePtr, nameLen);
        let value;
        if (valuePtr < 0 || valueLen < 0) {
            value = null;
        } else {
            value = toUTF16String(valuePtr, valueLen);
        }
        return kotlinObject(arena, obj)[name] = value;
    }
});