package College.ArraysCollege;

public class maxSubArrays1 {
    public static int  maxSubArray(int nums[] ){
        int maxsum = nums[0];
        int currentSum=0;
        for(int i=0 ; i < nums.length; i++){
            currentSum += nums[i];

            if(currentSum>maxsum){
                maxsum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxsum;
    }
    // int maxsum= nums[0];
    // int currentSumsum=0;
    public static void main(String[] args) {
        int nums[] = {3 , 6, 2, 1 , 9, 13 ,2 };
        System.out.println(" The Max SubArrrays Sum is : " + maxSubArray(nums));
    }
    
}

