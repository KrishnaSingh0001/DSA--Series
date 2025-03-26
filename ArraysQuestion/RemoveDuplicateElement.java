package ArraysQuestion;

public class RemoveDuplicateElement {
    public static void main(int arr[]) {
        int n = arr.length;
        int index=0;
        for(int i = 0 ; i<n ; i++){
            if(arr[i]!=arr[i+1]){
                
                index++;
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 1 , 2,2,3,3};
        System.out.println(arr);
        

    }
}
