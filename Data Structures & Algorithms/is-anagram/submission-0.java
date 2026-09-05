class Solution {
    public boolean isAnagram(String s, String t) {
       int n = s.length();
       int m = t.length();
       if(n != m){
        return false;
       }
       char[] sArray = s.toCharArray();
       char[] tArray = t.toCharArray();

       Arrays.sort(sArray);
       Arrays.sort(tArray);

       if(Arrays.equals(sArray,tArray) == true){
        return true;
       }
       return false;
    }
}