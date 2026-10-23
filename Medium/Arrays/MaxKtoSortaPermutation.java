//3644. Maximum K to Sort a Permutation


public class MaxKtoSortaPermutation {
    public int sortPermutation(int[] nums) {
        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                ans &= nums[i];
            }
        }

        return Math.max(ans, 0);
    } 
}
