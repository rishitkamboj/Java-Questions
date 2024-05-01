//package treespackage;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class rightView {
//    public static void main(String[] args) {
//
//    }
//    public List<Integer> rightSideView(TreeNode root){
//        List<Integer> ans=new ArrayList<>();
//        if(root==null){
//            return ans;
//        }
//        Queue<TreeNode> q=new LinkedList<>();
//        q.offer(root);
//        while(!q.isEmpty()){
//            int levelSize=q.size();
//            for(int i=0;i<levelSize;i++){
//                TreeNode currentNode=q.poll();
//               if(i==levelsize-1){
//                   ans.add(currentNode.val);
//               }
//                if(currentNode.left!=null){
//                    q.offer(currentNode.left);
//                }
//                if(currentNode.right!=null){
//                    q.offer(currentNode.right);
//                }
//            }
//
//        }
//        return ans;
//    }
//}
