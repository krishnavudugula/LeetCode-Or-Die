//1122. Relative Sort Array
import java.util.*;
public class RelativeSortArr {
    
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        for (int num : arr2) {
            int count = freq.getOrDefault(num, 0);

            for (int i = 0; i < count; i++) {
                arr1[index++] = num;
            }

            freq.remove(num);
        }

        List<Integer> remaining = new ArrayList<>();

        for (int num : freq.keySet()) {
            for (int i = 0; i < freq.get(num); i++) {
                remaining.add(num);
            }
        }
        Collections.sort(remaining);

        for (int num : remaining) {
            arr1[index++] = num;
        }

        return arr1;
    }
}
