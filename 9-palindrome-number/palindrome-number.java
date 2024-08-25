class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        if (x >= 0 && x < 10)
            return true;
        
        int countOfDigits = 0;
        int copyNum = x;
        while (copyNum != 0) {
            countOfDigits++;
            copyNum /= 10;
        }
        
        copyNum = x;
        int divisor = (int) Math.pow(10, countOfDigits - 1);
        
        while (copyNum != 0) {
            int lastDigit = copyNum % 10;
            int firstDigit = copyNum / divisor;
            
            if (firstDigit != lastDigit)
                return false;
            
            copyNum = (copyNum % divisor) / 10;
            divisor /= 100;
        }
        
        return true;
    }
}