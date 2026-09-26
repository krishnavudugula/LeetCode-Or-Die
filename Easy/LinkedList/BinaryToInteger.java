//1290. Convert Binary Number in a Linked List to Integer
import java.util.*;
public class BinaryToInteger {
    public static int getDecimalValue(ListNode head){
        ListNode current = head;
        int result = 0;
        while(current != null){
            result = result * 2 + current.val;
            current = current.next;
        }
        return result;
    }
}
