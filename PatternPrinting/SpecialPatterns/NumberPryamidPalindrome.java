package PatternPrinting.SpecialPatterns;
import java.util.*;
public class NumberPryamidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        for(int i = 1; i <=n ; i++){
            for(int j=1; j<=n-i ; j++){
                System.out.print(" " + " ");
            }

            for(int j = 1 ; j<=i ; j++){    // j<=i (only this change can convert rectangle to triangle )
                System.out.print(j + " ");
            }
            for(int j=i-1; j>=1 ; j--){
                System.out.print(j + " ");
            }
            

            System.out.println();
             
        }
    }
}



