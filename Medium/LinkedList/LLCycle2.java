//142. Linked List Cycle II
public class LLCycle2  {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect whether a cycle exists
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Find where the cycle begins
        ListNode entry = head;

        while (entry != slow) {
            entry = entry.next;
            slow = slow.next;
        }

        return entry;
    }
}