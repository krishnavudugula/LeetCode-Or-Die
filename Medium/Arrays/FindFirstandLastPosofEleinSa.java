//34. Find First and Last Position of Element in Sorted Array
public class FindFirstandLastPosofEleinSa {
    public int[] searchRange(int[] nums, int target){
        int first = -1;
        int last = -1;

        //Find first occurrence
        int left = 0;
        int right = nums.length - 1;

        while(left<=right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                first=  mid;
                right = mid - 1;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        //Find last occurrence
        left = 0;
        right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left)/2;

            if(nums[mid] == target) {
                last = mid;
                left = mid + 1; //keep looking right
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return new int[]{first,last};
    }
}