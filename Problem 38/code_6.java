class Solution {
    public int findDuplicate(int[] nums) {
        int[] check=new int[100001];
        for(int n:nums){
            check[n]++;
            if(check[n]>1)return n;
        }
        return -1;
    }
}
