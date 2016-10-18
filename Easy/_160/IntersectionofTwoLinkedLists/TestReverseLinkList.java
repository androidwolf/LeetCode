package _160.IntersectionofTwoLinkedLists;

public class TestReverseLinkList {

	public ListNode reverse(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode tail = null;
		ListNode temp = head.next;
		tail = reverse1(head.next);
		temp.next = head;
		head.next = null;
		return tail;
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

	public ListNode reverse2(ListNode head) {
		if (null == head) {
			return head;
		}
		ListNode pre = head;
		ListNode cur = head.next;
		ListNode next;

		while (cur != null) {
			// 断之前先找到原始的下一个节点
			next = cur.next;
			// 逆序连接
			cur.next = pre;
			// 两个节点同时滑动
			pre = cur;
			cur = next;
		}
		// 将原链表的头节点的下一个节点置为null，再将反转后的头节点赋给head
		head.next = null;
		head = pre;
		return head;
	}

	public ListNode reverse3(ListNode head) {
		ListNode p = head, q = null, front = null;
		while (p != null) {
			q = p.next;// 设置q是p结点的后继结点,即用q来保持p的后继结点
			p.next = front;// 逆转,即使p.next指向p结点的前驱结点
			front = p;// front向后移一步
			p = q;// p向后移一步
		}
		head = front;// head指向原链表的最后一个结点，完成逆转
		return head;
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

		temp = new TestReverseLinkList().reverse1(head);
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

}
