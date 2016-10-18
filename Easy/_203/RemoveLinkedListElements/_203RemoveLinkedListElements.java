package _203.RemoveLinkedListElements;

public class _203RemoveLinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		while (head.val == val && head.next != null)
			head = head.next;
		if (head.val == val && head.next == null)
			return null;
		if (head.next != null) {
			ListNode temp = head, p = head.next;
			while (p != null) {
				if (p.val == val)
					temp.next = p.next;
				else
					temp = temp.next;
				p = temp.next;
			}
		}
		return head;
	}
	
	public ListNode removeElements1(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        while (head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        
        return dummy.next;
    }

	public static void main(String[] args) {
	}
}
