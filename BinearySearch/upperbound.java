// this code is for upper bound 

package BinearySearch;
import java.util.*;

public class upperbound {
    public static void main(String[] args) {
        int arr[ ]= {10 , 23 , 46 , 46 , 91 , 97 , 97 , 104 , 264};
        int n = arr.length;
        int target = 50;
        int lb = n;
        int lo = 0 ;  
        int hi = n-1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid]>target){
                lb = mid;
                hi = mid -1;
            }
            else{
                lo = mid +1 ;
            }
        }
        System.out.println(lb);
    }
}

// if we take all as a user input 