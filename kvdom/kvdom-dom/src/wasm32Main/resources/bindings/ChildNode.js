konan.libraries.push({
    kvdom_ChildNode_replaceWith: function (
        arena, obj, newArenasArena, newIndexesArena) {
        let newNodes = konan_dependencies.env.arenas.get(newArenasArena).map((newArena, i) => {
            let newIndex = konan_dependencies.env.arenas.get(newIndexesArena)[i];
            return kotlinObject(newArena, newIndex);
        });
        kotlinObject(arena, obj).replaceWith(...newNodes);
        konan_dependencies.env.arenas.get(arena)[obj] = undefined;
    },
    kvdom_ChildNode_remove: function (arena, obj) {
        kotlinObject(arena, obj).remove();
        konan_dependencies.env.arenas.get(arena)[obj] = undefined;
    },
});