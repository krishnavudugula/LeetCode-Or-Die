//1346. Check If N and Its Double Exist
import java.util.*;
public class CheckIfExists {
    public static boolean checkIfExists(int[] arr){
        Set <Integer> s1 = new HashSet<>();

        for(int num : arr){
            if(s1.contains(2 * num) || num % 2 ==0 && s1.contains(num / 2)){
                return true;
            }
            // if(num % 2 == 0 && s1.contains(num / 2)){
            //     return true;
            //}
            s1.add(num);
        }
        return false;
    }
}
