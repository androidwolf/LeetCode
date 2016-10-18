package _107.BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class _107BinaryTreeLevelOrderTraversalII {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null)
			return list;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int sum = 1, i = 1;
		while (!queue.isEmpty()) {
			TreeNode t1 = queue.poll();
			System.out.println(t1.val);
			list1.add(t1.val);
			if (sum == Math.pow(2, i) - 1) {
				list.add(list1);
				list1 = new ArrayList<Integer>();
				i++;
			}
			if (t1.left != null)
				queue.add(t1.left);
			if (t1.right != null)
				queue.add(t1.right);
			sum += 2;
		}
		if (!list1.isEmpty()) {
			list.add(list1);
		}
		return list;
	}

	public List<List<Integer>> levelOrder1(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null)
			return list;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Stack<List<Integer>> stack = new Stack<List<Integer>>();
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> list1 = new ArrayList<Integer>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode t1 = queue.poll();
				list1.add(t1.val);
				if (t1.left != null)
					queue.add(t1.left);
				if (t1.right != null)
					queue.add(t1.right);
			}
			//list.add(list1);
			stack.push(list1);
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		//Collections.reverse(list);
		return list;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode t1 = new TreeNode(9);
		TreeNode t2 = new TreeNode(20);
		TreeNode t23 = new TreeNode(10);
		TreeNode t24 = new TreeNode(7);
		root.left = t1;
		root.right = t2;
		t1.left = null;
		t1.right = null;
		t2.left = t23;
		t2.right = t24;
	}
}
