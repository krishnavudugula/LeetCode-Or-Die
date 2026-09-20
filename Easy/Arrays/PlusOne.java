//66. Plus One
import java.util.*;
public class PlusOne {
    public static int[] plusOne(int[] nums){
        for(int i=nums.length - 1; i>=0; i--){
            if(nums[i] < 9){
                nums[i] += 1;
                return nums;
            }
            nums[i] = 0; //else
        }
        int[] res = new int[nums.length + 1]; //initially all values are zero - [0, 0, 0, 0, .. n] (for n size)
        res[0] = 1; //setting first index value as '1'

        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
