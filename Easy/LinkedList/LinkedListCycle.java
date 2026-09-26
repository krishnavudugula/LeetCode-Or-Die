//141. Linked List Cycle
public class LinkedListCycle {
    public boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
