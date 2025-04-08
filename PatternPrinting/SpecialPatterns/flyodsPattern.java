package PatternPrinting.SpecialPatterns;

import java.util.Scanner;

public class flyodsPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        int a=1;
        for(int i = 1; i <=n ; i++){  // row
            for(int j = 1 ; j<=i ; j++){    // column // j<=i (only this change can convert rectangle to triangle )
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
             
        }
    }
}
