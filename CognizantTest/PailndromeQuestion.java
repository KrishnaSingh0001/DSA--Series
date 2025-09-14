// public class PailndromeQuestion {
//     public static boolean  isPailndrome(int nums[]) {
//         int n = nums.length;
//         for(int i = 0 ; i < n ; i++){
//             if(nums[i] != nums[n-i-1]){
//                 return false;
//             }
//         }
//         return true;
        
//     }
//     public static void main(String[] args) {
//         int nums[] = {1 , 2 , 3 , 4};
//         System.out.println(isPailndrome(nums));
//     }
// }


public class PailndromeQuestion {
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while(num > 0) {
            int digit = num % 10;         // last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;               // remove last digit
        }

        return original==reversed;
    }
    public static void main(String[] args) {
        int num = 12321;
        if(isPalindrome(num)){
            System.out.println(num + " is a pailndrome");
        }
        else{
            System.out.println(num + "is NOT a pailndrome");
        }
        // System.out.println(isPalindrome(num));
    }
}
