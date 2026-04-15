package LinkedListRevision;

public class BasicLL {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val
        }
    }
    public static void main(String[] args){
        // BasicLL list = new BasicLL(); 
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        a.next = b;
        b.next = c;
        c.next = a;
        Node temp = a;
        System.out.println(temp.val);

    }
}