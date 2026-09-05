class Solution {
    public boolean hasDuplicate(int[] nums) {
        for( int i = 0 ; i < nums.length ; i++){
            int z= nums[i];
            for(int j = i +1; j < nums.length; j++){
                int k = nums[j];
                if(z == k){
                  return true;
                }
               
            }
        }
        return false;
    }
}