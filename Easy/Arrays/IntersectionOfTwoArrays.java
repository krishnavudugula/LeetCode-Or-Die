//349. Intersection of Two Arrays.
import java.util.*;
public class IntersectionOfTwoArrays {
    public static int[] intersectionOfArrays(int[] nums1, int[] nums2){
        Set <Integer> s1 = new HashSet<>();
        Set <Integer> s2 = new HashSet<>();

        for(int num : nums1){
            s1.add(num);
        }
        for(int num : nums2){
            s2.add(num);
        }

        int[] res = new int[s2.size()];
        int k = 0;

        for(int num: s1){
            if(s2.contains(num)){
                res[k] = num;
                k++;
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];

        for(int i=0; i<n; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            nums2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(intersectionOfArrays(nums1, nums2)));
    }
}
