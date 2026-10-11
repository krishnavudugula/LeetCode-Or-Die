//75. Sort Colors
public class SortColors {
    public static void sortColors(int[] nums){
        
        //Approach 1 : Bubble Sort (X) -- O(n^2) so not needed


        //Approach 2: Counting Sort
        // int zeros = 0;
        // int ones = 0;
        // int twos = 0;

        // for(int i=0; i<nums.length; i++){ //or for(int num: nums){ if(num == 0)}
        //     if(nums[i] == 0){
        //         zeros++;
        //     }
        //     else if(nums[i] == 1){
        //         ones++;
        //     }
        //     else {
        //         twos++;
        //     }
        // }

        // int index = 0;

        // while(zeros > 0){
        //     nums[index++] = 0;
        //     zeros--; 
        // }

        // while(ones > 0){
        //     nums[index++] = 1;
        //     ones--;
        // }

        // while(twos > 0){
        //     nums[index++] = 2;
        //     twos--;
        // }


        //Two-way partitioning
        // int left = 0;
        // int right = nums.length - 1;
        // int i = 0;

        // while (i <= right) {
        //     if (nums[i] == 0) {
        //         int temp = nums[left];
        //         nums[left] = nums[i];
        //         nums[i] = temp;

        //         left++;
        //         i++;
        //     }
        //     else if (nums[i] == 2) {
        //         int temp = nums[right];
        //         nums[right] = nums[i];
        //         nums[i] = temp;

        //         right--;

        //         // Do not increment i here!
        //         // The swapped-in value is unexamined.
        //     }
        //     else {
        //         // nums[i] == 1
        //         i++;
        //     }
        // }


        //Approach 4 - Dutch National Flag
        int low = 0;
        int mid = 0;
        int high = nums.length -1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                high--;
            }
        }
    }
}