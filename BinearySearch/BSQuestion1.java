// Problem Statement: Given an integer array arr of size N, sorted in ascending order 
//(with distinct values) and a target value k. Now the array is rotated at some pivot point unknown to you. 
//Find the index at which k is present and if k is not present return -1.

package BinearySearch;

public class BSQuestion1 {
    public static int RotatedSortedArray(int arr , int k) {
        int n = arr.length;
         
        // int flag = true;
        for(int i=0 ; i< n ; i++){
            if(arr[i]==k){
                return k;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = { 5 , 6 , 7 ,8 , 9};
        int n = arr.length;
        int k= 8;
        System.out.println();
    }
}
