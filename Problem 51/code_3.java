class Solution {
    public void check(char[][] grid, int i,int j){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0)return;
        if(grid[i][j]!='1')return;
        grid[i][j]='*';
        check(grid, i+1, j);
        check(grid, i, j+1);
        check(grid, i-1, j);
        check(grid, i, j-1);
        return;
    }

    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cost=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    check(grid, i, j);
                    cost++;
                }
            }
        }
        return cost;
    }
}
