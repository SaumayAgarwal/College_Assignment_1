class Solution {
    public List<Integer> preorder(TreeNode root,List<Integer> list)
    {
        if(root==null)
        {
            return list;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        list=(preorder(root, list));
        return list;
    }
}
