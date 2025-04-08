package PatternPrinting.triangle;

import java.util.Scanner;

public class numberTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        for(int i = 1; i <=  n; i++){
            for(int j = 1 ; j<=n+1-i ; j++){    // j<=i (only this change can convert rectangle to triangle )
                System.out.print(j + " ");
            }
            System.out.println();
             
        }
    }
}
