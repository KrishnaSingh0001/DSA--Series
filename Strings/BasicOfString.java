// package Strings;
import java.util.*;
public class BasicOfString {
    public static void main(String args []){
        char arr[] = {'a','b','c','d'};
        String str1=("abcd");
        String str3 = ("xyz");
        String str2 = new String("xyz");
        System.out.println(str1==str2);



        // String are IMMUTABLE (Means not changeable)
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        String name = sc.nextLine();
        System.out.println(name.length());


        
    }
}
