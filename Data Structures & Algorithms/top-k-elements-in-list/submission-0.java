class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] numbers = new int[k];

        int n = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int t = nums[i];
            if (!map.containsKey(t)) {
                map.put(t, 1);
            } else {
                map.put(t, map.get(t) + 1);
            }}
          Map<Integer, Integer> sortedMapDesc = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        int j = 0;
        for (Integer key : sortedMapDesc.keySet()) {
            if (j < k) {
                numbers[j] = key;
                j++;
            } else {
                break;
            }
        }

        return numbers;
    }
}
