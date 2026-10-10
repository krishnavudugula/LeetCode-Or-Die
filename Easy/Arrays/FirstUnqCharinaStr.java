//387. First Unique Character in a String
import java.util.*;
public class FirstUnqCharinaStr {
    public static int firstUniqueChar(String s) {
        HashMap<Character, Integer> check = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(check.containsKey(ch)) {
                check.put(ch, check.get(ch) + 1);
            }
            else {
                check.put(ch, 1);
            }
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(check.get(ch) == 1) {
                return i;
            }
        }
        return -1;
    }
}
