package StringPW;
import java.util.*;
public class Reverse {

    public static void reverse2(StringBuilder sb , int i , int j ) {
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++; j--;
        }
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // String s = "Krishna";
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb.reverse());
        reverse2(sb,2, 4);
        System.out.println(sb);




    }
    
}
