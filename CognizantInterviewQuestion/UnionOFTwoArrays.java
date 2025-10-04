package CognizantInterviewQuestion;
import java.util.*;
public class UnionOFTwoArrays {
    public static int UnionArrays(String [] args ) {
        int [] a = {1 , 2, 3, 4};
        int [] b = {1 , 2, 3, 4 , 5, 6, 8};
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            result.add(a[i]);
        }
        for(int i = 0 ; i < m ; i++){
            result.add(b[i]);
        }
        return result.size();


    }
}
