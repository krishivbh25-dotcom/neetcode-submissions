class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i<= n ; i++){
            int currentH = (i == n)?0:heights[i];
            while(!s.isEmpty() && currentH < heights[s.peek()]){
                int height = heights[s.pop()];
                int width = s.isEmpty()?i:i - s.peek() -1;
                max = Math.max(max, height*width);
            }
         s.push(i);
        }
        return max;
    }
}
