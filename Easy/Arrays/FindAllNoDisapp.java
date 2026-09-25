//448. Find All Numbers Disappeared in an Array
import java.util.*;
public class FindAllNoDisapp {
    public static List<Integer> findAllNoDisap(int[] nums){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                res.add(i + 1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println((findAllNoDisap(nums)));
    }
}
