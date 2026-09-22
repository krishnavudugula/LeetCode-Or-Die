import java.util.Arrays;

public class MedianofSA {
    public static double findMedianSortedArray(int[] nums1, int[] nums2){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[nums1.length + nums2.length];
        while(i<nums1.length && j<nums2.length){

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

        //left over elements are arranged and placed
        while(i<nums1.length){
            res[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            res[k] = nums2[j];
            j++;
            k++;
        }

        if(res.length % 2 == 1){
            return res[res.length / 2];
        }
        else {
            return (res[(res.length / 2 - 1)] + res[res.length / 2]) / 2.0;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,3,6};
        int[] nums2 = {2,4,5};
        System.out.println((findMedianSortedArray(nums1, nums2)));
    }
}
