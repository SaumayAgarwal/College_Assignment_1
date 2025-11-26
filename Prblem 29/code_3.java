class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
           return false;
        int[] n=new int[26];
        for(char ch:s.toCharArray()){
            n[ch-'a']++;
        }
        for(char ch: t.toCharArray()){
            if(n[ch-'a']==0)
               return false;
            n[ch-'a']--;
        }
        return true;
    }
}
