class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] nums2 = new int[n];
        
        nums2[0] = 1;
        for (int i = 1; i < n; i++) {
            nums2[i] = nums2[i - 1] * nums[i - 1];
        }
        
        
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            nums2[i] = nums2[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        
        return nums2;
    }
}
