class Solution {
    private static void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;

        while (i <= mid && j <= r)
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, l, temp.length);
    }
    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
}
