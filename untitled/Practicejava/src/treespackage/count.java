package treespackage;

 class count {
      int val;
      count left;
      count right;
      count() {}
      count(int val) { this.val = val; }
      count(int val, count left, count right) {
 this.val = val;
 this.left = left;
 this.right = right;
     }
class Solution {

    public int leftheight(count root) {
        int h = 0;
        while (root != null) {
            root = root.left;
            h++;
        }
        return h;
    }

    public int rightheight(count root) {
        int h = 0;
        while (root != null) {
            root = root.right;
            h++;
        }
        return h;
    }

    public int countNodes(count root) {
        if (root == null) {
            return 0;
        }

        int left = leftheight(root);
        int right = rightheight(root);

        if (left == right) {
            return (1 << left) - 1;
        }


        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}}