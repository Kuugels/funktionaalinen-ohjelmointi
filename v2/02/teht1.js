
function pisteet(k, lisaPisteet) {
    return function(hyppy) {
        if (hyppy < k) {
            return 60 - ((k - hyppy ) * lisaPisteet);
        }else if(hyppy > k) {
            return 60 + ((hyppy - k) * lisaPisteet);
        }else {
            return 60;
        }
    }
}

var normiMaki = pisteet(75, 1,8);
var suurMaki = pisteet(100, 2);

console.log(normiMaki(75));
console.log(suurMaki(101));

// ääää