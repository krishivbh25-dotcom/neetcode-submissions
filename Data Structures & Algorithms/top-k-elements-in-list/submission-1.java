class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }
        
        int[] numbers = new int[k];
        for(int i = 0; i < k ; i++){
            int maxKey = Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
            numbers[i]= maxKey;
            map.remove(maxKey);
            
        }
        return numbers;
    }
}

