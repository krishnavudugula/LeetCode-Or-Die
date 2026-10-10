//1207. Unique Number of Occurrences
import java.util.*;
public class UniqueNoConsequences {
    public boolean uniqueConsequences(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        // for (int digit : arr) {
        //     freq.put(digit, freq.getOrDefault(digit, 0) + 1);
        // }

        // HashSet<Integer> occurrences = new HashSet<>();
        // for (int count : freq.values()) {
        //     if (!occurrences.add(count)) {
        //         return false;
        //     }
        // }

        // return true;


        for(int i=0; i<arr.length; i++) {
            int digit = arr[i];

            if(freq.containsKey(digit)) {
                freq.put(digit, freq.get(digit) + 1);
            }
            else {
                freq.put(digit, 1);
            }
        }
        HashSet<Integer> seen = new HashSet<>();
        for(int count: freq.values()) {
            if(seen.contains(count)){
                return false;
            }
            seen.add(count);
        }
        return true;
    }
}
