package StringPW;
import java.util.Scanner;
public class countvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine();
        int n = s.length();
        int count =0;
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)== true){
                count++;
            }
            
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch) {
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
            return true;
        }
        return false ;
        
    }
     
}
