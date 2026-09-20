//1295. Find Numbers with Even Number of Digits
import java.util.*;
public class NosWithEvenDigits {
    public static int findNumbers(int[] nums){
        int count = 0;
        // for (int num : nums){
        //     if(num % 2 == 0){
        //         count++;
        //     }                        ----> 
        // }                         
        // return count;
        for(int num : nums){
            int digits = 0;
            int temp = num;

            while(temp != 0){
                temp /= 10;
                digits++;
            }
            if(digits % 2 == 0){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findNumbers(nums));
    }
}
