// Question :- Inversion Count Problem => You have to count the number of inversion 


package MergeSortAlgorithm;

public class QuestionMS2 {
    public static void main(String[] args) {
        int arr[] = {  8 , 2, 5 , 3 ,1 ,4};
        int n = arr.length;
        // int i=0, j=0;
        int count =0;
        for(int i=0 ; i<n-1; i++){
            for(int j=i+1; j<n;j++){
                if(arr[i]>arr[j]){
                    count ++;
                    System.out.print(arr[i] + " , " + arr[j]);
                }
            }
        }
        System.out.println();
    }
}
