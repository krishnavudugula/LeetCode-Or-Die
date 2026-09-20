//268. Missing Numbers - ***distinct*** numbers in the range [0, n]
import java.util.*;
public class MissingNumber {
    public static int missingNumber(int[] nums){
        int result = nums.length;
        for(int i=0; i<nums.length; i++){
            result ^= i;
            result ^= nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(missingNumber(nums));
    }
}
