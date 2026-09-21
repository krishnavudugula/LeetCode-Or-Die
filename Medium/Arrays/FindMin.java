//153. Find Minimum in Rotated Sorted Array - RTP : O(logn)
import java.util.*;
public class FindMin {
    public static int findMin(int[] nums){
        // int min = nums[0];

        // for(int i =1; i<nums.length; i++){
        //     if(nums[i] < min){
        //         min = nums[i];
        //     }
        // }    
        // return min;       //----------> But O(n) TC
        int m = nums.length;
        int left = 0;
        int right = m - 1;

        while(left < right){
            int mid = ( left + right ) / 2; //But java int can only hold up to : 2,147,483,647.
            if(nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return nums[left];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findMin(nums));
    }
}
