class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1)  return 0; 
        int maxProfit=0;
        int min=prices[0];
        for(int i:prices){
            if(min>i)
               min=i;
            else{
                if(maxProfit < i-min)
                    maxProfit = i-min;
            }
        }
        return maxProfit;
    }
}
