// Print all the element of the array by Using Recursive code

public class ArrayTraversal {
    public static void print(int i , int arr[]) {
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        print(i+ 1, arr);
    }
    public static void main(String[] args) {
        int arr[] = {1 , 3, 4, 7 , 9 , 8 };
        print(0, arr);
    }
    
}

