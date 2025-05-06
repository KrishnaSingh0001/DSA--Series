// Given a sorted array of n elements and a target ‘x’. Find the last occurrence of ‘x’ in the array. If ‘x’ does
// not exist return -1.

package BinarySearchQuestion;

public class QuestionBS1 {
    public static int findLastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
    int result = -1;
    
    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == x) {
            result = mid;       // potential answer
            low = mid + 1;      // keep searching on the right side
        } else if (arr[mid] < x) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return result;
        
    }
}
