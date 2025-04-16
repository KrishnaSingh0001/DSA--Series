package PatternPrinting.SpecialPatterns;
import java.util.*;
public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        for(int i=0 ; i < 2*n-1; i++){
            System.out.print("*" + " ");
        }
        System.out.println();
        n--;
        for(int i=1; i<=n;i++){  //rows Stars left sides 
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*" + " ");
            }
            for(int j=1 ; j<=2*i-1; j++){ // Spaces 
                System.out.print(" " +" ");
            }
            for(int j=1; j<=n+1-i;j++){  // Stars right side 
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
