//3843. First Element with Unique Frequency
import java.util.*;
public class FirstElementWUniqueFreq {
    public int firstEleWUniqueFreq(int[] nums){
        HashMap<Integer,Integer> check = new HashMap<>();

        for(int num : nums) {
            check.put(num, check.getOrDefault(num,0)+ 1);
        }

        HashMap<Integer, Integer> freqCount = new HashMap<>();
        for(int freq : check.values()){
            freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
        }

        for(int num: nums){
        int freq = check.get(num);
        
        if(freqCount.get(freq) == 1){
            return num;
        }
        }
        return -1;
    }
}
