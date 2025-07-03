package LinkedList;

public class InsertMethod {
     static class LL{ // Use as a User Defined Data Structure 
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
            size++;     
        }
        void InsertAtHead(int val){
            Node temp = new Node(val);
            if(head == null) head = tail = temp;
            else{
                temp.next = head;
                head=temp;
            }
            size++;
        }
        void insert(int idx , int val){
            if(idx ==0){
                InsertAtHead(val);
                return;
            }
            if(idx ==size){
                insertAtEnd(val);
                return;
            }
            if(idx>size){
                System.out.println("Invalid return");
                return;
            }

            Node temp = new Node(val);
            Node x = head;
            for(int i =1 ; i< idx-1;i++){
                x = x.next;

            }
            temp.next = x.next;
            x.next = temp;
            size++;
        }
        int get(int idx) throws Error{
            if(idx==size-1) return tail.val;
            if(idx>=size || idx<0){
                throw new Error("Invalid Index");
            }
            Node temp = head;
            for(int i =0 ; i<=idx;i++){
                temp = temp.next;
            }
            return temp.val;
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
    
    public static void main(String[] args) {
        LL list = new LL(); // Blank Linkedlist is created 
        System.out.println(list.size);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.display();
        list.insert(2, 100);
        list.display();
    }
}
