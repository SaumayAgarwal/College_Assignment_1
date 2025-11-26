class Solution {
    public int longestPalindromeSubseq(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        int[] prev=new int[s.length()+1];
        int[] curr=new int[s.length()+1];
        for(int i=1;i<s.length()+1;i++){
            for(int j=1;j<s.length()+1;j++){
                char ch1=s.charAt(i-1);
                char ch2=reversed.charAt(j-1);
                if(ch1==ch2){
                    curr[j]=prev[j-1]+1;
                }
                else {
                    curr[j]=Math.max(prev[j], curr[j-1]);
                }
            }
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prev[s.length()];
    }
}
