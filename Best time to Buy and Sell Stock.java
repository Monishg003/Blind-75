class Solution {
    public int max(int maxprofit,int cost){
        if(cost>maxprofit){
            return cost;
        }
        return maxprofit;
    }
    public int min(int mini,int prices){
            if(prices<mini){
                return prices;
            }
            return mini;
          
    }
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
          int cost=prices[i]-mini;
          maxprofit = max(maxprofit,cost);
          mini = min(mini,prices[i]);

            }
        return maxprofit;
    }
}
