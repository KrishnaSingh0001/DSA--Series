import java.util.*;
public class LinearSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr target element :");
        int x = sc.nextInt();
        System.out.print("Enter array Size : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter arrays elements : ");
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            if(arr[i]==x){
                System.out.println("Element Found");
            }
            else{
                System.out.println("Element Not Found");
            }
        }
    }
}
