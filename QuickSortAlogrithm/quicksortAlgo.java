package QuickSortAlogrithm;

public class quicksortAlgo {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    public static int partition(int [] arr , int lo , int hi ) {
        int pivot = arr[lo] , pivotIdx = lo;
        int smallerCount=0;
        for(int i=lo+1 ; i<=hi ; i++){
            if(arr[i] <= pivot) smallerCount++;

        }
        int correctIndex = pivotIdx + smallerCount;
        // swap 
        // int temp = arr[pIdx];
        // arr[pIdx] = arr[correctIndex];
        // arr[correctIndex] = temp;
        swap(arr , pivotIdx , correctIndex);
        // partition 
        int i= lo , j= hi ;
        while(i<correctIndex && j>correctIndex){
            if(arr[i]<pivot) i++ ;
            else if (arr[i]> pivot) j--;
            else if (arr[i]>pivot && arr[j]<=pivot){
                swap(arr , i , j);
            }
        }
        return correctIndex;

    }
    public static void quickSort(int [] arr , int lo , int hi){
        if(lo>=hi ) return;
        // pivot (arr[lo]) ko sahi jgh rakho 
        // & left part me <=pivot.
        int idx = partition(arr, lo, hi);
        quickSort(arr, lo, idx-1);
        quickSort(arr, idx+1, hi);

    }
    public static void main(String[] args) {
        int [] arr = {4 , 9 , 7, 1, 3,2,6,5,8};
        print(arr);
        int n = arr.length;
        quickSort(arr  , 0 , n-1);
        print(arr);
    }
}
