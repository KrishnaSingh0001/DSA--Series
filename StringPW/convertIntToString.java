package StringPW;
import java.util.*;
public class convertIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int base = sc.nextInt();

        if(base ==0 || base ==1){
            System.out.println("Not valid");
        }

        int sum = a+b ;
        System.out.println(Integer.toString(sum , base));

        
    }
    
}
