
 class Node {
 public int data;
 public Node left;
 public Node right;

 Node()
 {
 this.data = 0;
 this.left = null;
 this.right = null;
 }

 Node(int data)
 {
 this.data = data;
 this.left = null;
 this.right = null;
 }

 Node(int data, Node left, Node right)
 {
 this.data = data;
 this.left = left;
 this.right = right;
 }
 }

 class Solution {
    public static boolean isParentSum(Node root) {
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){
            sum+=root.left.data;
        }
        if(root.right!=null){
            sum+=root.right.data;
        }

        if(root.data!=sum){
            return false;
        }

        boolean left=isParentSum(root.left);
        boolean right=isParentSum(root.right);
        return left&&right;

    }
}