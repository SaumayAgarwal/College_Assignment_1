class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()+1][text2.length()+1];
        int i1=text1.length();
        int i2=text2.length();
        for(int i=1;i<=i1;i++){
            for(int j=1;j<=i2;j++){
                char ch1=text1.charAt(i-1);
                char ch2=text2.charAt(j-1);
                if(ch1==ch2){
                    dp[i][j]= 1+dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i][j-1], 
                                            dp[i-1][j]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
