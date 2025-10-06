package CognizantInterviewQuestion;

public class IntegerPailndrome {
    public static boolean isPailndrome(int x) {

        if(x<0){
            return false;
        }
        int original = x;
        int reversed = 0;
        while(x!=0){
            int digit = x%10;
            reversed = reversed *10 + digit;
            x = x/10;
        }
        return reversed==original;


    }
    public static void main(String[] args) {
        int num = 121;
        if(isPailndrome(num)){
            System.out.println("Pailndrome");
        }
        else{
            System.out.println("not Pailndrome");
        }

    }
}
