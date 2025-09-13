public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {1 ,2 , 4 , 100 , 7 , 89 , 101 , 200 , 3};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]==mx){
                mx = arr[i];
            }
        }
        System.out.println("Largest Element is : " + mx);
    }
}
