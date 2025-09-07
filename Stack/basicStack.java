package Stack;
import java.util.Stack;
public class basicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println("size is : "+ st.size());
        System.out.println(st);
        System.out.println();
        st.push(1);
        System.out.println("size is : "+ st.size());
        System.out.println(st);
        System.out.println();
        st.push(2);
        System.out.println("size is : "+ st.size());
        System.out.println(st);
        System.out.println();
        st.push(3);
        System.out.println("size is : "+ st.size());
        System.out.println(st);
        System.out.println();
        st.push(4);
        System.out.println("size is : "+ st.size());
        System.out.println(st);
        

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println("size is : "+ st.size());
        System.out.println(st);
    }
}
