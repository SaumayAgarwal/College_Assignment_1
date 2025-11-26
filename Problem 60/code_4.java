class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        dp[0][0]=grid[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0)continue;
                int l=Integer.MAX_VALUE, u=Integer.MAX_VALUE;
                if(i!=0)l=dp[i-1][j];
                if(j!=0)u=dp[i][j-1];
                dp[i][j]=Math.min(l, u)+grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
