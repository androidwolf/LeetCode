package _257.BinaryTreePaths;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _257BinaryTreePaths {

	List<String> result = new LinkedList<String>();  
    List<Integer> path = new LinkedList<Integer>();  
    public List<String> binaryTreePaths1(TreeNode root) {  
        if(root ==null) return result;  
        getPaths(root);  
        return result;  
    }  
    public void getPaths(TreeNode node){  
        if(node == null) return;  
        path.add(node.val);  
        if(node.left == null && node.right == null){  
            StringBuffer buffer = new StringBuffer();  
            for(int i=0;i<path.size();i++){  
                if(i!=0)  
                    buffer.append("->");  
                buffer.append(path.get(i));  
            }  
            result.add(buffer.toString());  
        }  
        getPaths(node.left);  
        getPaths(node.right);  
        path.remove(path.size()-1);  
    }  
	
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<String>();
		if (root == null)
			return result;
		helper(root, String.valueOf(root.val), result);
		return result;
	}

	public void helper(TreeNode root, String path, List<String> result) {
		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			result.add(path);
			return;
		}

		StringBuffer buffer = new StringBuffer();
		if (root.left != null) {
			buffer.append(path);
			buffer.append("->");
			buffer.append(String.valueOf(root.left.val));
			helper(root, buffer.toString(), result);
		}
		StringBuffer buffer2 = new StringBuffer();
		if (root.right != null) {
			buffer2.append(path);
			buffer2.append("->");
			buffer2.append(String.valueOf(root.left.val));
			helper(root, buffer2.toString(), result);
		}
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
		List<String> list = new _257BinaryTreePaths().binaryTreePaths(root);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
