class Complete {

    // Function for finding maximum and value pair
    public static int[] Smallestonleft(int arr[], int n) {
        // Complete the function
        TreeSet<Integer> set=new TreeSet<>();
        int[] ans=new int[n];
        ans[0]=-1;
        set.add(arr[0]);
        for(int i=1;i<n;i++){
            Integer num=set.lower(arr[i]);
            set.add(arr[i]);
            ans[i]=num==null?-1:num;
        }
        return ans;
    }
}
