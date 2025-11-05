class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0;
        int[] count=new int[101];
        for(int i:nums){
            count[i]++;
            max=Math.max(max, count[i]);
        }
        int ans=0;
        for(int i=0;i<101;i++){
            if(max==count[i])ans+=max;
        }
        return ans;
    }
}
