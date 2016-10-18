package _141.LinkedListCycle;

import java.util.HashSet;
import java.util.Set;

public class _141LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		Set<ListNode> set = new HashSet<ListNode>();
		set.add(head);
		ListNode p = head.next;
		while (p != null) {
			if (set.contains(p)) {
				return true;
			} else {
				set.add(p);
			}
			p = p.next;
		}
		return false;
	}

	public Boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast, slow;
        fast = head.next;
        slow = head;
        while (fast != slow) {
            if(fast==null || fast.next==null)
                return false;
            fast = fast.next.next;
            slow = slow.next;
        } 
        return true;
    }
	
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		head.next = head;
		System.out.println(new _141LinkedListCycle().hasCycle(head));
	}
}
