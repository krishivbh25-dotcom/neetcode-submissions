class Solution {
    public int maxProfit(int[] prices) {
      int max = 0;
      int minbuy = prices[0];
       
      for(int sell: prices){
        max = Math.max(max, sell - minbuy);
        minbuy = Math.min(minbuy,sell);
      }
     return max;
       
    }
}
