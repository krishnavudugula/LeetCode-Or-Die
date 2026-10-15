//242. Valid Anagram

import java.util.Arrays;

public class ValidAnagrams {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        // if(a == b){
        //     return true;
        // } Doesnt work 
        return Arrays.equals(a,b);
    } 
}