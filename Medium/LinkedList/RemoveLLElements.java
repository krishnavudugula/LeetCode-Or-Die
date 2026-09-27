//203. Remove Linked List Elements
public class RemoveLLElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        // Remove leading nodes with the target value
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Skip the node with the target value
            } else {
                current = current.next; // Move to the next node
            }
        }

        return head;
    }
}
