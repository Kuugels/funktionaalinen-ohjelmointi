
function raf() {
    return function(luku1, luku2) {
        if (luku1 > luku2) {
            console.log("luku1 on suurempi");
        }else if (luku1 < luku2) {
            console.log("luku2 on suurempi");
        }else {
            console.log("luvut ovat yhtäsuuria");
        }
    };
}

var asd = raf();

asd(1, 1);
asd(1, 2);