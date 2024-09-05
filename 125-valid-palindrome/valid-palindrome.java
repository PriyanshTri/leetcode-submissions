class Solution {
    public boolean isPalindrome(String s) {
        // lets do it with two pointer-
        ArrayList<Character> tempList = new ArrayList<>();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char tempChar = s.charAt(i);
            if (checkIfAlphaNumeric(tempChar)) {
                tempList.add(tempChar);
            }
        }
        int startPointer = 0;
        int endPointer = tempList.size() - 1;
        while (startPointer < endPointer) {
            char startPointerChar = tempList.get(startPointer);
            char endPointerChar = tempList.get(endPointer);

            if (startPointerChar == endPointerChar) {
                startPointer++;
                endPointer--;
            } else {
                return false;
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