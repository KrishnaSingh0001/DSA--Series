import java.util.*;
public class printStringsConsecutive1s {
    public static void printStrings(String s , int n) {
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
            printStrings(s+0,n);
            printStrings(s+1, n);
        }
        else{
            printStrings(s+0, n);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n = sc.nextInt();
        printStrings("",n);

        
    }
    
}
