class Solution {
    public int maxProfit(int[] prices) {
     int n = prices.length;
     int buyprice = Integer.MAX_VALUE;
     int maxprofit = 0;
     for(int i = 0; i < n; i++) {
        if(prices[i] > buyprice) {
           int profit = prices[i]-buyprice;
           maxprofit = Math.max(profit , maxprofit);
        } else {
          buyprice = prices[i];
        }
      }
      return maxprofit;
    }
}