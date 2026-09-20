//238. Product of Array Except Self
import java.util.*;
public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int LSA[] = new int[n];
        int RSA[] = new int[n];
        int[] res = new int[n];
        LSA[0] = 1;
        RSA[n-1] = 1;

        for(int i=1; i<n; i++){
            LSA[i] = LSA[i-1] * nums[i-1];
        }
        for(int i=n-2; i>=0; i--){
            RSA[i] = RSA[i+1] * nums[i+1];
        }
        for(int i=0; i<n; i++){
            res[i] = LSA[i] * RSA[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums = new int[m];

        for(int i=0; i<m; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
