package ArraysQuestion;

public class Largestelement {
    public static void main(String [] args) {
        int arr [] = {1 , 2, 3 , 10 , 11 , 5 , 6 };
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
}
