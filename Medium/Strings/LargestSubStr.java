import java.util.*;
//3. Longest Substring Without Repeating Characters
public class LargestSubStr {
   public static void main(String[] args) {
      String str = "abcabcbb";
      System.out.println(str);
      char[] c = str.toCharArray();
      int i = 0;
      int max = 0;
      Set <Character> c1 = new HashSet<>();
      for(int j=0; j<c.length; j++){
         while(c1.contains(c[j])){
            c1.remove(c[i]);
            i++;
         }
         c1.add(c[j]);
         max = Math.max(max, j - i + 1);
      }
      System.out.println(max);
   }
}
