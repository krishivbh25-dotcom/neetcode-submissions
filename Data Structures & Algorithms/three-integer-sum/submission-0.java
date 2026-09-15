class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int k = 0;
        int t = 0;
        int z = 0;
        Arrays.sort(nums);
        Set<List<Integer>> three = new HashSet<>();
        for(int i = 0 ; i < nums.length -1 ; i++ ){
            for(int j = i + 1 ; j < nums.length ; j++ ){
                k = nums[i];
                t = nums[j];
                z = -(k + t);
                int index = Arrays.binarySearch(nums, z);
                if(index < 0 || index== i || index == j){
                    continue;
                }else{
                 List<Integer> sum = new ArrayList<>();
                 sum.add(k);
                 sum.add(t);
                 sum.add(z);
                 Collections.sort(sum);
                 three.add(sum);
                }
            }
        }
        return new ArrayList<>(three);

    }
}
