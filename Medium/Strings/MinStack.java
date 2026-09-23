//155. Min Stack - RTP : O(1) TC
import java.util.*;
public class MinStack {
    Stack <Integer> s1;
    Stack <Integer> minStack;
    public MinStack(){
        s1 = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int value){
        s1.push(value);

        if(minStack.isEmpty()){
            minStack.push(value);
        } else {
            int currentMin = minStack.peek();

            if(value < currentMin){
                minStack.push(value);
            }
            else {
                minStack.push(currentMin);
            }
        }
    }
    public void pop(){
        s1.pop();
        minStack.pop();
    }
    public int top(){
        return s1.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
}
