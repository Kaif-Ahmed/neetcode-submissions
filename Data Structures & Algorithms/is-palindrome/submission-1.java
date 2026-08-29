class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder("");
        int left = 0;
        boolean isPalin = true;
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                s1.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int right = s1.length()-1;
        while (left < right){
            if (s1.charAt(left) != s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}