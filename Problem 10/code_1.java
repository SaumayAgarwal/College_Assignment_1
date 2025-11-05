class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0;
        int n=mat.length;
        int m=mat[0].length;
        int k=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=mat[i][j];
            }
            if(max<sum){
                max=sum;
                k=i;
            }
        }
        return new int[]{k, max};
    }
}
