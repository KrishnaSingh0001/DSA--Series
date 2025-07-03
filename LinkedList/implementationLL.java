package LinkedList;
import java.util.*;
class SLL{ // Use as a User Defined Data Structure 
    Node head;
    Node tail;
    int size;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
            tail=temp; // or head = tail = temp
        }
        else{
            tail.next = temp;
            tail = temp;
        }     
    }
    void display(){
            Node temp = head;
            while(temp!= null){
                System.out.println(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
    }
}
public class implementationLL {
    public static void main(String[] args) {
        // ArrayList<Integer> a = new ArrayList<>();
        SLL list = new SLL(); // Blank Linkedlist is created 
        System.out.println(list.size);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.display();
        // list.insertAtEnd(69);
        // list.display();
        
    }
}
