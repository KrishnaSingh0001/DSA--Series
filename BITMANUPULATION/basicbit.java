package BITMANUPULATION;
import java.util.*;
public class basicbit {
    public static int  XORfind (int n) {
        
        if(n%4==0){
            return n;

        }
        else if(n%4==1){
            return 1;
        }
        else if(n%4==1){
            return n+1;
        }
        else {  // (n%4==3)
            return 0;
        }

        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(n);
        
    }
}

