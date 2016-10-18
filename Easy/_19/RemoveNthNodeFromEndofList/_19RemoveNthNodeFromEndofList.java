package _19.RemoveNthNodeFromEndofList;

public class _19RemoveNthNodeFromEndofList {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return null;
		if (head.next == null)
			return null;
		ListNode p1, p2;
		int flag = 1;
		p1 = p2 = head;
		for (int i = 0; i < n; i++) {
			if (p2.next != null)
				p2 = p2.next;
			else
				flag = 0;
		}
		if (flag == 0) {
			head = head.next;
		} else {
			while (p2.next != null) {
				p1 = p1.next;
				p2 = p2.next;
			}
			p1.next = p1.next.next;
		}
		return head;
	}

	public static void main(String[] args) {
	}
}
