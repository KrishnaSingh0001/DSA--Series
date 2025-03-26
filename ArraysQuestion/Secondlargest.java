package ArraysQuestion;

public class Secondlargest {
    public static void main(String [] args){
        int arr[] = {12, 35, 1, 10, 34, 1,5,10};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(arr[i]>max ){
                max=arr[i];
            }
        }
        
        int smx = Integer.MIN_VALUE;
        for(int i = 0 ; i <n ; i++){
            if(arr[i]>smx && arr[i]!= max){
                smx=arr[i];
            }
        }

        if (smx == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("First Largest: " + max);
            System.out.println("Second Largest: " + smx);
        }
        
    }
}
