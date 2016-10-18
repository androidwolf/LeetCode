package _155.MinStack;

public class _155MinStack {

	ListNode head, current, pre;

	class ListNode {
		int val;
		ListNode pre;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	/** initialize your data structure here. */
	public _155MinStack() {

	}

	public void push(int x) {
		if (head == null) {
			head = new ListNode(x);
			head.pre = null;
			head.next = null;
			pre = head;
		} else {
			current = new ListNode(x);
			current.pre = pre;
			current.next = null;
			pre.next = current;
		}
	}

	public void pop() {
		if (current.pre != null) {
			current.pre.next = null;
			current = current.pre;
		}
	}

	public int top() {
		return current.val;
	}

	public int getMin() {
		ListNode p = head;
		int min = p.val;
		while (p.next != null) {
			if (p.val > p.next.val) {
				min = p.next.val;
			}
		}
		return min;
	}

	/**
	 * Your MinStack object will be instantiated and called as such: MinStack
	 * obj = new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */

	public static void main(String[] args) {
	}
}
