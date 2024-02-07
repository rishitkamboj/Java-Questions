package treespackage;

import javax.swing.tree.TreeNode;

public class maxpathsum {
    public static void main(String[] args) {

    }
    int max=0;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        down(root);
        return max;
    }
    public int down(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(0,down(root.left));
        int right=Math.max(0,down(root.right));
        max=Math.max(max,left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}
