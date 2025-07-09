// In a singly linked list, deletion of data requires modification of how many pointers?


// Question Insert a node in a linkedlist
package LinkedListQestion;
import java.util.*;
class SLL {
    Node head;
    Node tail;
    int size;

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int val, int idx) {
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx > size || idx < 0) {
            System.out.println("Invalid Index !!");
            return;
        }

        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i < idx; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        if (temp.next == null) tail = temp;
        size++;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Question1 {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtHead(10);
        list.insert(20, 1);
        list.insert(15, 1);
        list.display();
    }
}

