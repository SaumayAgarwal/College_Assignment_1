class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        int subsets=1<<n;
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<subsets;i++){
            List<Integer> list=new ArrayList<>();
            int a=i;
            for(int j=0;j<n;j++){
                if((a&1)==1)list.add(nums[j]);
                a=a>>1;
            }
            set.add(list);
        }
        ans.addAll(set);
        return ans;
    }
}
