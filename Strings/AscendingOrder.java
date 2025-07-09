import java.util.*;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        AscendingOrder a = new AscendingOrder();
        System.out.println(a.ascendingOrder(s));
    }

    boolean ascendingOrder(String s) {
        String[] words = s.trim().split(" ");
        int prev = -1;

        for (String word : words) {
            if (isNumber(word)) {
                int num = Integer.parseInt(word);
                if (num < prev) {
                    return false;
                }
                prev = num;
            }
        }

        return true; // If no decreasing number found
    }

    boolean isNumber(String word) {
        try {
            Integer.parseInt(word);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
 