class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int left = 0;
        int[] occurence = new int[26];
        int ans = 0;
        for(int right= 0;right < s.length(); right++){
            int index = s.charAt(right) - 'A';
            occurence[index]++;
            max = Math.max(max,occurence[index]);
            if(right - left + 1 - max > k){
                occurence[s.charAt(left)- 'A']--;
                left++;
            }
            ans = Math.max(ans , right - left + 1);
            
        }
        return ans;
    }
}
