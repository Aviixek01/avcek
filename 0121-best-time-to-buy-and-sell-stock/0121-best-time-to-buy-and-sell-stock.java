class Solution {
    public int maxProfit(int[] prices) {
     int n = prices.length;
     int buyprice = prices[0];
     int maxprofit = 0;
     for(int i = 1; i < n; i++) {
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