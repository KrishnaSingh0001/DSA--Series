package Queue;
import java.util.*;
public class ReverseKQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k =3;
        reverseKQueue(q,k);
        System.out.println(q);
    }
    public static void reverseKQueue(Queue<Integer> q,int k){
        Stack<Integer> st = new Stack<>();
        if (q == null || k <= 0 || k > q.size()) {
            return;
        }

        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        int size = q.size();
        for(int i=0; i<size-k;i++){
            q.add(q.remove());
        }
    }
}
