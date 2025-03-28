import java.util.ArrayList;
public class subsetForArrays {
    static List<List<Integer>> arr;
    public static void printsubsetArrays(int i , int [] nums , ArrayList<Integer> ans ) {
        if(nums.length==i){
            // arr.add(ans);
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0 ; j<ans.size() ; j++ ){
                    list.add(ans.get(j));
            }

            arr.add(list);
            return ;

        }
        printsubsetArrays(i+1, nums, ans); // not take
        ans.add(nums[i]);
        printsubsetArrays(i+1, nums, ans);  // take
        ans.remove(ans.size()-1); 
 
        

    }
    public static void main(String[] args) {
        int nums [] = { 1 , 2, 3};
        ArrayList<Integer> ans = new ArrayList<>();
        printsubsetArrays(0, nums, ans);
        // System.out.println();
        return arr;

    }
    
}
