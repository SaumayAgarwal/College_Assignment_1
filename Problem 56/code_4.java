class Solution {
    Boolean[] memo;
    public boolean segmentation(String s, int i, List<String> dict){
        if(i==s.length())return true;
        if(memo[i]!=null)return memo[i];
        for(int j=i+1;j<=s.length();j++){
            String word=s.substring(i, j);
            if(dict.contains(word) && segmentation(s, j, dict)){
                return memo[i] = true;
            }
        }
        return memo[i] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        memo=new Boolean[s.length()];
       return segmentation(s, 0, wordDict);
    }
}
