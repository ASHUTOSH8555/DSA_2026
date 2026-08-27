package Trees;

import java.util.Scanner;

public class LowestCommonAncestor {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static boolean Contains(Node root, Node pq) {
        if(root == null) return false;
        if(root == pq) return true;

        return Contains(root.left, pq) || Contains(root.right, pq);
    }

    public static Node Find(Node root, int value) {
        if(root == null) return null;
        if(root.val == value) return root;

        Node left = Find(root.left, value);

        if(left != null) return left;

        return Find(root.right, value);
    }

    public static Node LCA(Node root, Node p, Node q) {
        if(root == null) return null;
        if(root == p || root == q) return root;

        boolean leftP = Contains(root.left, p);
        boolean rightP = Contains(root.right, p);
        boolean leftQ = Contains(root.left, q);
        boolean rightQ = Contains(root.right, q);

        if((leftP && rightQ) || (leftQ && rightP))
            return root;

        if(leftP && leftQ)
            return LCA(root.left, p, q);

        if(rightP && rightQ)
            return LCA(root.right, p, q);

        return null;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);

        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);

        a.left = c;
        a.right = d;

        Node e = new Node(6);
        Node f = new Node(7);

        b.left = e;
        b.right = f;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter p: ");
        int pValue = sc.nextInt();

        System.out.print("Enter q: ");
        int qValue = sc.nextInt();

        Node p = Find(root, pValue);
        Node q = Find(root, qValue);

        if(p == null || q == null) {
            System.out.println("One or both nodes are not present.");
            return;
        }

        Node ans = LCA(root, p, q);

        System.out.println("LCA = " + ans.val);
    }
}