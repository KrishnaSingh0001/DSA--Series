package Stack;
import java.util.*;
public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // reverse Order
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);
    }
}
