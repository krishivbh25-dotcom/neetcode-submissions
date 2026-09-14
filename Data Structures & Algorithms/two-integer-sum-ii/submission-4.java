class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int k = 0 ;
        int z = 0;
        int index = 0;
        for(int i = 0; i < numbers.length -1  ; i++){
           k = numbers[i];
           int t = target - k;
            index = Arrays.binarySearch(numbers, t);
            if (index < 0) {
    continue;
} else if(index == i) {
    continue;
}else{
    z = i;
    break;
}}
        int[] s = new int[2];
        s[0] = z + 1;
        s[1] = index + 1;
        Arrays.sort(s);
        return s;
    }
}
