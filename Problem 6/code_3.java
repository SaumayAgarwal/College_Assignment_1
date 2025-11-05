
class Solution {
    String removeDuplicates(String s) {
        int[] countU=new int[26];
        int[] countL=new int[26];
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){
               if(countL[ch-'a']==0){
                   sb.append(ch);
                   countL[ch-'a']++;
                }
            }
            else {
                if(countU[ch-'A']==0){
                   sb.append(ch);
                   countU[ch-'A']++;
                }
            }
        }
        return sb.toString();
    }
}
