class Solution {
    public int coinChange(int[] coins, int amount) {
        int[]prev=new int[amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0)prev[i]=i/coins[0];
            else prev[i]=100000;
        }
        for(int i=1;i<coins.length;i++){
            int[] curr=new int[amount+1];
            for(int amt=0;amt<=amount;amt++){
                int noTake = prev[amt];
                int take=100000;
                if(coins[i]<=amt){
                    take=1+curr[amt-coins[i]];
                }
                curr[amt]=Math.min(take, noTake);    
            }
            prev=curr;
        }
        return prev[amount]>=100000?-1:prev[amount];
    }
}
