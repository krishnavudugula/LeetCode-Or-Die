//53. Maximum Subarray
import java.util.*;
public class MaxSubArray {
    public static int maxSubArray(int[] nums){
        int n = nums.length;
        for(int i=1; i<n; i++){
            nums[i] = Math.max(nums[i], nums[i] + nums[i-1]);
        }
        int max = nums[0];

        for(int i=0; i<n; i++){
            max = Math.max(max,nums[i]);
        }
        return max;
    }
}
