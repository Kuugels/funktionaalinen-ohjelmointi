function fact(n) {
// triviaalitapaus
  if (n === 0) {
    return 1;
  }
 // perussilmukka
  return n * fact(n - 1);
}
var tulos = fact(4);
console.log(tulos);

function onPalindromi(merkkijono) {
  
  if (merkkijono.length <= 1) {
    return true;
  }

  if (merkkijono[0] != merkkijono[merkkijono.length-1]) {
    return false;
  }else {
    return onPalindromi(merkkijono.slice(1, merkkijono.length-1));
  }
}

console.log(onPalindromi('saippuakauppias'));