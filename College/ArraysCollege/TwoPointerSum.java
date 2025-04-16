package College.ArraysCollege;
public class TwoPointerSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 15};
        int target = 15;

        boolean found = findPairWithSum(arr, target);
        if (found)
            System.out.println("Pair found.");
        else
            System.out.println("No such pair exists.");
    }

    static boolean findPairWithSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Elements: " + arr[left] + " + " + arr[right] + " = " + target);
                return true;
            }
            if (sum < target)
                left++;
            else
                right--;
        }
        return false;
    }
}
