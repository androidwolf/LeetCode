package _206.ReverseLinkedList;

public class _206ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode temp = head.next;
		ListNode reverseHead = reverseList(head.next);
		temp.next = head;
		head.next = null;
		return reverseHead;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode p1 = new ListNode(1);
		ListNode p2 = new ListNode(2);
		ListNode p3 = new ListNode(3);
		ListNode p4 = new ListNode(4);
		ListNode p5 = new ListNode(5);
		head.next = p1;
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		p4.next = p5;
		ListNode p = head;
		while (head!=null) {
			System.out.print(head.val);
			head = head.next;
		}
		System.out.println("----");
		head = new _206ReverseLinkedList().reverseList(p);
		while (head!=null) {
			System.out.print(head.val);
			head = head.next;
		}
	}
}
