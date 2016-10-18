package _235.LowestCommonAncestorofaBinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class _235LowestCommonAncestorofaBinarySearchTree {

	// 在root为根的二叉树中找A,B的LCA:
    // 如果找到了就返回这个LCA
    // 如果只碰到A，就返回A
    // 如果只碰到B，就返回B
    // 如果都没有，就返回null
	public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode node1, TreeNode node2) {
        
		if (root == null || root == node1 || root == node2) {
            return root;
        }
        
        // Divide
        TreeNode left = lowestCommonAncestor(root.left, node1, node2);
        TreeNode right = lowestCommonAncestor(root.right, node1, node2);
        
        // Conquer
        if (left != null && right != null) {
            return root;
        } 
        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }
        return null;
    }
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			return null;
		TreeNode t = null;
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		Queue<TreeNode> q2 = new LinkedList<TreeNode>();
		seekNode(root, p, q1);
		seekNode(root, q, q2);
		while (!q1.isEmpty() && !q2.isEmpty()) {
			if (q1.peek().val == q2.peek().val) {
				t = q1.poll();
				q2.poll();
			} else
				return t;
		}
		return p;
	}

	public void seekNode(TreeNode root, TreeNode t,
			Queue<TreeNode> queue) {
		queue.offer(root);
		if (t.val < root.val)
			seekNode(root.left, t, queue);
		if (t.val > root.val)
			seekNode(root.right, t, queue);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(9);
		TreeNode t23 = new TreeNode(7);
		TreeNode t24 = new TreeNode(20);
		root.left = t1;
		root.right = t2;
		t1.left = null;
		t1.right = null;
		t2.left = t23;
		t2.right = t24;
		Queue<TreeNode> s = new LinkedList<TreeNode>();
		TreeNode p = new TreeNode(20);
		TreeNode q = new TreeNode(7);
		/*
		 * s = new _235LowestCommonAncestorofaBinarySearchTree().seekNode(root,
		 * p); while (!s.isEmpty()) System.out.println(s.poll().val); s.clear();
		 * s = new _235LowestCommonAncestorofaBinarySearchTree().seekNode(root,
		 * q); while (!s.isEmpty()) System.out.println(s.poll().val);
		 */
		TreeNode t = new _235LowestCommonAncestorofaBinarySearchTree()
				.lowestCommonAncestor(root, p, q);
		if (t != null)
			System.out.println(t.val);
	}
}
