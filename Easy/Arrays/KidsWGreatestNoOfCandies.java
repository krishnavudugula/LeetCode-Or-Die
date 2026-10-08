//1431. Kids With the Greatest Number of Candies
import java.util.*;
public class KidsWGreatestNoOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // boolean[] result = new boolean[candies.length];
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i=0; i<candies.length; i++){
            max = Math.max(max, candies[i]);
        }

        for(int i=0; i<candies.length; i++){
            result.add(candies[i] + extraCandies >= max);
        }
        
//         for (int i = 0; i < candies.length; i++) {
//     result[i] = candies[i] + extraCandies >= max;
// }

        return result;
    }
}
