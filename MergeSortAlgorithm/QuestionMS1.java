// you have to count the niumber of inverson from the array { 8 , 2, 5 ,3 , 1 , 4}
package MergeSortAlgorithm;

public class QuestionMS1 {
    public static void main(String[] args) {
        int arr[] = { 8 , 2, 5 ,3 , 1 , 4};
        int n = arr.length;
        int count =0 ;
        for(int i=0 ; i < n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]>arr[j]){
                    count ++;
                }
            }
        }
    }
}
