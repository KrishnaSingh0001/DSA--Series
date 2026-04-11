package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;
class Node {
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
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
        System.out.println();
        System.out.print("Level order : ");
        levelOrder(a);
        System.out.println();
    }
    private static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null){
                q.add(front.left);
            }
            if(front.right!=null){
                q.add(front.right);
            }
        }
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
