class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Set<Integer> set=new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        int longestStreak=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int currentNum=n;
                int currentStreak=1;
                while(set.contains(currentNum+1)){
                    currentStreak++;
                    currentNum++;
                }
                longestStreak=Math.max(currentStreak, longestStreak);
            }
        }
        return longestStreak;
    }
}
