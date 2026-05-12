/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let reverseOfNum =0;
    let absOfx = Math.abs(x);
    const isXPositive = x>=0;
    while(absOfx>0){
        reverseOfNum*=10;
        reverseOfNum+=(absOfx%10);
        absOfx = Math.floor(absOfx/10);
    }
    if((reverseOfNum < -Math.pow(2,31)) || reverseOfNum > (Math.pow(2,31)-1))
        return 0;
    return isXPositive ? reverseOfNum : -reverseOfNum;
};