package treespackage;

import javax.swing.tree.TreeNode;

public class flattentreetoLL114 {
    public static void main(String[] args) {

    }
    public void flatten(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode current=root;
        while(current!=null){
            if(current.left!=null){
                TreeNode temp=current.left;
                while(temp.right!=null){
                    temp=temp.right;
                }
                temp.right=current.right;
                current.right=current.left;
                current.left=null;}

                current=current.right;
            }
        }
    }
}
