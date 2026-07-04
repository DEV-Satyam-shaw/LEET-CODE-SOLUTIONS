class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE; 
        int maxprice = 0;
        int profit;

        for(int i = 0; i<= prices.length-1; i++)
        {
            if(prices[i] < minprice)
            {
                minprice = prices[i];
            } else 
            {
                profit = prices[i] - minprice;
                if(profit > maxprice)
                {
                    maxprice = profit;
                }
            }
        }
        return maxprice;
    }
}