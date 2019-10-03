konan.libraries.push({
    kvdom_DNode_replaceWith: function (arena, obj, newArena, newObj) {
        kotlinObject(arena, obj).replaceWith(kotlinObject(newArena, newObj));
        konan_dependencies.env.arenas.get(arena)[obj] = undefined;
    },
    kvdom_DNode_remove: function (arena, obj) {
        kotlinObject(arena, obj).remove();
        konan_dependencies.env.arenas.get(arena)[obj] = undefined;
    }
});