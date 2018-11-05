
var lamp15 = [-5, -10, -2, 3, 15, 23, 25, 26, 24, 16, 7, -5];
var lamp16 = [-4, -12, -1, 4, 14, 25, 25, 22, 23, 17, 8, -4];

var pos15 = lamp15.filter(lamp => lamp > 0);
var pos16 = lamp16.filter(lamp => lamp > 0);

var reducer = (accumulator, currentValue) => accumulator + currentValue;

var keskLamp = (pos15.reduce(reducer) + pos16.reduce(reducer)) / pos15.length;

console.log(keskLamp);

