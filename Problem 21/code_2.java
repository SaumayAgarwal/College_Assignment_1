class Solution {
    public boolean search(int[] nums, int target) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        int start=0, end=j-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)return true;
            if(nums[start]<=nums[mid]){
                if(target>=nums[start]&&target<nums[mid])end=mid-1;
                else start=mid+1;
            }
            else {
                if(target<=nums[end]&&target>nums[mid])start=mid+1;
                else end=mid-1;
            }
        }
        return false;
    }
}
