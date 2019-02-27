package LeetCode;

import java.util.Queue;

public class MergeBinaryTree {

    private static boolean output = true;
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(2);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(2);

        t1.left.left = new TreeNode(5);


        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);

        t2.right.left = new TreeNode(7);
        t2.left.right = new TreeNode(4);


        System.out.println(isUnivalTree(t1));
    }


    public static boolean isUnivalTree(TreeNode root) {
        if (root != null) {
            return checkVal(root, root.val);
        }
        return true;
    }

    public static boolean checkVal(TreeNode node, int val){
        if(node == null){
            return true;
        }
        if(node.val != val){
            return false;
        }

        return checkVal(node.left, val) && checkVal(node.right, val);
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) return null;
        if (t1 != null && t2 != null) {
            TreeNode node = new TreeNode(t1.val + t2.val);
            node.left = mergeTrees(t1.left, t2.left);
            node.right = mergeTrees(t1.right, t2.right);
            return node;
        }
        if (t1 != null) {
            return t1;
        } else {
            return t2;
        }
    }

    private static void levelOrderTraversal(Queue<TreeNode> q) {
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n != null) {
                System.out.println(n.val + " ");
                q.add(n.left);
                q.add(n.right);
                levelOrderTraversal(q);
            }
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
