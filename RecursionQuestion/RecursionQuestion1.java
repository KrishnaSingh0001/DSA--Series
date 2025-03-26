// import java.util.*;
package RecursionQuestion;

public class RecursionQuestion1 {
    public static int fact(int n) {
        if(n==1){
            return 1;
        }
        int ans = n*fact(n-1);
        return ans;
        
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : " + 3);
        // int n = sc.nextInt();
        // print(n);
        System.out.println(fact(3));
        
        
    }
}
