package CognizantInterviewQuestion;

public class SecondLargest2 {
    public static void main(String[] args) {
        int [] arr = { 1 , 10 , 6, 9 , 8 , 5, 4};
        int n = arr.length; 
        int max  = Integer.MIN_VALUE;
        for(int i = 0; i< n ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int smx = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != max){
                smx = Math.max(smx , arr[i]);
            }
        }
        System.out.println(smx);
    }
}
