class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        helper(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }
    public void helper(int[] candidates, int target, List<List<Integer>> result, List<Integer> comb, int j){
        if(target<0)return;
        if(target==0){
            result.add(new ArrayList(comb));
            return;
        }
        for(int i=j;i<candidates.length;i++){
            comb.add(candidates[i]);
            helper(candidates, target - candidates[i], result, comb, i);
            comb.remove(comb.size()-1);
        }
        return;
    }
}
