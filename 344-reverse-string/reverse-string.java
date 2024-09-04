class Solution {
    public void reverseString(char[] s) {
        int startPointer = 0;
        int endPointer = s.length-1;
        while(startPointer<endPointer) {
            char tempValue = s[startPointer];
            s[startPointer] = s[endPointer];
            s[endPointer] = tempValue;
            startPointer++;
            endPointer--;
        }
    }
}