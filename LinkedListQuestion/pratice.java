// package LinkedListQuestion;

// class sNode{
//     int val;
//     sNode next;
//     sNode(int val){
//         this.val = val;
//     }
// }
// class SLL{
//     sNode  head;
//     sNode tail;
//     int size;
//     void display(){
//         sNode  temp = head;
//         while(temp!=null){
//             System.out.print(temp.val +" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
//     void insertAtHead(int val){
//         sNode newNode = new sNode(val);
//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//         } else {
//             newNode.next = head;
//             head = newNode;
//         }
//         size++;
//     }
// }
// public class pratice {
//     public static void main(String[] args) {
//         SLL list = new SLL();
//         list.insertAtHead(10);
//         list.insertAtHead(20);
//         // list.insertAtEnd(30);
//         list.display(); // Expected: 20 10 30
//         System.out.println("Size = " + list.size);
//     }
// }

package LinkedListQuestion;   


class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

class SLL {
    Node head;
    Node tail;
    int size;

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
}

public class pratice {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.display(); // Expected: 20 10
        System.out.println("Size = " + list.size); // Expected: 2
    }
}
