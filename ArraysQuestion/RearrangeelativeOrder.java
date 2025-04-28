// input Arr= {1 , 2 , -4 , -5} o/p = {1 , -4 , 2, -5 }
// 2nd input Arr={1 ,2, -3 , -1 , -2 ,3 } . O/P = { 1, -3 , 2 , -1 , 3 , -2}
package ArraysQuestion;

public class RearrangeelativeOrder {
    public static void rearrange(int [] arr ) {
        // int arr[] = {1 , 2, -4 , -5};
        int n = arr.length;
        int i =0;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, q = 0; 

        for(i=0 ; i < n ; i++){
            if(arr[i]>0 ){
                pos[p++]= arr[i];
            }
            else{
                neg[q++]=arr[i];
            }
        }
        for( i=0 ; i < n/2 ; i++){
            arr[2*i]=pos[i];  // even position 
            arr[2*i+1]=neg[i];  // odd position
        }
    }
        public static void main(String[] args) {
            int[] arr = {1, 2, -4, -5};
            int n = arr.length;     
            rearrange(arr);
            for(int i=0 ; i < n ; i++){
                System.out.print(arr[i] + " ");
            }
    }
}
