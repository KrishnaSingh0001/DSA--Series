package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class SLL {
    private Node head;
    private Node tail;
    private int size;

    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp; // ✅ FIX: use tail, not head
            tail = temp;
        }
        size++; // optional: maintain size
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class InsertAtHead {
    public static void main(String[] args) {
        SLL list = new SLL(); // blank linked list created
        // System.out.println("Initial size: " + list.size);
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.display(); // Output: 10 20
    }
}
