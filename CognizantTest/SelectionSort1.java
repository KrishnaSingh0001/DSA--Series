public class SelectionSort1 {
    public static void print(int [] arr) {
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {3 , 4, 5 , 10, 9};
        int n = arr.length;
        print(arr);
        for(int i = 0 ; i<n-1 ; i++){
            int min = Integer.MAX_VALUE;
            int midx = -1;
            for(int j = i ; j< n ; j++){
                if(arr[j]<min){
                    min = arr[j];
                    midx = j;
                }
            }
            // swap 
            int temp = arr[i];?
            arr[i] = arr[midx];
            arr[midx] = temp;
        }
        print(arr);
    }
}
