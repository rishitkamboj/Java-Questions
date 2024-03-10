import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        BSTIterator l = new BSTIterator(root, false);
        BSTIterator r = new BSTIterator(root, true);
        int i = l.next();
        int j = r.next();

        while (i < j) {
            if (i + j == k) {
                return true;
            } else if (i + j < k) {
                i = l.next();
            } else {
                j = r.next();
            }
        }
        return false;
    }
}

class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();
    boolean reverse = false;

    public BSTIterator(TreeNode root, boolean isRev) {
        reverse = isRev;
        pushAll(root);
    }

    public int next() {
        TreeNode t = stack.pop();
        if (reverse) {
            pushAll(t.left);
        } else {
            pushAll(t.right);
        }
        return t.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushAll(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = reverse ? root.right : root.left;
        }
    }
}