import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = { 1 , 4, 5 , 3 , 7, 8 , 9 , 10 , 23};
        int target = 7;

        // Step 1: Sort the array
        Arrays.sort(arr);

        int lo = 0;
        int hi = arr.length - 1;
        boolean flag = false;  // start with false

        // Step 2: Perform Binary Search
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        // Step 3: Print Result
        if (flag) {
            System.out.println("Target Found");
        } else {
            System.out.println("Target Not Found");
        }
    }
}
