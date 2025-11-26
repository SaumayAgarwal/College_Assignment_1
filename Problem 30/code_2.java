class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0, right=0;
        int maxLength=0;
        while(right<s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            right++;

            maxLength = Math.max(maxLength, right-left);
        }
        return maxLength;
    }
}
