package PatternPrinting.SpecialPatterns;

import java.util.Scanner;

public class oddNumberTriangle {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        for(int i = 1; i <=n ; i++){
            for(int j = 1 ; j<=i ; j++){    // j<=i (only this change can convert rectangle to triangle )
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
             
        }
    }
}
