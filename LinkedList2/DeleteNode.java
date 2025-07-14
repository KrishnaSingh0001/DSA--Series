// Question :- delete the Node in a Linked List. 
package LinkedList2;
import java.util.*;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class SLL{ // Use as a User Defined Data Structure 
    Node head;
    Node tail;
    int size;
    void delete (int idx) throws Error{
        if(head == null){
            throw new Error("List is Empty");

        }
        if(idx>0 || idx>= size){
            throw new Error("Invalid Index !");
        }
        Node temp = head ;
        for(int i = 0 ; i <idx-1 ; i++){
            temp= temp.next;

        }
        if(temp.next==tail){
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;

    }

}

public class DeleteNode {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.add(10);

    }
}
