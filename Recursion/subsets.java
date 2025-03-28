import java.util.ArrayList;
// package Recursion;
public class subsets {
    // static ArrayList<String> arr = new ArrayList<>();
    static ArrayList<String> arr = new ArrayList<> ();
    public static void printSubsets(int i , String s , String ans ) {
        if(i == s.length()){
            // arr.add(ans);
            // System.out.println(ans);
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1, s, ans+ch);
        printSubsets(i+1, s, ans);
    }
    public static void main(String[] args) {
        String s = "Singh";
        int n = 5;
        printSubsets(0, s, "");

        System.out.println(arr);
        // System.out.println("The total element in the Subset is : " + 2* print(2,n-1));
    }
}
