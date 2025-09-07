package Stack;

import java.util.Stack;

public class DisplayRecersively {
    public static void displayReverseRec(Stack<Integer> st) {
        if(st.size()==0) return; 
        int top = st.pop();
        System.out.print(top + " ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void displayRecursion(Stack<Integer> st ) {
        if(st.size()==0) return ;
        int top = st.pop();
        displayRecursion(st);
        System.out.print(top + " ");
        st.push(top);
    }
   public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayReverseRec(st); // this is for reverse in recursion
        displayRecursion(st); // this is only for Recursion 
   } 
}
