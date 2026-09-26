//206. Reverse Linked List
public class ReverseLL {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode future = current.next;
            current.next = prev;
            prev = current;
            current = future;
        }
        return prev;
    }
}
