import java.util.*;
public class userinput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Element of Arrays : ");
        int [] arr = new int [n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Final Array : ");
        for(int i = 0 ; i< arr.length; i++){
            System.out.print( " { "+ arr[i] + " }");
        }
        
    }
    
}
