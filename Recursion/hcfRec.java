import java.util.*;
// Package Recursion;
public class hcfRec {
     

    public static int gcd(int a , int b) {
        if(b%a==0){       // BASE CONDITION 
            return a;
        }
        return gcd(b%a , a);   
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a : ");
        int a = sc.nextInt();
        System.out.println("Enter the number b : ");
        int b = sc.nextInt();
        System.out.println(gcd(a, b)); 
    }
    
}


