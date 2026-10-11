//1941. Check if All Characters Have Equal Number of Occurrences
import java.util.*;
public class CheckIfAllCharHaveEqualNoofOccurrences {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> check = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(check.containsKey(ch)) {
                check.put(ch, check.get(ch) + 1);
            }
            else {
                check.put(ch, 1);
            }
        }
        HashSet<Integer> seen = new HashSet<>(check.values());
        return seen.size() == 1;
    }
}