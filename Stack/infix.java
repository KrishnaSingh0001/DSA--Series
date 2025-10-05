package Stack;
import java.util.*;
public class infix {
    public static void main(String[] args) {
        // int x = 9-(5+3)*4/6;
        // System.out.println(x);
        // 9-(4+3)*8/6
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i); // character ko nikal rhe hain 
            int ascii = (int)ch;
            // 0 ki ascii value 48 && 9 -> 57
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop(); //'(' hata diya 
            }
            else {
                if(ch=='+' || ch=='-'){
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    //work
                    if(op.peek()=='*' || op.peek()=='/'){
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek()=='-') val.push(v1-v2);
                        if(op.peek()=='+') val.push(v1+v2);
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                    }
                    op.push(ch);
                }
                else op.push(ch);
            }
            
        }
        // val wale stack ki size ko 1 krna hai 
        while(val.size()>1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
