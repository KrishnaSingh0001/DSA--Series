package BinaryTree;
// class Node{
//     int val;
//     Node left;
//     Node right;
//     Node(int val){
//         this.val = val;
//     }
// }
public class MultiplyOfBT {
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

        System.out.println(multiplyBT(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(size(a));
        System.out.println(level(a));
        System.out.println(height(a));
    }
    private static int multiplyBT(Node root){
        if(root==null){
            return 1;
        }
        return root.val * multiplyBT(root.left) * multiplyBT(root.right);
    }
    private static int max(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val , Math.max(max(root.left), max(root.right)));
    }
    private static int min(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val , Math.min(min(root.left), min(root.right)));
    }
    private static int size(Node root){
        if (root== null) return 0;
        return 1 + size(root.left)+ size(root.right);
    }
    private static int level(Node root){
        if (root== null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }
    private static int height(Node root){
        if(root==null){
            return 0;
        }
        // return Math.max(level(root.left),level(root.right))-1;
        return level(root) -1;
    }
}
