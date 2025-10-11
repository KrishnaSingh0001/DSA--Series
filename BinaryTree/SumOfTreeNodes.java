package BinaryTree;
class Node1{
    int val;
    Node1 left;
    Node1 right;
    Node1(int val){
        this.val = val;
    }

}
public class SumOfTreeNodes {
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
        System.out.println();
        System.out.println(sum(a));
    }
    private static int sum(Node root){
        if (root== null) return 0;
        return root.val + sum(root.left)+ sum(root.right);
    }
}
