import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] A = s.toCharArray();
        int max = 0;
        Set <Character> s1 = new HashSet<>(); 
        int i = 0;
        for(int j = 0; j < A.length; j++){
            while(s1.contains(A[j])){
                s1.remove(A[i]);
                i++;
            }
            s1.add(A[j]);
            max = Math.max(max, j - i + 1);
        }  
        return max;
    }
}