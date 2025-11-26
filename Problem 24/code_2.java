class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
        if((p==null && q!=null) || (p!=null && q==null))return false;
        boolean leftNode=isSameTree(p.left, q.left);
        boolean rightNode=isSameTree(p.right, q.right);
        if(leftNode && rightNode){
            if(p.val==q.val)return true;
            else return false;
        }
        return false;
    }
}
