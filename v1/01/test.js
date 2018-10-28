const f = function() {
    return function(x) {
        return x + 1;
    }
};
let tulos = f(3);
console.log(tulos);
