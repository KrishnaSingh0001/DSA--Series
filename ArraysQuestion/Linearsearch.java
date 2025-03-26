// import java.util.*;
package ArraysQuestion;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {1 , 2, 3 , 4, 8 ,5 , 6};
        int n = arr.length;
        int x = sc.nextInt();
        System.out.println("Enter the target value : ");
        // int x = 8;
        for(int i = 0 ; i<n; i++){
            if(arr[i]==x){
                System.out.println("Element Found " );
                break;
            }
            else {
                System.out.println("Element Not Found");
            }
        }
    }
    
}
