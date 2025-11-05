class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverseSection(nums, 0, n-1);
        reverseSection(nums, 0, k-1);
        reverseSection(nums, k, n-1);
    }
    public void reverseSection(int[] n,int start,int end){
        while(start<end){
            int temp=n[end];
            n[end]=n[start];
            n[start]=temp;
            start++;
            end--;
        }
    }
}
