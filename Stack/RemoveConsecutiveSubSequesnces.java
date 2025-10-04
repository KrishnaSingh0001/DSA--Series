package Stack;
import java.util.*;
public class RemoveConsecutiveSubSequesnces {
    public static void main(String[] args) {
        int [] arr = {1 , 2, 2 , 3 , 10 , 10 , 10 , 4 ,4 ,4 , 5, 7, 7, 2};
        int [] res = remove(arr);
        for(int i = 0 ; i < res.length ; i++){
            System.out.println(res[i] + " ");
        }
    }
    public static int[] remove(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i =0 ; i < n ; i++){
            if(st.size()==0 || st.peek() != arr[i]) st.push(arr[i]);
            else if(arr[i] == st.peek() ){
                if(i==n-1 ||  arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
            int res[] = new int[st.size()];
            int m = res.length;
            for(int i=m-1; i>=0; i--){
                res[i] = st.pop();
            }
            return res;

        }

    }
}

// import java.util.*;

// public class RemoveConsecutiveSubsequences {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
//         int[] res = remove(arr);
//         for (int i = 0; i < res.length; i++) {
//             System.out.print(res[i] + " ");
//         }
//         // Expected output: 1 3 5 2
//     }

//     public static int[] remove(int[] arr) {
//         int n = arr.length;
//         Stack<Integer> st = new Stack<>();

//         // 1. This loop must finish processing the WHOLE array first.
//         for (int i = 0; i < n; i++) {
//             if (st.isEmpty() || st.peek() != arr[i]) {
//                 st.push(arr[i]);
//             } else if (st.peek() == arr[i]) {
//                 st.pop();
//                 // Skip all other identical elements
//                 while (i + 1 < n && arr[i + 1] == arr[i]) {
//                     i++;
//                 }
//             }
//         } // The main loop ends here.

//         // 2. NOW, create the result array and populate it.
//         // This fixes both the "duplicate variable" error and the logic flaw.
//         int[] res = new int[st.size()];
//         for (int j = res.length - 1; j >= 0; j--) { // Using 'j' to be clear
//             res[j] = st.pop();
//         }
        
//         return res;
//     }
// }