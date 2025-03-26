// import java.util.*;
package RecursionQuestion;

public class RecursionQuestion2 {
    public static void print(int n) {
        if(n==0){
            System.out.println();
            return ;
            
        }
        print(n-1);
        System.out.println();
        
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : " + 10);
        // int n = sc.nextInt();
        print(10);
        System.out.println();
    }
    
}
