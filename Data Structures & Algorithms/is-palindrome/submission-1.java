class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);
            if (Character.isLetterOrDigit(lChar) &&           
                Character.isLetterOrDigit(rChar)) {
                if (Character.toLowerCase(lChar) != 
                    Character.toLowerCase(rChar)) {
                    return false;
                }

                left++;
                right--;
            } else if (!Character.isLetterOrDigit(lChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rChar)) {
                right--;
            }
        }

        return true;
    }
}

