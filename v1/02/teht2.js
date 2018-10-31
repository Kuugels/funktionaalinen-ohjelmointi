function compare() {
    return function(luku1, luku2) {
        if (luku1 > luku2) {
            return 1;
        }else {
            return 0;
        }
    };
}

function monthlyTemperatures(compare ,arr1, arr2) {
    var temp = 0;
    for (var i = 0; i < arr1.length; i++) {
        temp += compare(arr1[i], arr2[i]);
    }
    console.log("Vuoden 2016 kesällä keskilämpötilat olivat korkeammat " + temp + " kuukautena");
}

var kesa15 = [24, 25, 24, 27];
var kesa16 = [25, 24, 24, 26];

monthlyTemperatures(compare(), kesa16, kesa15);