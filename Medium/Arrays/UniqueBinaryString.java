//1980. Find Unique Binary String
import java.util.*;
public class UniqueBinaryString {
    public static String uniqueBinaryString(String[] nums){
        StringBuilder s = new StringBuilder();

        for(int i=0; i<nums.length; i++){
            if(nums[i].charAt(i) == '0'){
                s.append('1');
            }
            else {
                s.append('0');
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nums = new String[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.next();
        }
        System.out.println(uniqueBinaryString(nums));;
    }
}
