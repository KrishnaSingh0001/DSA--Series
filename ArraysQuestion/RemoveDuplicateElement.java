package ArraysQuestion;

public class RemoveDuplicateElement {
    public static void main(int arr[]) {
        int n = arr.length;
        int idx=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[idx]) {
                idx++;
                arr[idx] = arr[i]; 
            }
        }
        return idx + 1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1 , 2,2,3,3};
        System.out.println(arr);
    }
}
