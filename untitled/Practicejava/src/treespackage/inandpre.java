package treespackage;

import java.util.HashMap;
import java.util.Map;

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
 }


class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }

        TreeNode root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mp);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend, Map<Integer,Integer> mp){
        if(prestart>preend || instart>inend){
            return null;
        }
        TreeNode root=new TreeNode(preorder[prestart]);
        int inroot=mp.get(root.val);
        int left=inroot-instart;
        root.left=buildTree(preorder,prestart+1,prestart+left,inorder,instart,inroot-1,mp);
        root.right=buildTree(preorder,prestart+left+1,preend,inorder,inroot+1,inend,mp);
        return root;
    }

}