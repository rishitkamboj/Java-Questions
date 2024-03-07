package treespackage;
class Node{
    int data;
    Node left,right;
    Node(int val)
    {
        data=val;
        left=null;
        right=null;
    }

static Node kthlargest(Node root,int k[])
{
    if(root==null)
        return null;

    Node right=kthlargest(root.right,k);
    if(right!=null)
        return right;
    k[0]--;

    if(k[0]==0)
        return root;

    return kthlargest(root.left,k);
}

static Node kthsmallest(Node root,int k[])
{
    if(root==null)
        return null;

    Node left=kthsmallest(root.left,k);
    if(left!=null)
        return left;
    k[0]--;
    if(k[0]==0)
        return root;

    return kthsmallest(root.right,k);
}}
public class kthsmallestorlargest {
    public static void main(String[] args) {

    }
}
