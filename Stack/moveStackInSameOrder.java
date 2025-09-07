package Stack;
import java.util.Stack;
import java.util.*;
public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        // System.out.print("Enter the number elements you want to insert : ");
        // int n = sc.nextInt();
        // System.out.println("Enters the elements : ");
        // for(int i =1 ; i<=n ; i++){
        //     int x = sc.nextInt();
        //     st.push(x);
        // }
        // System.out.println(st);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            int x = st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);
    }
}
