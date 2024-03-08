package treespackage;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class bstfrominorder1008 {
public TreeNode bstFromPre(int [] A){
    return bst(A,Integer.MAX_VALUE,new int[]{0});
}
public TreeNode bst(int[] A,int b,int i[]){
    if(i[0]==A.length || A[i[0]]>b){
        return null;
    }
    TreeNode root=new TreeNode(A[i[0]++]);
    root.left=bst(A,root.val,i);
    root.right=bst(A,b,i);
    return root;
}
}
