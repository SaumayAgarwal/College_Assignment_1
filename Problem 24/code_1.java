class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int cl=maxDepth(root.left);
        int cr=maxDepth(root.right);
        return (Math.max(cl, cr)+1);
    }
}
