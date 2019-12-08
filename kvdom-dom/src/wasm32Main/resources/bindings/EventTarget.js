konan.libraries.push({
    kvdom_EventTarget_addEventListener: function (arena, obj, typePtr, typeLen, listenerPtr) {
        let type = toUTF16String(typePtr, typeLen);
        let listener = konan_dependencies.env.Konan_js_wrapLambda(arena, listenerPtr);
        let kObj = kotlinObject(arena, obj);
        kObj.kListeners = obj.kListeners || {};
        kObj.kListeners[listenerPtr] = listener;
        kObj.addEventListener(type, listener);
    },
    kvdom_EventTarget_removeEventListener: function (arena, obj, typePtr, typeLen, listenerPtr) {
        let type = toUTF16String(typePtr, typeLen);
        let kObj = kotlinObject(arena, obj);
        let listener = (kObj.kListeners || {})[listenerPtr];
        kObj.removeEventListener(type, listener);
        (kObj.kListeners || {})[listenerPtr] = undefined;
    }
});