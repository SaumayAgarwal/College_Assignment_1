class Solution {
    public boolean possible(int k, int mid, int[] arr){
        k--;
        int prev=arr[0];
        for(int i=1;i<arr.length;i++){
            if(k>0 && arr[i]-prev>=mid){
                k--;
                prev=arr[i];
            }
            if(k==0)return true;
        }
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n=stalls.length;
        int right=stalls[n-1]-stalls[0];
        int left=1;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(possible(k, mid, stalls)){
                ans=mid;
                left=mid+1;
            }
            else right=mid-1;
        }
        return ans;
    }
}
