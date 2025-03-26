// import java.util.*;
package ArraysQuestion;

public class pailndrominteger {
    public static boolean Pailndrome1(int nums[]) {
        int n = nums.length;
        for(int i = 0 ; i < n/2 ; i++){
            if(nums[i] != nums[n-i-1]){
                return false;
            }
        }
        return true;

    }
        public static void main(String[] args) {
            int nums []= {1 , 2, 3 , 3 , 2 , 1};
            System.out.println(Pailndrome1(nums));
    }

}



// public class Question {
//     public static boolean isPalindrome(String str){
//         int  n = str.length();
//         for(int i = 0 ; i<str.length()/2;i++){
//             if(str.charAt(i)!= str.charAt(n-i-1)){
//                 // NOT A PAILDROME
//                 return false ;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String str = "racecar";
//         System.out.println(isPalindrome(str));
//     }
// }
