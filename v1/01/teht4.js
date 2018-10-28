
function potenssi(x, y) {
    if (y <= 1) {
        return x;
    }else {
        console.log("y",y, "x", x);
        return x * potenssi(x, y - 1);
    }
}

console.log(potenssi(5, 5));