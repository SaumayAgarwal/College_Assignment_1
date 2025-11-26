class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        helper(list, nums, 0, new ArrayList<>());
        return list;
    }
    public void helper(List<List<Integer>> list, int[] nums, int i, List<Integer> permu){
        if(i==nums.length){
            list.add(new ArrayList<>(permu));
            return;
        }
        for(int j=0;j<nums.length;j++){
            if(!permu.contains(nums[j])){
                permu.add(nums[j]);
                helper(list, nums, i+1, permu);
                permu.remove(permu.size()-1);
            }
        }
        return;
    }
}
