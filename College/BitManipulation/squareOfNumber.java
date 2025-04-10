// calculate the square of a number without using * , / , power() 
package College.BitManipulation;

public class squareOfNumber {
    public static int square(int n) {
        // int n =5;
        int max = Math.abs(n);
        int res = 0;
        while (max > 0) {
            if ((max & 1) == 1)
                res += n;
            n <<= 1;
            max >>= 1;
        } 
        return res;

        }
        public static void main(String[] args) {
            System.out.println(square(5));
        }

    }

