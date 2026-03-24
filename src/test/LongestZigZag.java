package test;

public class LongestZigZag {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	static int max = 0;

	public static int longestZigZag(TreeNode root) {
		dfs(root, true, 0); // start by going left
		dfs(root, false, 0); // start by going right
		return max;
	}

	
	
	
	
	public static void dfs(TreeNode node, boolean goLeft, int length) {
		
		if (node == null)
			return;

		max = Math.max(max, length);

		if (goLeft) {
			dfs(node.left, false, length + 1); // continue zigzag
			dfs(node.right, true, 1); // restart
		} else {
			dfs(node.right, true, length + 1); // continue zigzag
			dfs(node.left, false, 1); // restart
		}
	}

	
	
	
	
	
	
	public static void main(String args[]) {

		// 5
		// / \
		// 3 8
		// / / \
		// 1 7 9

		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(8);

		root.left.left = new TreeNode(1);

		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);

		int result = longestZigZag(root);
		System.out.println("ZigZag Length: " + result);
	}
}