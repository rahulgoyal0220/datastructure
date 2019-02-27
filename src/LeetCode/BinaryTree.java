package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

      /*  System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();*/

        Queue<Node> priorityQueue = new LinkedList<>();
        priorityQueue.add(tree.root);
        System.out.println("\nLevel order traversal ");
        tree.levelOrderTraversal(priorityQueue);
    }

    private void levelOrderTraversal(Queue<Node> q) {
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (n != null) {
                System.out.println(n.key + " ");
                q.add(n.left);
                q.add(n.right);
                levelOrderTraversal(q);
            }
        }
    }


    private void printPostorder(Node root) {
        if (root == null) {
            return;
        } else {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(root.key + " ");
        }

    }

    private void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.key + " ");
        printInorder(root.right);

    }

    private void printPreorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.key + " ");
        printPreorder(root.left);
        printPreorder(root.right);

    }


    private void printPostorder() {
        printPostorder(root);

    }

    private void printInorder() {
        printInorder(root);
    }

    private void printPreorder() {

        printPreorder(root);
    }


}


class Node {
    int key;
    Node left, right;

    Node(int key) {
        this.key = key;
    }
}
