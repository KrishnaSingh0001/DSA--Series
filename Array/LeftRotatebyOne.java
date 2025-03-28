public class LeftRotatebyOne {
    public static void main(String[] args) {
        int arr[] = {1 , 2, 3, 4, 5};
        int n = arr.length;
        int temp = arr[0];  // Stroing array 
        for(int i = 1 ; i<n ; i++){
            arr[i-1]=arr[i];  // left by one 
        }
        arr[n-1]= temp;   // storing arrays at last position 
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]); // Printing each element
        }
        

    }
}

// ArrayList <Integer> arr = new ArrayList<> (6)