class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        if(nums[0]>=nums.length-1)return true;
        int fuel=nums[0];
        int i=0;
        while(fuel>0 && i+1<nums.length){
            fuel--;
            i++;
            if(nums[i]+i>=nums.length-1)return true;
            if(fuel<nums[i]){
                fuel=nums[i];
            }
        }
        return false;
    }
}
