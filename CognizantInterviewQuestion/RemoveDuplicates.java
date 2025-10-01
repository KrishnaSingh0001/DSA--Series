package CognizantInterviewQuestion;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] nums= {1 , 2 , 2, 3 , 4, 5};
        HashSet <Integer> set  = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                // System.out.println(" ");
                // return;
            }
        }
        System.out.println(set);
        
    }
}
