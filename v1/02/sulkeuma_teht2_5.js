'use strict';

var Moduuli = function (num) {
  let x = 0;
    return {
      kasvata: function() {
        return x++;
      },
      vahenna: function() {
        return x--;
      }
  };
}();

console.log("kasvata " + Moduuli.kasvata()); 
console.log("kasvata " + Moduuli.kasvata()); 
console.log("kasvata " + Moduuli.kasvata()); 
console.log("vähennä " + Moduuli.vahenna()); 
console.log("vähennä " + Moduuli.vahenna()); 
console.log("vähennä " + Moduuli.vahenna()); 