// public class Reversearray {
//     public static void main(String[] args) {
//         int arr[] = {1 , 2, 3 ,4 , 5 , 6};
//         int n = arr.length;
//         System.out.println("Original arrays :");
//         for(int i = 0 ; i<n ; i++){
//             System.out.println(arr[i]);
//         }
//         System.out.println();
//         int i = 0 ,  j = n-1;
//         while(i<=j){
//             int temp = arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;


//         }
//         System.out.println("Original arrays :");
//         for (int i = 0 ; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
        
//     }
// }

// public class Reversearray {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6};
//         int n = arr.length;

//         // Print original array
//         System.out.print("Original Array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//         // Reverse the array using two-pointer approach
//         int i = 0, j = n - 1;
//         while (i < j) { // Swapping elements from both ends
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }

//         // Print reversed array
//         System.out.print("Reversed Array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


/// CODE BY RECURSION 
public class Reversearray {
    public static void Reverse1( int [] arr  ) {
         
        // int n = arr.length;
        int i = 0 , j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        System.out.println("Original arrays :");
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Reverse1(arr);
        System.out.println("Reverse arrays :");
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

