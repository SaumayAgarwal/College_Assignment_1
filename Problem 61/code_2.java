class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[] prev=new int[amount+1];

        for(int i=0;i<amount+1;i++){
            if(i%coins[0]==0)prev[i]=1;
            else prev[i]=0;
        }
        for(int i=1;i<n;i++){
            int[] curr=new int[amount+1];
            for(int amt=0;amt<amount+1;amt++){
                int np=prev[amt];
                int p=0;
                if(amt>=coins[i])p=curr[amt-coins[i]];
                curr[amt]=np+p;
            }
            prev=curr;
        }
        return prev[amount];
    }
}
