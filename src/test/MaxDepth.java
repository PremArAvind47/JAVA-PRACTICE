package test;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
	}
}

public class MaxDepth {


	public int maxDepth(TreeNode root) {

	    if (root == null) return 0;

	    Queue<TreeNode> queue = new LinkedList<>();
	    queue.add(root);

	    int depth = 0;

	    while (!queue.isEmpty()) {

	        int size = queue.size(); // nodes in current level

	        for (int i = 0; i < size; i++) {
	            TreeNode node = queue.poll();

	            if (node.left != null) queue.add(node.left);
	            if (node.right != null) queue.add(node.right);
	        }

	        depth++; // finished one level
	    }

	    return depth;
	}


	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		MaxDepth obj = new MaxDepth();
		System.out.println(obj.maxDepth(root)); // 3
	}
}