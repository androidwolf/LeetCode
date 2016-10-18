package _111.MinimumDepthofBinaryTree;

public class _111MinimumDepthofBinaryTree {

	/**
	 * 超时了
	 * @param root
	 * @return
	 */
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		if (minDepth(root.left) == 0)
			return minDepth(root.right) + 1;
		else if (minDepth(root.right) == 0)
			return minDepth(root.left) + 1;
		else
			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}

	/**
	 * 不超时的
	 * @param root
	 * @return
	 */
	public int minDepth2(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		if (root.left == null)
			return minDepth(root.right) + 1;
		else if (root.right == null)
			return minDepth(root.left) + 1;
		else
			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
	
	public int minDepth1(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return getMin(root);
	}

	public int getMin(TreeNode root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		return Math.min(getMin(root.left), getMin(root.right)) + 1;
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
		System.out.println(new _111MinimumDepthofBinaryTree().minDepth(root));
		System.out.println(new _111MinimumDepthofBinaryTree().minDepth1(root));
	}
}
