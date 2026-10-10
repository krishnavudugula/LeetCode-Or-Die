//3591. Check if Any Element Has Prime Frequency
import java.util.*;
public class CheckIfAnyEleHasPrimeFreq {
    public boolean checkIfEleHasPrimeFreq(int[] nums){
        HashMap<Integer,Integer> check = new HashMap<>();

        for(int num : nums) {
            check.put(num, check.getOrDefault(num,0)+ 1);
        }

        for(int num: nums) {
            if(isPrime(num)){
                return true;
            }
        }
        return false;
    }
        public boolean isPrime(int n) {
            if(n < 2){
                return false;
            }
            for(int i=2; i*i<= n; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
}
