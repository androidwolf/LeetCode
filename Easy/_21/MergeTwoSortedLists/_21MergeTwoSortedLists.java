package _21.MergeTwoSortedLists;

public class _21MergeTwoSortedLists {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		ListNode ln = new ListNode(0);
		ListNode temp = ln;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				temp.next = l1;
				l1 = l1.next;
			} else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		if (l1 == null && l2 != null) {
			temp.next = l2;
		}
		if (l2 == null && l1 != null) {
			temp.next = l1;
		}
		return ln.next;
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null && l2 != null)
			return l2;
		if (l1 != null && l2 == null)
			return l1;
		ListNode p2 = l1, p1 = l2, p3 = l1;
		while (p1 != null && p2 != null) {
			while (p1.val > p2.val) {
				p3 = p1;
				p1 = p1.next;
			}
			p1 = p2.next;
			p2.next = p3.next;
			p3.next = p2;
			p2 = p1;
			p1 = p3.next.next;
		}

		if (p1 == null && p2 != null) {
			p3.next.next = p2;
		}

		return l1;
	}

	public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode lastNode = dummy;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				lastNode.next = l1;
				l1 = l1.next;
			} else {
				lastNode.next = l2;
				l2 = l2.next;
			}
			lastNode = lastNode.next;
		}

		if (l1 != null) {
			lastNode.next = l1;
		} else {
			lastNode.next = l2;
		}

		return dummy.next;
	}

	public static void main(String[] args) {

	}
}
