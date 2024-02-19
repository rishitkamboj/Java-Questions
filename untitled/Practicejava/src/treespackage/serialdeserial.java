import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int x) {
          val = x;
      }
  }

 class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder s=new  StringBuilder();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node==null){
                s.append("n ");
                continue;
            }
            s.append(node.val+" ");
            q.add(node.left);
            q.add(node.right);
        }
        return s.toString().trim();
    }

    // Decodes your encoded data to tree.
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("")) return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] val = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(val[0]));
        q.offer(root);
        int l=val.length;
        for (int i = 1; i < l; i++) {
            TreeNode par = q.poll();
            if (!val[i].equals("n")) {
                TreeNode left = new TreeNode(Integer.parseInt(val[i]));
                par.left = left;
                q.add(left);
            }
            if (!val[++i].equals("n")) {
                TreeNode right = new TreeNode(Integer.parseInt(val[i]));
                par.right = right;
                q.add(right);
            }
        }
        return root;
    }

}