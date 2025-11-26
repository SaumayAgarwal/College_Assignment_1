class Solution {
    public int missingNumber(int[] nums) {
        int[] missing=new int[nums.length+1];
        for(int num:nums)
        {
            missing[num]++;
        }
        for(int i=0;i<missing.length;i++)
        {
            if(missing[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
}
