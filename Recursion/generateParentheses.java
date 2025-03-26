import java.util.*;
public class generateParentheses {
    public static void printParentheses(int open , int close , int n , String s) {
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n){
            printParentheses(open+1, close, n, s+"(");
        }
        if(open>close){
            printParentheses(open, close+1, n, s+")");
        }

        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n = sc.nextInt();
        printParentheses(0, 0, n, "");

    }

    
}
