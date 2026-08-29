package Trees;

import java.util.*;

public class InvertBinaryTree {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node invert(Node root) {
        if (root == null) return null;

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

        return root;
    }

    public static Node createTree(Scanner sc, int height) {

        System.out.print("Enter root value: ");
        int value = sc.nextInt();

        if (value == -1) return null;

        Node root = new Node(value);

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        for (int level = 1; level <= height; level++) {

            int nodesAtLevel = q.size();

            for (int i = 0; i < nodesAtLevel; i++) {

                Node current = q.poll();

                System.out.print("Enter left child of " + current.val + ": ");
                int left = sc.nextInt();

                if (left != -1) {
                    current.left = new Node(left);
                    q.add(current.left);
                }

                System.out.print("Enter right child of " + current.val + ": ");
                int right = sc.nextInt();

                if (right != -1) {
                    current.right = new Node(right);
                    q.add(current.right);
                }
            }
        }

        return root;
    }

    public static void printTree(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node current = q.poll();

            System.out.print(current.val + " ");

            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tree height: ");
        int height = sc.nextInt();

        Node root = createTree(sc, height);

        System.out.println("Original tree:");
        printTree(root);

        root = invert(root);

        System.out.println("\nInverted tree:");
        printTree(root);
    }
}