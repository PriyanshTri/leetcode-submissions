class Solution {
    public boolean isPalindrome(String s) {
        // lets do it with two pointer-
        int startPointer = 0;
        int endPointer = s.length() - 1;
        while (startPointer < endPointer) {
            char startPointerChar = s.charAt(startPointer);
            char endPointerChar = s.charAt(endPointer);
            if(!checkIfAlphaNumeric(startPointerChar)){
                startPointer++;
            }
            else if(!checkIfAlphaNumeric(endPointerChar)) {
                endPointer--;
            } else if (checkIfAlphaNumeric(startPointerChar) && checkIfAlphaNumeric(endPointerChar)) {
                startPointerChar = Character.toLowerCase(startPointerChar);
                endPointerChar = Character.toLowerCase(endPointerChar);
                if (startPointerChar == endPointerChar) {
                    startPointer++;
                    endPointer--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkIfAlphaNumeric(char currentChar) {
        if ((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z')
                || currentChar >= '0' && currentChar <= '9') {
            return true;
        } else {
            return false;
        }
    }
}