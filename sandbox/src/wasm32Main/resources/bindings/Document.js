konan.libraries.push({
  kvdom_Global_getDocument: function(resultArena) {
    return toArena(resultArena, document);
  },
  kvdom_Document_getElementById: function(
      arena, obj, idPtr, idLen, resultArena) {
    let id = toUTF16String(idPtr, idLen);
    let result = kotlinObject(arena, obj).getElementById(id);
    return result !== null && result !== undefined ? toArena(resultArena,
        result) : -1;
  },
  kvdom_Document_createElement: function(
      arena, obj, tagPtr, tagLen, resultArena) {
    let tag = toUTF16String(tagPtr, tagLen);
    let result = kotlinObject(arena, obj).createElement(tag);
    return toArena(resultArena, result);
  },
  kvdom_Document_createTextNode: function(
      arena, obj, textPtr, textLen, resultArena) {
    let text = toUTF16String(textPtr, textLen);
    let result = kotlinObject(arena, obj).createTextNode(text);
    return toArena(resultArena, result);
  },
  kvdom_Document_defaultView: function(arena, obj) {
    let defaultView = kotlinObject(arena, obj).defaultView;
    return defaultView == null ? -1 : toArena(arena, defaultView);
  },
});