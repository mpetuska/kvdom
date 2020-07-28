konan.libraries.push({
    kvdom_JsValue_getStringPropertyLength: function (
        arena, obj, namePtr, nameLen) {
        let name = toUTF16String(namePtr, nameLen);
        let prop = kotlinObject(arena, obj)[name];
        if (prop !== undefined && prop != null) {
            return prop.toString().length;
        } else {
            return -1;
        }
    },
    kvdom_JsValue_getObjProperty: function (
        arenaIndex, objIndex, propertyNamePtr, propertyNameLength) {
        const property = toUTF16String(propertyNamePtr, propertyNameLength);
        const arena = konan_dependencies.env.arenas.get(arenaIndex);
        const value = arena[objIndex][property];
        if (value !== undefined) {
            arena.push(value);
            return arena.length - 1;
        } else {
            return -1;
        }
    },
    kvdom_JsValue_setObjProperty: function (
        arenaIndex, objIndex, propertyNamePtr, propertyNameLength, valArena, valIndex) {
        const property = toUTF16String(propertyNamePtr, propertyNameLength);
        const obj = konan_dependencies.env.arenas.get(arenaIndex)[objIndex];
        if (valArena === -1 && valArena === -1) {
            obj[property] = null;
        } else {
            obj[property] = konan_dependencies.env.arenas.get(valArena)[valIndex];
        }
    },
    kvdom_JsValue_getBooleanProperty: function (
        arena, obj, namePtr, nameLen) {
        let name = toUTF16String(namePtr, nameLen);
        const bool = kotlinObject(arena, obj)[name];
        return bool === undefined ? -1 : bool ? 1 : 0;
    },
    kvdom_JsValue_getStringPropertyChar: function (
        arena, obj, namePtr, nameLen, charIndex) {
        let name = toUTF16String(namePtr, nameLen);
        return kotlinObject(arena, obj)[name].charCodeAt(charIndex);
    },
    kvdom_JsValue_setStringProperty: function (
        arena, obj, namePtr, nameLen, valuePtr, valueLen) {
        let name = toUTF16String(namePtr, nameLen);
        let value;
        if (valuePtr < 0 || valueLen < 0) {
            value = null;
        } else {
            value = toUTF16String(valuePtr, valueLen);
        }
        return kotlinObject(arena, obj)[name] = value;
    },
});
