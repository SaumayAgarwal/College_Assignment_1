class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1 || obstacleGrid[0][0]==1)return 0;
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int l=0, u=0;
                if((i==0 && j==0) || obstacleGrid[i][j]==1)continue;
                if(i!=0)l=dp[i-1][j];
                if(j!=0)u=dp[i][j-1];
                dp[i][j]=l+u;
            }
        }
        return dp[m-1][n-1];
    }
}
