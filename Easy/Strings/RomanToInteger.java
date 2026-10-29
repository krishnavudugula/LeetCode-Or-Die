//13. Roman to Integer
import java.util.HashMap;
public class RomanToInteger {
    public static int romanToInteger(String s){
        HashMap<Character, Integer> romans = new HashMap<>();

        romans.put('I', 1); //Also we can proceed with Arrays method.. (But it should have two arrays)
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int total = 0;

        for(int i=0; i<s.length(); i++){
            int current = romans.get(s.charAt(i));

            if(i + 1 < s.length() && current < romans.get(s.charAt(i + 1))){
                total -= current;
            }
            else {
                total += current;
            }
        }
        return total;
    }
}
