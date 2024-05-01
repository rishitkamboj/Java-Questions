//package treespackage;
//
//import javax.swing.tree.TreeNode;
//
//public class cousins {
//    public static void main(String[] args) {
//
//    }
//    public boolean isCousions(TreeNode root, int x, int y){
////        TreeNode xx=findNode(root,x);
//        TreeNode yy=findNode(root,y);
//
//
//        return ((level(root,xx,0)==level(root,yy,0)) && !(isSiblings(root,xx,yy)));
//    }
//
//    public int level(TreeNode root,TreeNode level,int initial){
//         if(root==null){
//             return 0;
//         }
//         if(root==level){
//             return initial;
//         }
//         int l=level(root.left,level,initial++);
//         if(l!=0){
//             return l;
//         }
//         return level(root.right,level,level++);
//    }
//
//    public TreeNode findNode(TreeNode root,int x){
//        if(root == null){
//            return null;
//        }
//        if(root.value == x){
//            return root;
//        }
//       TreeNode n=findNode(root.left,x);
//        if(n==null){
//            return n;
//        }
//        return findNode(root.right,x);
//    }
//    public boolean isSiblings(TreeNode root,TreeNode x,TreeNode y){
//        if(root==null){
//            return false;
//        }
//        return ((root.left==x && root.right==y)|| isSiblings(root.left,x,y) || isSiblings(root.right,x,y));
//    }
//
//}
