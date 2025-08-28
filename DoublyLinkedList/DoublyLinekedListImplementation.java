package DoublyLinkedList;
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
            this.val = val;
    }
}
class DLL{
    dNode head;
    dNode tail;
    int size;
    void display(){
        dNode temp = head;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;

    }
    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size==0) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insert(int idx , int val){
        if(idx ==0){
            insertAtHead(val);
            return;
        }
        if(idx ==size){
            insertAtTail(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid return");
            return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for(int i = 1 ; i < idx-1 ; i++){
            x =   x.next;
        }
        dNode y = x.next;
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;
        size++;

    }
}
public class DoublyLinekedListImplementation {
    public static void print( dNode head){
        dNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail){
        dNode temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        DLL list = new DLL();
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);

        a.next =b;  b.prev = a;
        b.next= c;  c.prev = b;
        c.next = d; d.prev = c;
        print(a);
        printReverse(d);
        list.display();
        list.insertAtHead(50);
        list.display();


    }
}
