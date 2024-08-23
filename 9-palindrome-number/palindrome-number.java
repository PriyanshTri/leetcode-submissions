class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int newNum = 0;
        int copyNum = x;
        while(copyNum!=0) {
            newNum*=10;
            newNum+=copyNum%10;
            copyNum/=10;
        }
        return newNum == x;
    }
}