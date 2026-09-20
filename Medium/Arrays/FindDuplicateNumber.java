//287. Find Duplicate Number (There is only one repeated num).
import java.util.*;
public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums){
        Set <Integer> set = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;

        // for(int i=1; i<nums.length; i++){
        //     if(nums[i] == nums[i-1]){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // for(int num : nums){
        //     if(set.contains(num)){
        //         return num;
        //     }
        //     set.add(num);
        // }
        // return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(nums));
    }
}
