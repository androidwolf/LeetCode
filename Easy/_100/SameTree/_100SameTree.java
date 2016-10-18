package _100.SameTree;

public class _100SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if ((p == null && q != null) || (p != null && q == null)) {
			System.out.println(2);
			return false;
		}

		if ((p.left != null && q.left == null)
				|| (p.left == null && q.left != null)
				|| (p.right == null && q.right != null)
				|| (p.right != null && q.right == null)) {
			System.out.println(1);
			return false;
		}
		if (p.val != q.val)
			return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

	public boolean isSameTree1(TreeNode p, TreeNode q) {
		return (p == null && q == null)
				|| ((p != null && q != null && p.val == q.val) && (isSameTree1(
						p.left, q.left) && isSameTree(p.right, q.right)));
	}

	public static void main(String[] args) {
		TreeNode tn1 = new TreeNode(0);
		TreeNode tn11 = new TreeNode(0);
		TreeNode tn12 = new TreeNode(0);
		TreeNode tn13 = new TreeNode(0);
		TreeNode tn14 = new TreeNode(0);
		tn1.left = tn11;
		tn1.right = tn12;
		tn11.left = tn13;
		tn11.right = tn14;

		TreeNode tn2 = new TreeNode(0);
		TreeNode tn21 = new TreeNode(0);
		TreeNode tn22 = new TreeNode(0);
		TreeNode tn23 = new TreeNode(0);
		TreeNode tn24 = new TreeNode(0);
		TreeNode tn25 = new TreeNode(0);
		tn2.left = tn21;
		tn2.right = tn22;
		tn21.left = tn23;
		tn21.right = tn24;
		tn22.left = tn25;
		System.out.println(new _100SameTree().isSameTree(tn1, tn2));
	}
}
