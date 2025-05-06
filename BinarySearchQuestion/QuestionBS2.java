//Q4. Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n]
//inclusive in sorted order.There is only one repeated number in nums, return this repeated number.

package BinarySearchQuestion;

public class QuestionBS2 {
    public static int findDuplicate(int [] arr) {
        for(int i=0 ; i<arr.length -1 ; i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4};
        System.out.println("Repeated number is: " + findDuplicate(arr));
    }
}
