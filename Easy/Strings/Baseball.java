import java.util.*;
//682. Baseball Game
public class Baseball {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String oper : operations) {
            if(oper.equals("C")){
                stack.pop();
            }
            else if(oper.equals("D")){
                int last = stack.peek();
                stack.push(2 * last);
            }
            else if(oper.equals("+")){
                int last = stack.pop();
                int secondLast = stack.peek();

                stack.push(last);
                stack.push(last + secondLast);
            }
            else {
                stack.push(Integer.parseInt(oper));
            }
        }
        int total = 0;
        for(int score : stack){
            total += score;
        }
        return total;
    }
}

