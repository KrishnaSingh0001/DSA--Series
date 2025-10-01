package CognizantInterviewQuestion;

public class MissingNumber {
    public static int MissingElement(int nums[] , int n) {
        // int sum = 0; 
        // int n = nums.length;
        int expectedSum = n*(n +1)/2;
        int sum = 0; 
        for(int i  =0 ; i<nums.length ; i++){
            sum += nums[i];
        }
        return expectedSum-sum;
        
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5};
        int n = 5;
        System.out.println("Missing number: " + MissingElement(nums, n)); // Output: 3
    }
}
