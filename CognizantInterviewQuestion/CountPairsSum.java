package CognizantInterviewQuestion;
public class CountPairsSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int k = 6;
        int n = arr.length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }

        System.out.println("Count of pairs = " + count);
    }
}

