/**
 * @param {number[]} nums
 * @return {number}
 */
var findGCD = function(nums) {
    let min = nums[0];
    let max = nums[0];
    let gcd = 1;
    for(let i = 1;i<nums.length; i++) {
        if (min > nums[i]) {
            min = nums[i];
        }
        else if(max<nums[i]) {
            max = nums[i];
        }
    }
    if(min === 1 || max === 1 || min===max)
        return min;
     while (min > 0 && max > 0) {
        if (min > max) {
            min = min % max;
        }
        
        else {
            max = max % min;
        }
    }
    
    if (min === 0) {
        return max;
    }
    return min;
};
