class Solution {
    public void dfs(int[][] grid, int i, boolean[] vis){
        vis[i]=true;
        for(int j=0;j<grid.length;j++){
            if(!vis[j] && i!=j && grid[i][j]==1){
               dfs(grid, j, vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] vis=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(isConnected, i, vis);
                ans++;
            }
        }
        return ans;
    }
}
