

function potenssi(x, y) {
    
    function apu(x1, y1) {
        if (y1 <= 1) {
            return x1;
        }else {
            console.log("y",y1, "x", x1);
            return x1 * apu(x1, y1 - 1);
        }
    }
    
    return potenssi(x, y);
}

console.log(potenssi(5, 5));