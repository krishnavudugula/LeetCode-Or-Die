//88. Merge Sorted Array
import java.util.*;
public class MergeSortA {
    public static int[] mergeArray(int[] nums1, int[] nums2, int m , int n){
        int[] res = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                res[k] = nums1[i];
                i++;
            }
            else {
                res[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            res[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n){
            res[k] = nums2[j];
            j++;
            k++;
        }

        for (int x = 0; x < m + n; x++) {
            nums1[x] = res[x];
        }
        return nums1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];

        for(int i=0; i<m+n; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i=0; i<n;i++ ){
            nums2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(mergeArray(nums1, nums2, m, n)));
    }
}
