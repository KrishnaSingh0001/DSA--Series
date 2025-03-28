package ArraysQuestion;

public class Missingelement {
    public static int printmissing(int n , int arr []) {
        int expectedoutput = n*(n+1)/2;
        int OriginalOutput = 0;

        if(arr.length == n){
            System.out.println(arr); // base case 
            // return ;
        }

        for(int i = 0 ; i < arr.length ; i++){
            OriginalOutput +=arr[i];
        }

        return expectedoutput - OriginalOutput;
    }
    public static void main(String[] args) {
        int arr [] = { 0, 1 , 2, 4 , 5, 6};
        int n = 6;
        System.out.println("Missing number is : " + printmissing(n, arr));

        
    }
    
}
