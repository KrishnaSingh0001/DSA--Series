public class StocksBuySell {
    public static int maxpro(int [] arr) {
        int maxpro =0 ;
        for(int i = 0 ; i < arr.length; i++){
            for(int j=i ; j< arr.length; j++){
                if(arr[j] > arr[i]){
                    // maxpro = Math.max(maxpro, arr[i] , arr[i-1]);
                    int profit = arr[j] - arr[i];
                    maxpro = Math.max(maxpro, profit);
                }
            }
        }
        return maxpro;
    }
    public static void main(String[] args) {
        int arr [] = {7,1,5,3,6,4}; 
        System.out.println("Max Profit is : " + maxpro(arr));
    }
}
