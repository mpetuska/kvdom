konan.libraries.push({
    kvdom_Global_getDocument: function (resultArena) {
        return toArena(resultArena, document);
    },
    kvdom_Global_getWindow: function (resultArena) {
        return toArena(resultArena, window);
    },
});
