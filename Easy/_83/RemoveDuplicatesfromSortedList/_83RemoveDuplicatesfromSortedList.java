package _83.RemoveDuplicatesfromSortedList;

public class _83RemoveDuplicatesfromSortedList {

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return head;
		ListNode p1 = head;
		while (p1.next != null) {
			if (p1.val == p1.next.val) {
				p1.next = p1.next.next;
			} else {
				p1 = p1.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
	}
}
