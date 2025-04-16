package PatternPrinting.SpecialPatterns;

import java.util.Scanner;

public class starPrymaid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){ // rows 
            for(int j=1 ; j<= n-i ; j++){ //spaces
                System.out.print(" " + " ");
            }
            for(int j=1; j<=2*i-1 ; j++){ // stars
                // System.out.print("*" + " ");
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
    }
}
