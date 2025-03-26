import java.util.*;
public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays : ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println( "the input Elements " + n + " are : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            // System.out.println(arr[i] + " ");
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("enter the target sum = ");
        int target = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }


        
    }
    
}
