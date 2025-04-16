// public class LeaderArray {
//     public static void findLeader(int arr[] , int size) {
//         for(int i=0; i<size;i++){
//             // int j ;
//             for(int j=i+1 ; j<size ; j++){
//                 if(arr[i] <=arr[j]){
//                     break;
//                 }
//                 if(j== size){
//                     System.out.println("The leader of the array is " + arr[i]);
//                 }
//             }
//         }
        
//     }
//     public static void main(String[] args) {
//         int [] arr = {15 , 18 , 5 , 3, 6, 2};
//         int n = arr.length;
//         findLeader(arr, n);
//     }

// }

public class LeaderArray {
    public static void findLeader(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j]) {
                    break;
                }
            }
            // If no element to the right is greater
            if (j == size) {
                System.out.println("Leader is: " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 5, 3, 6, 2};
        int n = arr.length;
        findLeader(arr, n);
    }
}
