
function syt(p, q) {
    if (q === 0) {
        return p;
    }else {
        return syt(q, p%q);
    }
}

console.log(syt(102, 68)) // 34
console.log(syt(35, 18)); // 1