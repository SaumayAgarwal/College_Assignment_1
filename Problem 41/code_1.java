class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        helper(n, k, list, new ArrayList<>(), 0, 1);
        return list;
    }
    public void helper(int n, int k, List<List<Integer>> list, List<Integer> comb, int i, int l){
        if(i==k){
            list.add(new ArrayList<>(comb));
            return;
        }
        for(int j=l;j<=n;j++){
            comb.add(j);
            helper(n, k, list, comb, i+1, j+1);
            comb.remove(comb.size()-1);
        }
        return;
    }
}
