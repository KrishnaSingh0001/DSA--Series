import java.util.Scanner;
public class nStairs {
    public static int stairs(int n){
        if(n<=2){
            return n ;
        }
        return stairs(n-1) + stairs(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Stairs : ");
        int n = sc.nextInt();
        System.out.println(stairs(n));
        
    }
    
}
