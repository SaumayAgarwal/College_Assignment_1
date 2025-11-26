class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null)
        {
            return 0;
        }
        if(root.left!=null && root.left.left==null && root.left.right==null)
        {
            sum=root.left.val;
        }
        int left=sumOfLeftLeaves(root.left);
        int right=sumOfLeftLeaves(root.right);
        return left+right+sum;       
    }
}
