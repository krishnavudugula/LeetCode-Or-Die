//977. Squares of a Sorted Array
import java.util.*;
public class SquaresofSortedArray {
    public static int[] squareofArray(int[] nums){
        // int result[] = new int[nums.length];
        // for(int i=0;i<nums.length; i++){ //TC : n
        //     result[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(result); //nlogn
        // return result;

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        for(int i=n-1; i>=0; i--){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare){
                result[i] = leftSquare;
                left++;
            } else{
                result[i] = rightSquare;
                right--;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums = new int[m];
        for(int i=0; i<m; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(squareofArray(nums)));
    }
}
