package treespackage;

public class invertBINARY {
    public static void main(String[] args) {

    }
    public count invertTree(count root){
        if (root == null){
            return null;
        }
        count left=invertTree(root.left);
        count right=invertTree(root.right);

        root.left=right;
        root.right=left;

        return root;
    }
}
