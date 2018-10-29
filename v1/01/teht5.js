
function reverse(list) {
    if (!list.length) {
        return list;
    }else {
        return reverse(list.slice(1)).concat(list[0]);
    }
}

console.log(reverse([1,2,3,4,5]));
console.log(reverse([5,6,7,8,9]));