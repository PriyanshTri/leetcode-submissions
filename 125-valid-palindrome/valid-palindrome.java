class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> tempList = new ArrayList<>();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++) {
            char tempChar=s.charAt(i);
            if((tempChar>='a' && tempChar<='z') ||(tempChar>='0' && tempChar<='9')) {
                tempList.add(tempChar);
            }
        }
        System.out.println(tempList);
        return recursiveCheckPalindrome(0, tempList.size()-1, tempList);
    }
    public boolean recursiveCheckPalindrome(int startIndex, int endIndex, ArrayList<Character> lst) {
        if(startIndex>=endIndex) return true;
        if(lst.get(startIndex) == lst.get(endIndex)) {
            System.out.printf("%c %c\n", lst.get(startIndex), lst.get(endIndex));
            return recursiveCheckPalindrome(startIndex+1, endIndex-1, lst);
        }
        return false;
    }
}