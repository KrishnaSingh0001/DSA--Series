public class kadansAlgorithm {

    public static int maxSubArrays(int nums[]) {
        int maxSum = nums[0];
        int currentSum =0;

        for(int i = 0; i<nums.length ; i++){
            currentSum += nums[i];

            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {1 , 2, 3 , -1 , -5 , -6 , 5 , 6  , 7};
        // int result = obj.maxSumArrays(nums);
        System.out.println("The Max SubArrrays Sum is : " + maxSubArrays(nums));
    }
}
