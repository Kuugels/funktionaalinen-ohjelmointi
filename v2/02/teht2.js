
const Auto = (function() {
    var wm = new WeakMap();
    var polttoaine;
    class Auto {
        constructor(p_polttoaine, p_ajettu){
            wm.set(this, {ajettu: p_ajettu});
            polttoaine = p_polttoaine;
        }
        aja() {
            if (this.polttoaine > 0,5){
                this.polttoaine -= 0,5;
                wm.set(this, {ajettu: wm.get(this).ajettu + 2});
                console.log("jee jee");
            }else {
                console.log("oispa bensaa");
            }
        }
        tankkaa(maara) {
            this.polttoaine += maara;
        }
        getTankki() {
            return this.polttoaine;
        }
        getAjettu() {
            return wm.get(this).ajettu;
        }
    }
    return Auto;
})();

const auto = new Auto(1, 10);
const auto1 = new Auto(1, 100);

// teht 3
const muuttumatonAuto = Object.freeze(auto1);

console.log(auto.getTankki());
console.log(auto.getAjettu());
console.log(auto.aja());
console.log(auto.getTankki());
console.log(auto.getAjettu());


//console.log(muuttumatonAuto.aja());
console.log(muuttumatonAuto.getAjettu());