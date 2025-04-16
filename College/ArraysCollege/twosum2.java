package College.ArraysCollege;

public class twosum2 {
    public static void main(String[] args) {
        int arr[] = {1 , 3, 5, 8, 11 , 15 , 17};
        int n = arr.length;
        int target = 6;
        for(int i = 0 ; i < n ; i++){
            for(int j=i+ 1 ; j< n ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                    System.out.println(target);
                }
            }
        }
    }
 }
    
