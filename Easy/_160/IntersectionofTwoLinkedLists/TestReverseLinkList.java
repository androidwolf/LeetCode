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
		// ��Ϊ�ջ��߱��ڵ�Ϊĩβ�ڵ��ʱ��
		if (head == null || head.next == null)
			return head;
		ListNode temp = head.next;
		ListNode reversedHead = reverse1(head.next);
		// ��ȡ��ǰ����һ���ڵ㣬�øýڵ�ָ������
		temp.next = head;
		// �ƻ���ǰ�Լ�ָ����һ���ڵ�
		head.next = null;
		// ��㴫�ݸ��������
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
			// ��֮ǰ���ҵ�ԭʼ����һ���ڵ�
			next = cur.next;
			// ��������
			cur.next = pre;
			// �����ڵ�ͬʱ����
			pre = cur;
			cur = next;
		}
		// ��ԭ�����ͷ�ڵ����һ���ڵ���Ϊnull���ٽ���ת���ͷ�ڵ㸳��head
		head.next = null;
		head = pre;
		return head;
	}

	public ListNode reverse3(ListNode head) {
		ListNode p = head, q = null, front = null;
		while (p != null) {
			q = p.next;// ����q��p���ĺ�̽��,����q������p�ĺ�̽��
			p.next = front;// ��ת,��ʹp.nextָ��p����ǰ�����
			front = p;// front�����һ��
			p = q;// p�����һ��
		}
		head = front;// headָ��ԭ��������һ����㣬�����ת
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
