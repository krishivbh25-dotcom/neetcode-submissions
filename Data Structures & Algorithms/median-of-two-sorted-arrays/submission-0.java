class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    double median = 0;
   int[] result = IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).toArray();
    int totallength = nums1.length + nums2.length; 
    Arrays.sort(result);
    if(totallength % 2 == 0){
    median = (result[totallength/2 - 1] + result[totallength/2]) / 2.0;
    }else{
        median = result[totallength/2];
    }
    return median;
    }
}
