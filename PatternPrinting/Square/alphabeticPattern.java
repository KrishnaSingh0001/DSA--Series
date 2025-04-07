package PatternPrinting.Square;

import java.util.Scanner;

public class alphabeticPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        for(int i = 1 ; i <=n ; i++){
            for(int j = 1 ; j<=n ; j++){
                // System.out.print((char)(i+64)+" "); // for AAAA, BBBB , CCCC , DDDD
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
