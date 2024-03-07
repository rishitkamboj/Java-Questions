package treespackage;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


class lcaofBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        int c=root.val;
        if(c<p.val && c<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        if(c>p.val && c>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }

        return root;


    }
}