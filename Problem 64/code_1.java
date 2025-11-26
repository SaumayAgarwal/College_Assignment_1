class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length(), m=p.length();
        boolean[] prev=new boolean[m+1];
        prev[0]=true;
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*')
                prev[j] = prev[j - 1];
            else
                prev[j] = false;
        }
        for(int i=1;i<=n;i++){
            boolean[] curr=new boolean[m+1];
            curr[0] = false;
            for(int j=1;j<=m;j++){
                char ch1=s.charAt(i-1);
                char ch2=p.charAt(j-1);
                if(ch1==ch2 || ch2=='?')curr[j] = prev[j-1];
                else if(ch2=='*'){
                    curr[j] = prev[j]||curr[j-1];
                }
                else curr[j] = false;
            }
            prev=curr;
        }
        return prev[m];
    }
}
