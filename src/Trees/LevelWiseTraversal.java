package Trees;

public class LevelWiseTraversal {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static int Height(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right==null) return 0;
        return 1+ Math.max(Height(root.left),Height(root.right));
    }
    public static void NthLevel(Node root, int n){
        if(root == null) return;
        if(n==1) {
            System.out.print(root.val+" ");
            return;
        }
        NthLevel(root.left , n-1);
        NthLevel(root.right, n-1);
    }
    public static void main(String[] args){
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
        int Lvl = Height(root)+1;
        for(int i=1; i<=Lvl; i++){
            NthLevel(root, i);
            System.out.println();
        }
    }
}
