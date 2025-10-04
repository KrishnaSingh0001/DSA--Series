package CognizantInterviewQuestion;
import java.util.*;
public class PrimeNumber {
    public static boolean isPrime( int n) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        if(n<=1){
            return false;
        }
        else{
            for(int i =2 ; i <= Math.sqrt(n) ; i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number. ✅");
        } else {
            System.out.println(number + " is not a prime number. ❌");
        }
        sc.close();
    }
}
