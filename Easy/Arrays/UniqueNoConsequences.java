//1207. Unique Number of Occurrences
import java.util.*;
public class UniqueNoConsequences {
    public boolean uniqueConsequences(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int digit : arr) {
            freq.put(digit, freq.getOrDefault(digit, 0) + 1);
        }

        HashSet<Integer> occurrences = new HashSet<>();
        for (int count : freq.values()) {
            if (!occurrences.add(count)) {
                return false;
            }
        }

        return true;
    }
}
