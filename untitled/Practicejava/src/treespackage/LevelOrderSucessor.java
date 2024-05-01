//package treespackage;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class LevelOrderSucessor {
//    public static void main(String[] args) {
//
//    }
//
//
//    public TreeNode findSucessor(TreeNode root,int key){
//        if(root==null){
//            return null;
//        }
//
//        Queue<TreeNode> q=new LinkedList<>();
//        q.offer(node);
//        while(!q.isEmpty()){
//            int levelSize=q.size();
//                TreeNode currentNode=q.poll();
//                currentLevel.add(currentNode.val);
//                if(currentNode.left!=null){
//                    q.offer(currentNode.left);
//                }
//                if(currentNode.right!=null){
//                    q.offer(currentNode.right);
//                }
////                if(currentNode.val=key){
//                    break;
//                }
//
//
//    }
// return q.peek();
//}}
