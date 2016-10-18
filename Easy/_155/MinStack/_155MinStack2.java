package _155.MinStack;

import java.util.Stack;

public class _155MinStack2 {

	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	/** initialize your data structure here. */
	public _155MinStack2() {
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}

	public void push(int x) {
		stack.push(x);
		if (minStack.isEmpty()) {
			minStack.push(x);
		} else {
			if (minStack.peek() >= x)
				minStack.push(x);
		}
	}

	public void pop() {
		if (!stack.isEmpty()) {
			// 判断对象相等用equals
			if (stack.peek().equals(minStack.peek())) {
				minStack.pop();
			}
			stack.pop();
		}
	}

	public int top() {
		if (!stack.isEmpty())
			return stack.peek();
		return 0;
	}

	public int getMin() {
		if (!minStack.isEmpty())
			return minStack.peek();
		return 0;
	}

	/**
	 * Your MinStack object will be instantiated and called as such: MinStack
	 * obj = new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */

	public static void main(String[] args) {
		
	}
}
