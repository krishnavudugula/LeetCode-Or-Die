//2747. Count Zero Request Servers

import java.util.Arrays;
import java.util.HashMap;

public class CountZeroReqServers {
    
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        Integer[] order = new Integer[queries.length];

        for (int i = 0; i < queries.length; i++) {
            order[i] = i;
        }

        Arrays.sort(order, (a, b) ->
            Integer.compare(queries[a], queries[b])
        );

        int[] ans = new int[queries.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;

        for (int idx : order) {

            int q = queries[idx];
            int start = q - x;

            while (right < logs.length && logs[right][1] <= q) {

                int server = logs[right][0];

                map.put(server, map.getOrDefault(server, 0) + 1);

                right++;
            }

            while (left < right && logs[left][1] < start) {

                int server = logs[left][0];

                map.put(server, map.get(server) - 1);

                if (map.get(server) == 0) {
                    map.remove(server);
                }

                left++;
            }

            ans[idx] = n - map.size();
        }

        return ans;
    }
}
