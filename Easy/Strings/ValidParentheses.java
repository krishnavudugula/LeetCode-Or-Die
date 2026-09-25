//20. Valid Parantheses.
import java.util.*;
public class ValidParentheses {
    public static boolean validParentheses(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            }

            else {
                if(stack.isEmpty()){
                    return false;
                }
                int top = stack.peek();

                if(c == ')' && top != '('){
                    return false;
                }
                if(c == '}' && top != '{'){
                    return false;
                }
                if(c == ']' && top != '['){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(validParantheses(s));
    }
}