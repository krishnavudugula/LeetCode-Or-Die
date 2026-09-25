//414. Third Maximum Number
import java.util.*;
public class ThirdMaxNo {
    public static int thirdMaxNo(int[] nums){
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for(int num : nums){
            if(num == first || num == second || num == third){
                continue;
            }

            if(num > first){
                third = second;
                second = first;
                first = num;
            }
            else if(num > second){ 
                third = second;
                second = num;
            }
            else if(num > third){
                third = num;
            }
        }
        if(third == Long.MIN_VALUE){
            return (int) first;
        }
        return (int) third;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        
        System.out.println(thirdMaxNo(nums));
    }
}
