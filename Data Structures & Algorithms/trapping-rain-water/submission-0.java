class Solution {
    public int trap(int[] height) {
       int n = height.length;
       if(n == 0){
        return 0;
       }
       int total = 0;
       int[] prefix = new int[n];
       prefix[0]=height[0];
       int[] suffix = new int[n];
       suffix[n-1] = height[n-1];
       for( int i = 1; i < n ; i++){
        prefix[i] = Math.max(prefix[i -1],height[i]);
       }
       for(int j = n -2 ; j> -1 ; j--){
        suffix[j] = Math.max(suffix[j+1],height[j]);
       }
       for(int z = 0 ; z < n ; z++){
           total = total + Math.min(prefix[z],suffix[z])-height[z];
       }
       return total;
    }
}
