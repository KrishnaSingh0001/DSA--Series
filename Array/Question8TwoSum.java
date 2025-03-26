//Question 8 : - find the doublet in the array whose sum is Equal to the given value x . (Two Sum )


// public class Question8TwoSum {
//     public static void main(String[] args) {
//         int arr[] = {2 ,1 , 3 , 5 , 4 , 6};
//         int x = 9;  
//         int n = arr.length;

//         for(int i = 0 ; i<n ; i++){
//             for(int j = i+1 ; j<n; j++){
//                 if (arr[i] + arr[j] ==x ){
//                     System.out.println(arr[i] + " " + arr[j]);
//                 }
//             }
//         }
//     }
// }
import java.util.*;
public class Question8TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array n = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0 ; i < n ; i++){
            arr[i]= sc.nextInt();
            System.out.println(arr[i]);
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("Enter the target sum: ");
         int target = sc.nextInt();

        System.out.println("Pairs with sum " + target + ":");
        boolean found = true ;
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);


                }
            }
        }
        if(!found){
            System.out.println("element not found");
        }
        

    }
}

// public class Question8TwoSum {

//     public static void main(String[] args) {
//         int [] arr = { 1 , 2 , 4 , 6, 8 , 5};
//         int target =  10;
//         int n = arr.length;
//         for(int i = 0 ; i < n ; i++){
//             for(int j = 1+1 ; j<n ; j++){
//                 if(arr[i]+ arr[j] == target){
//                     System.out.println(arr[i] + " " + arr[j]);
//                 }
//             }
//         }
//     }
// }