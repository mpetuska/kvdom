konan.libraries.push({
    kvdom_EventTarget_setEventListener: function (
        arena, obj, typePtr, typeLen, listenerPtr) {
        let type = toUTF16String(typePtr, typeLen);
        let listener = konan_dependencies.env.Konan_js_wrapLambda(arena,
            listenerPtr);
        let kObj = kotlinObject(arena, obj);
        kObj.kListeners = obj.kListeners || {};
        kObj.kListeners[listenerPtr] = listener;
        kObj[`on${type}`] = listener
    },
    kvdom_EventTarget_deleteEventListener: function (
        arena, obj, typePtr, typeLen, listenerPtr) {
        let type = toUTF16String(typePtr, typeLen);
        let kObj = kotlinObject(arena, obj);
        let listener = (kObj.kListeners || {})[listenerPtr];
        kObj[`on${type}`] = undefined;
        (kObj.kListeners || {})[listenerPtr] = undefined;
    },
});
