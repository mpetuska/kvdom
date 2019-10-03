konan.libraries.push({
    kvdom_Global_getDocument: function (resultArena) {
        return toArena(resultArena, document);
    },
    kvdom_Document_getElementById: function (arena, obj, idPtr, idLen, resultArena) {
        var id = toUTF16String(idPtr, idLen);
        var result = kotlinObject(arena, obj).getElementById(id);
        return toArena(resultArena, result);
    },
    kvdom_Document_createElement: function (arena, obj, tagPtr, tagLen, resultArena) {
        var tag = toUTF16String(tagPtr, tagLen);
        var result = kotlinObject(arena, obj).createElement(tag);
        return toArena(resultArena, result);
    },
    kvdom_Document_createTextNode: function (arena, obj, textPtr, textLen, resultArena) {
        var text = toUTF16String(textPtr, textLen);
        var result = kotlinObject(arena, obj).createTextNode(text);
        return toArena(resultArena, result);
    }
});