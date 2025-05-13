// Pascals Triangle code with recursion 


package College.ArraysCollege;

public class PascalsTriangle {

    public static void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            int number = 1;
            // Print spaces before the numbers
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
            }
            // Print numbers
            for (int k = 0; k <= i; k++) {
                System.out.printf("%4d", number);
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5;
        printPascalTriangle(numRows);
    }
}
