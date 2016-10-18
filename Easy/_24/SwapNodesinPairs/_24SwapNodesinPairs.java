package _24.SwapNodesinPairs;

import java.util.ArrayList;

public class _24SwapNodesinPairs {

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode p1 = head, p2 = head.next, p = new ListNode(0);
		head = p2;
		while (p1 != null && p2 != null) {
			System.out.println("p1  " + p1.val + "-- p2   " + p2.val);
			p.next = p2;
			p1.next = p2.next;
			p2.next = p1;
			p = p1;
			p1 = p1.next;
			if (p1 == null)
				return head;
			p2 = p1.next;
			if (p2 == null)
				return head;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode p1 = new ListNode(2);
		ListNode p2 = new ListNode(3);
		ListNode p3 = new ListNode(4);
		ListNode p4 = new ListNode(5);
		ListNode p5 = new ListNode(6);
		head.next = p1;
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		p4.next = p5;
		p5.next = null;
		ListNode ln = new _24SwapNodesinPairs().swapPairs(head);
		while (ln != null) {
			System.out.println(ln.val);
			ln = ln.next;
		}
	}
}
