//1749. Maximum Absolute Sum of Any Subarray
public class MaxAbsSumOfAnySubArray {
    public int maxAbsoluteSum(int[] nums){
        int currentMin = nums[0];
        int currentMax = nums[0];

        int minSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++){
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            minSum = Math.min(minSum, currentMin);
            maxSum = Math.max(maxSum, currentMax);
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}
