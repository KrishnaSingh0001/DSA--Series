// package LinkedList;

// // public class InsertMethod {
//     class LL{ // Use as a User Defined Data Structure 
//         Node head;
//         Node tail;
//         int size;
        
//         void insertAtEnd(int val){
//             Node temp = new Node(val);
//             if(head==null){
//                 head = temp;
//                 tail=temp; // or head = tail = temp
//             }
//             else{
//                 tail.next = temp;
//                 tail = temp;
//             }
//             size++;     
//         }
//         void InsertAtHead(int val){
//             Node temp = new Node(val);
//             if(head == null) head = tail = temp;
//             else{
//                 temp.next = head;
//                 head=temp;
//             }
//             size++;
//         }
//         void insert(int idx , int val){
//             if(idx ==0){
//                 InsertAtHead(val);
//                 return;
//             }
//             if(idx ==size){
//                 insertAtEnd(val);
//                 return;
//             }
//             if(idx>size){
//                 System.out.println("Invalid return");
//                 return;
//             }

//             Node temp = new Node(val);
//             Node x = head;
//             for(int i =1 ; i< idx-1;i++){
//                 x = x.next;

//             }
//             temp.next = x.next;
//             x.next = temp;
//             size++;
//         }
//         int get(int idx) throws Error{
//             if(idx==size-1) return tail.val;
//             if(idx>=size || idx<0){
//                 throw new Error("Invalid Index");
//             }
//             Node temp = head;
//             for(int i =0 ; i<=idx;i++){
//                 temp = temp.next;
//             }
//             return temp.val;
//         }
//         void set(int idx , int val)throws Error{
//             if(idx==size-1)  tail.val = val;
//             if(idx >=size || idx<0){
//                 throw new Error("Invalid Index");
//             }
//             Node temp  = head;
//             for(int  i = 0 ; i<= idx ; i++){
//                 temp = temp.next;
//             }
//             temp.val=val;
//         }
//         void deleteAtHead() throws Error{
//             if(head == null){
//                 throw new Error("List is Empty ");
//             }
//             head = head.next;
//             size--;

//         }
//         void delete(int idx ) throws Error{
//             if(idx==0){
//                 deleteAtHead();
//                 return;
//             }
//             if(head == null){
//                 throw new Error("List is Empty ");
//             }
//             if(idx >=size || idx<0){
//                 throw new Error("Invalid Index");
//             }
//             Node temp = head;
//             for(int i =1 ; i<=idx-1;i++){
//                 temp = temp.next;
//             }
//             temp.next = temp.next.next;  // code of the deletion 
//             size --;


//         }
//         void display(){
//                 Node temp = head;
//                 while(temp!= null){
//                     System.out.println(temp.val + " ");
//                     temp = temp.next;
//                 }
//                 System.out.println();
//         }
//     }
//     public class InsertMethod {    
//     public static void main(String[] args) {
//         LL list = new LL(); // Blank Linkedlist is created 
//         System.out.println(list.size);
//         list.insertAtEnd(10);
//         list.insertAtEnd(20);
//         list.display();
//         list.insert(2, 100);
//         list.display();

//         list.set(2, 90);
//         list.display();
//         list.delete(2);
//         list.display();
//     }
// }
package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class LL { // User-defined Linked List class
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val) {
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtEnd(val);
            return;
        }
        if (idx > size || idx < 0) {
            System.out.println("Invalid Index");
            return;
        }

        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i < idx; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    int get(int idx) {
        if (idx == size - 1) return tail.val;
        if (idx >= size || idx < 0) {
            throw new Error("Invalid Index");
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void set(int idx, int val) {
        if (idx == size - 1) {
            tail.val = val;
            return;
        }
        if (idx >= size || idx < 0) {
            throw new Error("Invalid Index");
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }

    void deleteAtHead() {
        if (head == null) {
            throw new Error("List is Empty");
        }
        head = head.next;
        size--;
    }

    void delete(int idx) {
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        if (head == null || idx >= size || idx < 0) {
            throw new Error("Invalid Index");
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
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

public class InsertMethod {
    public static void main(String[] args) {
        LL list = new LL(); // Blank Linked List
        System.out.println("Initial size: " + list.size);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.display();

        list.insert(2, 100);
        list.display();

        list.set(2, 90);
        list.display();

        list.delete(2);
        list.display();
    }
}
