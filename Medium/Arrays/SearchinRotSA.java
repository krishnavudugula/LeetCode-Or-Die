//33. Search in Rotated Sorted Array
import java.util.*;
public class SearchinRotSA {
    public static int search(int[] nums, int target){
        int n = nums.length;
        int left=  0;
        int right = n -1;
        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }
            //Left Half is sorted
            if(nums[left] <= nums[mid]) {
                if(nums[left] <= target && target < nums[mid]){
                    right = mid--;
                } else {
                    left = mid++;
                }
            }
            else {
                if(nums[mid] < target && target <= nums[right]){
                    left = mid++;
                } else {
                    right = mid--;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums = new int[m];
        for(int i=0; i<m; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(nums, target));
    }
}
