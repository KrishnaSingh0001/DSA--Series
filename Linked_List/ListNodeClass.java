package Linked_List;
// class Car {
//     int price ;
//     String name;
//     Car(int price , String name){
//         this.price = price;
//         this.name = name;
//     }
// }
class Node{
    int val;
    Node next;
    Node(int val){  /// Paramaterised Constructor 
        this.val = val;
    }
}
public class ListNodeClass {
    public static void print(Node head) {
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void displayRecursive (Node head) {
        if(head == null) return ;  // base case 
        displayRecursive(head.next);
        System.out.println(head.val);
    }
    public static void main(String[] args) {
        // Car c1 = new Car(120000 , "Kia");
        // c1.name = "Kia";
        // c1.price = 1200000;
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b; // 10 -> 20
        b.next = c; // 10->20->30
        c.next = d; // 10->20->30->40
        d.next = e; // 10->20->30 ->50
        print(a);
        System.out.println();
        displayRecursive(a);
        System.out.println();
        System.out.println(a.val);
        System.out.println(b.val);  // b = a.next 
        System.out.println(c.val);  // c = b.next & b = a.next then c = a.next.next
        System.out.println(d.val);  
        System.out.println(e.val);
    }
}
