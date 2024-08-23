/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    const y= x.toString();
    return y == y.split("").reverse().join("");
};