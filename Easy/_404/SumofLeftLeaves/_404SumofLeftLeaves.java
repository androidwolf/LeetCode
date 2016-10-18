package _404.SumofLeftLeaves;

public class _404SumofLeftLeaves {

	public int sumOfLeftLeaves2(TreeNode root) {
		return dfs(root, false);
	}

	private int dfs(TreeNode root, boolean isLeaf) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null && isLeaf)
			return root.val;
		return dfs(root.left, true) + dfs(root.right, false);
	}

	public int sumOfLeftLeaves1(TreeNode root) {
		if (root == null)
			return 0;
		else if (root.left == null && root.right == null)
			return 0;
		else {
			return ((root.left != null && root.left.left == null && root.left.right == null) ? root.left.val
					: sumOfLeftLeaves(root.left))
					+ ((root.right != null && (root.right.left != null || root.right.right != null)) ? sumOfLeftLeaves(root.right)
							: 0);
		}
	}

	int sum = 0;

	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 0;
		if (root.left != null && root.left.left == null
				&& root.left.right == null)
			sum += root.left.val;
		else
			sum += sumOfLeftLeaves(root.left);
		if (root.right != null
				&& (root.right.left != null && root.right.right != null))
			sum += sumOfLeftLeaves(root.right);
		else
			sum += 0;
		return sum;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode t1 = new TreeNode(9);
		TreeNode t2 = new TreeNode(20);
		TreeNode t23 = new TreeNode(15);
		TreeNode t24 = new TreeNode(7);
		root.left = t1;
		root.right = t2;
		t1.left = null;
		t1.right = null;
		t2.left = t23;
		t2.right = t24;
		t23.left = null;
		t23.right = null;
		t24.left = null;
		t24.right = null;

		System.out.println(new _404SumofLeftLeaves().sumOfLeftLeaves(root));
		System.out.println(new _404SumofLeftLeaves().sumOfLeftLeaves1(root));
		System.out.println(new _404SumofLeftLeaves().sumOfLeftLeaves2(root));
	}
}
