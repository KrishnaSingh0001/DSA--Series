package BinaryTree;

public class Traversal {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        a.left =b; a.right = c;
        b.left = d; b.right = e;
        c.right=f;
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
    }
    private static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    private static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
}
