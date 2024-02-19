package treespackage;



import Arrays.Arrayslist;

import java.util.ArrayList;

public class morrisinorder {


    ArrayList<Integer> getIn(TreeNode root){
        ArrayList<Integer> inorder=new ArrayList<>();
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left==null){
                inorder.add(cur.val);
                cur=cur.right;
            }
            else{
                TreeNode prev=cur.left;
                while((prev.right!=null)&& prev.right!=cur){
                    prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=cur;
                    cur=cur.left;
                }
                else{
                    prev.right=null;
                    inorder.add(cur.val);
                    cur=cur.right;
                }
            }
        }
      return inorder;
    }
    ArrayList < Integer > preorderTraversal(TreeNode root) {
        ArrayList < Integer > preorder = new ArrayList < > ();
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left == null) {
                preorder.add(cur.val);
                cur = cur.right;
            } else {
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = cur;
                    preorder.add(cur.val);
                    cur = cur.left;
                } else {
                    prev.right = null;
                    cur = cur.right;
                }
            }
        }
        return preorder;
    }
}
