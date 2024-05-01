//package treespackage;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class levelorder {
//    public static void main(String[] args) {
//
//    }
//
//    public List<List<Integer>> levelorder(TreeNode node){
//        List<List<Integer>> ans=new ArrayList<>();
//        if(node==null){
//            return ans;
//        }
//        Queue<TreeNode> q=new LinkedList<>();
//        q.offer(node);
//        while(!q.isEmpty()){
//            int levelSize=q.size();
//           List<Integer> currentLevel=new ArrayList<>(levelSize);
//            for(int i=0;i<levelSize;i++){
//                TreeNode currentNode=q.poll();
//                currentLevel.add(currentNode.val);
//                if(currentNode.left!=null){
//                    q.offer(currentNode.left);
//                }
//                if(currentNode.right!=null){
//                    q.offer(currentNode.right);
//                }
//            }
//            ans.add(currentLevel);
//        }
//  return ans;
//    }
//
//}
