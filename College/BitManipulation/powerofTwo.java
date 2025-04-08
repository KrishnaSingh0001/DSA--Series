package College.BitManipulation;
import java.util.*;
public class powerofTwo {
    public static boolean ispower(int a ) {
      
        if (a <= 0){  // base case 
            return false;
        }  

        // Step 2: Use bit manipulation
        return (a & (a - 1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        // int b = sc.nextInt();
        if(ispower(a)){
            System.out.println("yes Divisible by 2");
        }
        else{
            System.out.println("No not divisible by 2 ");
        }
    }
    
}
