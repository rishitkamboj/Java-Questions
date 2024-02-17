package treespackage;

public class diameter {
    public static void main(String[] args) {

    }
    int diameter=0;
    public int diameterOfBinaryTree(count root) {
        height(root);
        return diameter-1;
    }
    public int height(count root){
        if(root==null){
            return 0;
        }

        int left=height(root.left);
        int right=height(root.right);
        int d=left+right+1;
        diameter=Math.max(d,diameter);

        return Math.max(left,right)+1;
    }
}
