package Trees;

public class TreeTraversal {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static void Preorder(Node root){
        if(root==null) return ;
        System.out.print(root.val+" ");

        Preorder(root.left);
        Preorder(root.right);
    }

    public static void Inorder(Node root){
        if(root == null) return;
        Inorder(root.left);
        System.out.print(root.val+" ");

        Inorder(root.right);

    }
    public static void Postorder(Node root){
        if(root == null) return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.val+" ");

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
        System.out.print("Preorder : ");
        Preorder(root);
        System.out.println();

        System.out.print("Inorder : ");
        Inorder(root);
        System.out.println();

        System.out.print("Postorder : " );
        Postorder(root);
    }
}
