package CognizantInterviewQuestion;
public class StringPailndrome {
    public static boolean  Pailndrome(String str) {
        int n = str.length();
        // str = "racecar";
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(Pailndrome("racecar"));
    }
}