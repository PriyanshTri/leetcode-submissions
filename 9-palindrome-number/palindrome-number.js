/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    const isXPositive = x>=0;
    if (!isXPositive) {
        return false;
    }
    let reverseOfNum =0;
    let absOfx = Math.abs(x);
    
    while(absOfx>0){
        reverseOfNum*=10;
        reverseOfNum+=(absOfx%10);
        absOfx = Math.floor(absOfx/10);
    }
    return reverseOfNum == x;
};