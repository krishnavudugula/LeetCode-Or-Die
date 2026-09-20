import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static int maxOnes(int[] nums){
        int count = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(max, count);
            }
            else {
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxOnes(nums));
    }
}
