//1524. Number of Sub-arrays With Odd Sum

public class NoOfSubArrWOddSum {
    public int numOfSubarrays(int[] arr) {
        int even = 1;
        int odd = 0;
        int result = 0;
        int prefix = 0;
        int mod = 1000000007;

        for (int num : arr) {
            prefix += num;

            if (prefix % 2 == 0) {
                result = (result + odd) % mod;
                even++;
            } else {
                result = (result + even) % mod;
                odd++;
            }
        }

        return result;
    }
}
