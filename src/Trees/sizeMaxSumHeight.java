package Trees;
public class sizeMaxSumHeight {
//    static int size = 0;
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
//    public static void preOrder(Node root){
//        if(root == null) return;
//        System.out.print(root.val+" ");
//        size++;
//        preOrder(root.left);
//        preOrder(root.right);
//    }
    public static int SumOfNodes(Node root){
        if(root==null) return 0;
        return root.val + SumOfNodes(root.left) + SumOfNodes(root.right);
    }

    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int LargestNode(Node root){
        if(root==null) return 0;
        return Math.max(root.val,Math.max(root.left.val,root.right.val));
    }
    public static int Height(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right==null) return 0;
        return 1+ Math.max(Height(root.left),Height(root.right));
    }
    public static int ProductOfTree(Node root){
        if(root==null) return 1;
        return root.val*ProductOfTree(root.left)*ProductOfTree(root.right);
    }
    public static int SmallestNode(Node root){
        if(root == null && (root.left==null && root.right==null)) return 0;
        return Math.min(root.val,Math.min(root.left.val,root.right.val));
    }

    public static void main(String[] args){
        Node root = new Node(3);
        Node a = new Node(5);
        Node b = new Node(70);
        root.left = a;
        root.right = b;
        Node c= new Node(12);
        Node d = new Node(34);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
//        preOrder(root);
        System.out.println("Size of the tree is : "+size(root));
        System.out.println("Sum of the nodes is : "+SumOfNodes(root));
        System.out.println("Node with the highest value is : "+LargestNode(root));
        System.out.println("Height of the binary tree is : "+Height(root));
        System.out.println("Product of the tree is : " + ProductOfTree(root));
        System.out.println("Smallest Node of the tree is : "+ SmallestNode(root));
    }
}
