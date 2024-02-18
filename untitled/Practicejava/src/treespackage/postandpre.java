package treespackage;

import java.util.HashMap;
import java.util.Map;

public class postandpre{

}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
    }



    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length !=
                postorder.length)
            return null;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }

        TreeNode root=buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mp);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend, Map<Integer,Integer> mp){
        if(poststart>postend || instart>inend){
            return null;
        }
        TreeNode root=new TreeNode(postorder[postend]);
        int inroot=mp.get(root.val);

        root.left=buildTree(inorder,instart,inroot-1,postorder,poststart,poststart+inroot-instart-1,mp);
        root.right=buildTree(inorder,inroot+1,inend,postorder,poststart+inroot-instart,postend-1,mp);
        return root;
    }

}