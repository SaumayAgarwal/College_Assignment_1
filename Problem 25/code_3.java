class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        List<TreeNode> list=new ArrayList<>();
        list.add(root);
        while(list.size()>0){
            int size=list.size();
            int i=0;
            ans.add(list.get(size-1).val);
            while(i!=size){
                TreeNode temp=list.remove(0);
                if(temp.left!=null)list.add(temp.left);
                if(temp.right!=null)list.add(temp.right);
                i++;
            }
        }
        return ans;
    }
}
