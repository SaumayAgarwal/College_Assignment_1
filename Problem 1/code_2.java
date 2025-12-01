class Solution {
    public int minimumDeletions(int[] nums) {
        int max=-1, min=-1;
        int maxNum=Integer.MIN_VALUE;
        int minNum=Integer.MAX_VALUE;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(maxNum<nums[i]){
                maxNum=nums[i];
                max=i;
            }
            if(minNum>nums[i]){
                minNum=nums[i];
                min=i;
            }
        }
        int maxBack=n-max;
        int maxFront=max+1;
        int minBack=n-min;
        int minFront=min+1;
        int ans=0;
        if(min<=max){
            ans=Math.min(maxBack+minFront, Math.min(maxFront, minBack));
        }
        else
        ans=Math.min(maxFront+minBack, Math.min(maxBack, minFront));
        return ans;
    }
}
