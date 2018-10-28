
function kjl(p, q) {
    if (q === 0) {
        return p;
    }else {
        return kjl(q, p%q);
    }
}