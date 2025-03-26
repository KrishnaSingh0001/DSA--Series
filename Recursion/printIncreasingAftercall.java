import java.util.Scanner;

public class printIncreasingAftercall {
    public static void print(int n){
        if(n==0){  // base case 
            return;
        }
        print(n-1);  //call8
        System.out.println(n);   // work
        // print(n-1);  //call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        print(n);
    }
}
