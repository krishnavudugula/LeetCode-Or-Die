import java.util.*;
//217. Contains Duplicate
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        // Arrays.sort(nums);
        // int n = nums.length;
        // for(int i=0; i<n-1; i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }


        // for(int i=1; i<n; i++){
        //     if(nums[i] == nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;

        Set <Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums = new int[m];
        for(int i=0; i<m; i++){
            nums[i] = sc.nextInt();
        } 
        System.out.println(containsDuplicate(nums));
    }
}
