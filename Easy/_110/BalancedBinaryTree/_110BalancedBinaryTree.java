package _110.BalancedBinaryTree;

public class _110BalancedBinaryTree {

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		if (root.left == null && root.right == null)
			return true;
		if (root.left == null && root.right != null && root.right.left == null
				&& root.right.right == null)
			return true;
		if (root.left != null && root.right == null && root.left.left == null
				&& root.left.right == null)
			return true;
		if (root.left != null && root.right != null
				&& Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1)
			return isBalanced(root.left) && isBalanced(root.right);
		else
			return false;
	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

	public static void main(String[] args) {
	}
}
