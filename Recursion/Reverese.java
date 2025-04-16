public class Reverese {
    public static void Reverse1(int [] arr) {
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
        int arr[]= {1 ,2 , 3 , 4 };
        System.out.print("Original Arrays : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        Reverse1(arr);
        System.out.print("Reverse arrays : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print( " " + arr[i]);
        }
    }
}