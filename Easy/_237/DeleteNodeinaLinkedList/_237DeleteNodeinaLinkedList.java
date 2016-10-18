package _237.DeleteNodeinaLinkedList;

public class _237DeleteNodeinaLinkedList {

	public void deleteNode(ListNode node) {
		if (node == null || node.next == null)
			return;
		node.val = node.next.val;
		node.next = node.next.next;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode p1 = new ListNode(1);
		ListNode p2 = new ListNode(2);
		ListNode p3 = new ListNode(3);
		ListNode p4 = new ListNode(4);
		head.next = p1;
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		p4.next = null;
		ListNode p = new ListNode(3);
		new _237DeleteNodeinaLinkedList().deleteNode(p);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
