package _104.MaximumDepthofBinaryTree;

public class _104MaximumDepthofBinaryTree {

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
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
