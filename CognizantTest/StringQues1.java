public class StringQues1 {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPailndrome(str));
    }
    public static boolean isPailndrome(String str) {
        int n = str.length();
        for(int i = 0 ; i < n ; i ++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}