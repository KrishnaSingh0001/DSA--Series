import java.util.Arrays;
public class subsets {
    // static ArrayList<String> arr = new ArrayList<>();
    public static void printSubsets(int i , String s , String ans ) {
        if(i == s.length()){
            System.out.println(ans);
            // arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1, s, ans+ch);
        printSubsets(i+1, s, ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        printSubsets(0, s, "");
        // System.out.println(arr);
    }
}
