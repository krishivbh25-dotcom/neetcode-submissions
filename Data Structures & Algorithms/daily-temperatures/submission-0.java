class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] r = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = n -1; i > -1 ;i--){
          while (!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                r[i] = s.peek() - i;
            }
            s.push(i);
        }
        return r;
    }
}
