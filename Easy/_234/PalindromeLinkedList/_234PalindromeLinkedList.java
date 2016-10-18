package _234.PalindromeLinkedList;

import java.util.Stack;

public class _234PalindromeLinkedList {

	
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;
		ListNode p1 = head;
		Stack<Integer> stack = new Stack<Integer>();
		int len = 0, i = 0;
		while (p1 != null) {
			len++;
			p1 = p1.next;
		}
		p1 = head;
		while (i++ < len / 2) {
			stack.push(p1.val);
			p1 = p1.next;
		}
		if (len % 2 != 0)
			p1 = p1.next;
		while (p1 != null) {
			if (p1.val != stack.pop())
				return false;
			p1 = p1.next;
		}
		return true;
	}

	public boolean isPalindrome1(ListNode head) {
        if (head == null) {
            return true;
        }
        
        ListNode middle = findMiddle(head);
        middle.next = reverse(middle.next);
        
        ListNode p1 = head, p2 = middle.next;
        while (p1 != null && p2 != null && p1.val == p2.val) {
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return p2 == null;
    }
    
    private ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        
        return prev;
    }
	
	
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode p1 = new ListNode(1);
		ListNode p2 = new ListNode(2);
		ListNode p3 = new ListNode(2);
		ListNode p4 = new ListNode(1);
		ListNode p5 = new ListNode(0);
		head.next = p1;
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		p4.next = p5;
		System.out.println(new _234PalindromeLinkedList().isPalindrome(head));
		while (head != null) {
			System.out.print(head.val);
			head = head.next;
		}

	}
}
