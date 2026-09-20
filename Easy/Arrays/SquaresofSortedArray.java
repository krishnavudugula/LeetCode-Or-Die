//977. Squares of a Sorted Array
import java.util.Arrays;
import java.util.Scanner;
public class SquaresofSortedArray {
    public static int[] squareofArray(int[] nums){
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length; i++){
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(squareofArray(nums)));
    }
}
