//283. Move Zeroes
import java.util.*;
public class MoveZeroes {
    public static int[] moveZeroes(int[] nums){
        int j = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=j; i<nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
