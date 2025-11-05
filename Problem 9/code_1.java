class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int srow=0, scol=0, erow=matrix.length-1, ecol=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        while(srow<=erow && scol<=ecol){
            for(int j=scol; j<=ecol; j++){
                list.add(matrix[srow][j]);
            }
            for(int i=srow+1; i<=erow; i++){
                list.add(matrix[i][ecol]);
            }
            for(int i=ecol-1; i>=scol; i--){
                if(srow==erow)break;
                list.add(matrix[erow][i]);
            }
            for(int j=erow-1; j>=srow+1; j--){
                if(scol==ecol)break;
                list.add(matrix[j][scol]);
            }
            srow++; erow--; scol++; ecol--;
        }
        return list;
    }
}
