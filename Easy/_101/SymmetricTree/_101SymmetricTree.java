package _101.SymmetricTree;

import java.util.LinkedList;
import java.util.Queue;

public class _101SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return testSymmetric(root.left, root.right);
	}

	public boolean testSymmetric(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return true;
		if ((left == null && right != null) || (left != null && right == null))
			return false;
		if (left != null && right != null && left.val != right.val)
			return false;
		return testSymmetric(left.left, right.right)
				&& testSymmetric(left.right, right.left);
	}

	public boolean isSymmetric1(TreeNode root) {
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    q.add(root);
	    q.add(root);
	    while (!q.isEmpty()) {
	        TreeNode t1 = q.poll();
	        TreeNode t2 = q.poll();
	        if (t1 == null && t2 == null) continue;
	        if (t1 == null || t2 == null) return false;
	        if (t1.val != t2.val) return false;
	        q.add(t1.left);
	        q.add(t2.right);
	        q.add(t1.right);
	        q.add(t2.left);
	    }
	    return true;
	}
	
	public static void main(String[] args) {
	}
}
