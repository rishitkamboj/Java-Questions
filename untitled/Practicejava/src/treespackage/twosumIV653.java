//package treespackage;
//
//
//import java.util.ArrayList;
//
//public class TreeNode {
//      int val;
//      TreeNode2 left;
//      TreeNode2 right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode2 left, TreeNode2 right) {
//         this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
//
//class Solution {
//    ArrayList<Integer> ans=new ArrayList<>();
//    public void inorder(TreeNode2 root){
//        if(root==null){return;
//        }
//        inorder(root.left);
//        ans.add(root.val);
//        inorder(root.right);
//    }
//
//    public boolean findTarget(TreeNode2 root, int k) {
//        inorder(root);
//        int i=0;
//        int j=ans.size()-1;
//
//        while(i<j){
//            int sum=ans.get(i)+ans.get(j);
//            if(sum==k){return true;}
//            else if(sum<k){
//                i++;
//            }
//            else{
//                j--;
//            }
//        }
//        return false;
//
//    }
//}