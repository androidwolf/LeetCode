package _160.IntersectionofTwoLinkedLists;

public class _160IntersectionofTwoLinkedLists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		ListNode newHeadA = reverse1(headA);
		ListNode newHeadB = reverse1(headB);
		ListNode p1 = newHeadA, p2 = newHeadB, p3 = null;
		while (p1 != null && p2 != null) {
			if (p1.val == p2.val) {
				p3 = p1;
				p1 = p1.next;
				p2 = p2.next;
			} else
				break;
		}

		return p3;
	}

	public ListNode reverse1(ListNode head) {
		// 当为空或者本节点为末尾节点的时候
		if (head == null || head.next == null)
			return head;
		ListNode temp = head.next;
		ListNode reversedHead = reverse1(head.next);
		// 获取先前的下一个节点，让该节点指向自身
		temp.next = head;
		// 破坏以前自己指向下一个节点
		head.next = null;
		// 层层传递给最上面的
		return reversedHead;
	}

	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		// get the tail of list A.
		ListNode node = headA;
		while (node.next != null) {
			node = node.next;
		}
		node.next = headB;
		ListNode result = listCycleII(headA);
		node.next = null;
		return result;
	}

	private ListNode listCycleII(ListNode head) {
		ListNode slow = head, fast = head.next;

		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return null;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		slow = head;
		fast = fast.next;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode p1 = new ListNode(1);
		ListNode p2 = new ListNode(2);
		ListNode p3 = new ListNode(3);
		ListNode p4 = new ListNode(4);
		ListNode temp;
		head.next = p1;
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		p4.next = null;
		ListNode head2 = new ListNode(0);
		ListNode q1 = new ListNode(2);
		ListNode q2 = new ListNode(3);
		ListNode q3 = new ListNode(3);
		ListNode q4 = new ListNode(3);
		ListNode q5 = new ListNode(4);
		head2.next = q1;
		q1.next = q2;
		q2.next = q3;
		q3.next = q4;
		q4.next = q5;
		q5.next = null;

		temp = new _160IntersectionofTwoLinkedLists().getIntersectionNode1(
				head, head2);

		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
