//2256. Minimum Average Difference
public class MinAvgDiff {
    public int minimumAverageDifference(int[] nums) {
        long totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        long minDiff = Long.MAX_VALUE;
        int answer = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            leftSum += nums[i];

            long leftAvg = leftSum / (i + 1);

            long rightAvg = 0;
            if (i != n - 1) {
                rightAvg = (totalSum - leftSum) / (n - i - 1);
            }

            long diff = Math.abs(leftAvg - rightAvg);

            if (diff < minDiff) {
                minDiff = diff;
                answer = i;
            }
        }

        return answer;
    }
}
