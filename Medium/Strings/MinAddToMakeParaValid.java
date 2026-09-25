//921. Minimum Add to Make Parentheses Valid
import java.util.*;
public class MinAddToMakeParaValid {
    public static int minAddToMakeValid(String s){
        Stack <Character> stack = new Stack<>();
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){
                    count++;
                }
                else{
                    stack.pop();
                }
            }
        }
        count += stack.size();
        return count;
    }
}