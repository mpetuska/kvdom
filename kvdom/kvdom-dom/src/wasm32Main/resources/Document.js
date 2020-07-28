konan.libraries.push({
    kvdom_Document_getElementById: function (
        arena, obj, idPtr, idLen, resultArena) {
        const id = toUTF16String(idPtr, idLen);
        const result = kotlinObject(arena, obj).getElementById(id);
        return result !== null && result !== undefined ? toArena(resultArena,
            result) : -1;
    },
    kvdom_Document_createElement: function (
        arena, obj, tagPtr, tagLen, resultArena) {
        const tag = toUTF16String(tagPtr, tagLen);
        const result = kotlinObject(arena, obj).createElement(tag);
        return toArena(resultArena, result);
    },
    kvdom_Document_createElementNS: function (
        arena, obj, tagPtr, tagLen, nsPtr, nsLen, resultArena) {
        const tag = toUTF16String(tagPtr, tagLen);
        const ns = toUTF16String(nsPtr, nsLen);
        const result = kotlinObject(arena, obj).createElementNS(ns, tag);
        return toArena(resultArena, result);
    },
    kvdom_Document_createTextNode: function (
        arena, obj, textPtr, textLen, resultArena) {
        const text = toUTF16String(textPtr, textLen);
        const result = kotlinObject(arena, obj).createTextNode(text);
        return toArena(resultArena, result);
    },
    kvdom_Document_defaultView: function (arena, obj) {
        const defaultView = kotlinObject(arena, obj).defaultView;
        return defaultView == null ? -1 : toArena(arena, defaultView);
    },
});
