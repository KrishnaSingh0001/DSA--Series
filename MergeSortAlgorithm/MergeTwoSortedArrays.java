package MergeSortAlgorithm;

public class MergeTwoSortedArrays {
    public static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int a [] =  {11  , 33, 42, 62};
        int b [] = {26 , 54 , 64 , 81};
        print(a);
        print(b);
        int c [] = new int[a.length + b.length];
        merge(a,b,c);
        print(c);


    }
    public static void merge(int[] a , int[] b , int []c) {
        int i=0 , j=0, k=0;
        while(i<a.length &&  j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]= b[j++]; 
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
    }
     
}

// int a [] =  {11  , 33, 42, 62};
//         int b [] = {26 , 54 , 64 , 81};
//         // int m = a.length;
//         // int n = b.length;
//         int c [ ] = new int [a.length + b .length];
//         int i = 0 , j = 0 , k = 0 ;
//         // Merging 
//         while(i<a.length && j < b.length){
//             if(a[i] <= b[j]){
//                 c[k]=a[i];
//                 i++; 
//             }
//             else{
//                 c[k]= b[j];
//                 j++; 
//             }
//             k++;
//         }

//         if(i==a.length){ // now taking element  from b only 
//             while(j<b.length){
//                 c[k] = b[j];
//                 j++; k++;
//             }
//         }

//         if(j == b.length){// now taking element from a only 
//             while (i<a.length){
//                 c[k] = a[i];
//                 i++ ; k++;
//             }
//         }

//         for(int ele : c){
//             System.out.print(ele + " ");
//         }