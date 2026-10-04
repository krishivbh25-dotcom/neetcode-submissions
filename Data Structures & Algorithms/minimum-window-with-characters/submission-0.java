class Solution {
    public String minWindow(String s, String t) {
    StringBuilder sb = new StringBuilder();
        if (s.length() < t.length()) return sb.toString();

        int[] count = new int[128];
        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int need = t.length();
        int left = 0;
        int bestLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            if (count[s.charAt(right)]-- > 0) {
                need--;
            }

            while (need == 0) {
                if (right - left + 1 < bestLen) {
                    bestLen = right - left + 1;
                    sb.setLength(0);                    
                    sb.append(s, left, right + 1);      
                }
                if (++count[s.charAt(left)] > 0) {
                    need++;
                }
                left++;
            }
        }

      return sb.toString();   
    }
}
