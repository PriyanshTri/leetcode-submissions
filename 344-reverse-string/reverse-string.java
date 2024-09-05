class Solution {
    // lets try it with recursion
    public void reverseString(char[] s) {
        RecursiveReverseString(0, s.length-1, s);
    }
    public void RecursiveReverseString(int startPointer, int endPointer, char[] s) {
        if(startPointer>=endPointer) return;
        char temp = s[startPointer];
        s[startPointer] = s[endPointer];
        s[endPointer] = temp;
        RecursiveReverseString(startPointer+1, endPointer-1, s);
    }
}