//package treespackage;
//
//class TreeNode {
//      int val;
//      TreeNode2 left;
//      TreeNode2 right;
//      TreeNode(int x) { val = x; }
//  }
//
//
//class lcaofBST {
//    public TreeNode2 lowestCommonAncestor(TreeNode2 root, TreeNode2 p, TreeNode2 q) {
//        if(root==null){
//            return null;
//        }
//        int c=root.val;
//        if(c<p.val && c<q.val){
//            return lowestCommonAncestor(root.right,p,q);
//        }
//        if(c>p.val && c>q.val){
//            return lowestCommonAncestor(root.left,p,q);
//        }
//
//        return root;
//
//
//    }
//}