class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int k;
        int s1 = 0;
        int s2 = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                k = nums[i] + nums[j];
                if(k == target){
                    s1 = i;
                    s2 = j;
                }
            }
        }
        return new int[]{s1, s2};
    }
}
