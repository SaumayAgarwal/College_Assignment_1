class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length<nums2.length)return intersection(nums2, nums1);
        boolean[] check=new boolean[1001];
        for(int i:nums1){
            check[i]=true;
        }
        int[] ans=new int[nums2.length];
        int i=0;
        for(int j:nums2){
            if(check[j]){
                ans[i++]=j;
                check[j]=false;
            }
        }
        return Arrays.copyOf(ans, i);
    }
}
