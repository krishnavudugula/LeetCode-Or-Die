//3505. Minimum Operations to Make Elements Within K Subarrays Equal

import java.util.Arrays;
import java.util.TreeMap;

public class MinOperToMakeEleWithinKSubArrEqual {
    
    class WindowMedian {
        TreeMap<Integer, Integer> low = new TreeMap<>();
        TreeMap<Integer, Integer> high = new TreeMap<>();

        int lowSize = 0;
        int highSize = 0;

        long lowSum = 0;
        long highSum = 0;

        void add(int num) {
            if (low.isEmpty() || num <= low.lastKey()) {
                low.merge(num, 1, Integer::sum);
                lowSize++;
                lowSum += num;
            } else {
                high.merge(num, 1, Integer::sum);
                highSize++;
                highSum += num;
            }

            balance();
        }

        void remove(int num) {
            if (low.containsKey(num)) {
                removeValue(low, num);
                lowSize--;
                lowSum -= num;
            } else {
                removeValue(high, num);
                highSize--;
                highSum -= num;
            }

            balance();
        }

        void removeValue(TreeMap<Integer, Integer> map, int num) {
            int count = map.get(num);

            if (count == 1) {
                map.remove(num);
            } else {
                map.put(num, count - 1);
            }
        }

        void balance() {
            int target = (lowSize + highSize + 1) / 2;

            while (lowSize > target) {
                int num = low.lastKey();
                removeValue(low, num);
                lowSize--;
                lowSum -= num;

                high.merge(num, 1, Integer::sum);
                highSize++;
                highSum += num;
            }

            while (lowSize < target) {
                int num = high.firstKey();
                removeValue(high, num);
                highSize--;
                highSum -= num;

                low.merge(num, 1, Integer::sum);
                lowSize++;
                lowSum += num;
            }
        }

        long getCost() {
            long median = low.lastKey();

            return median * lowSize - lowSum
                 + highSum - median * highSize;
        }
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;
        int windows = n - x + 1;

        long[] cost = new long[windows];

        WindowMedian wm = new WindowMedian();

        for (int i = 0; i < x; i++) {
            wm.add(nums[i]);
        }

        cost[0] = wm.getCost();

        for (int i = x; i < n; i++) {
            wm.remove(nums[i - x]);
            wm.add(nums[i]);

            cost[i - x + 1] = wm.getCost();
        }

        long INF = Long.MAX_VALUE / 4;

        long[][] dp = new long[k + 1][n + 1];

        for (int j = 1; j <= k; j++) {
            Arrays.fill(dp[j], INF);
        }

        for (int j = 1; j <= k; j++) {

            for (int i = 1; i <= n; i++) {

                dp[j][i] = dp[j][i - 1];

                if (i >= x && dp[j - 1][i - x] != INF) {

                    dp[j][i] = Math.min(
                        dp[j][i],
                        dp[j - 1][i - x] + cost[i - x]
                    );
                }
            }
        }

        return dp[k][n];
    }
}
