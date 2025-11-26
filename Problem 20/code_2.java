class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int left=0;
        int right=arr.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=target)left=mid;
            else right=mid-1;
        }
        return left;
    }
}
