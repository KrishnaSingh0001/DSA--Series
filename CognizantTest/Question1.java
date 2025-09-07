import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hurl = sc.nextInt();
        int spin  = sc.nextInt();
        int speedFactor = sc.nextInt();

        int grade ;
        if(hurl > 50 && spin > 60 && speedFactor>100){
            grade = 10;
        }
        else if(hurl > 50 && spin > 60){
            grade= 9;
        }
        else if(spin>60 && speedFactor>100){
            grade = 8;
        }
        else if(hurl>50 && speedFactor>100){
            grade = 7;
        }
        else if(hurl>50 || spin > 60 || speedFactor>100 ){
            grade = 6;
        }
        else {
            grade = 5;
        }
        System.out.println(grade);
    }
}
