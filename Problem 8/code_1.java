class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] prefixR=new int[n];
        int[] prefixL=new int[n];
        prefixR[0]=nums[0];
        prefixL[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefixR[i]=nums[i]+prefixR[i-1];
        }
        for(int i=n-2;i>=0;i--){
            prefixL[i]=nums[i]+prefixL[i+1];
        }
        for(int i=0;i<n;i++){
            if(prefixR[i]==prefixL[i])return i;
        }
        return -1;
    }
}
