//package treespackage;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.List;
//
//public class zigzagorder {
//    public static void main(String[] args) {
//
//    }
//
//
//    public List<List<Integer>> zigzagLevel(TreeNode root){
//        List<Deque<Integer>> result=new ArrayList<>();
//        if(root==null){
//            return null;
//        }
//        Deque<TreeNode> q=new LinkedList<>();
//        q.add(root);
//        boolean reverse=false;
//
//        while(!q.isEmpty()){
//             int levelsize=q.size();
//             List<Integer>a=new ArrayList<>();
//             for(int i=0;i<levelsize;i++){
//
//             if(!reverse){
//                 TreeNode currentNode=q.pollFirst();
//                 a.add(currentNode.val);
//                 if(currentNode.left!=null){
//                     q.offerLast(currentNode.left);
//                 }
//                 if(currentNode.right!=null){
//                     q.offerLast(currentNode.right);
//                 }
//             }
//             else{
//                 TreeNode currentNode=q.pollLast();
//                 a.add(currentNode.val);
//                 if(currentNode.right!=null){
//                     q.offerFirst(currentNode.right);
//                 }
//                 if(currentNode.left!=null){
//                     q.offerFirst(currentNode.left);
//                 }
//             }
//             }
//             reverse=!reverse;
//             result.add(q);
//
//
//             }
//             return result;
//        }
//
//
//
//
//
//
//}
