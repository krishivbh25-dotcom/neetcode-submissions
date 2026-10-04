class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s= s1.toCharArray();
        char[] t = s2.toCharArray();
        if(s1.length() > s2.length()){
            return false;
        }
        int[] alpha = new int[26];
        
         for (char c : s1.toCharArray()) {
            alpha[c - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            alpha[s2.charAt(right) - 'a']--;

            // too many of this letter -> shrink from the left
            while (alpha[s2.charAt(right) - 'a'] < 0) {
                alpha[s2.charAt(left) - 'a']++;
                left++;
            }

            if (right - left + 1 == s1.length()) {
                return true;
            }
        }
        return false;
    }
}
