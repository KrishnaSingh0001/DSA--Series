import java.util.*;
public class Question2 {
    public static int main(String [] args ) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int sum =0 ;
        for(int i = 1 ; i< nums ; i++){
            if(nums %i ==0){
                sum +=i;
            }

        }
        return sum=nums;
    }
}
