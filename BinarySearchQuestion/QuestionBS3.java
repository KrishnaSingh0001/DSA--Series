//Given a number ‘n’. Predict whether ‘n’ is a valid perfect square or not.


package BinarySearchQuestion;
import java.util.*;

public class QuestionBS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();

        if (isPerfectSquare(n)) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
    }

    public static boolean isPerfectSquare(int n) {
        if (n < 0) return false;

        int low = 1, high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == n) {
                return true;
            } else if (square < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}

