package test;

import java.util.Stack;

class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int i) {
		this.val = i;
	}
}

public class GoodNodes {
	public int goodNodes(TreeNode root) {

	    int count = 0;

	    Stack<TreeNode> stack = new Stack<>();
	    Stack<Integer> maxStack = new Stack<>();

	    stack.add(root);
	    maxStack.add(root.val);

	    while (!stack.isEmpty()) {

	        TreeNode t = stack.pop();
	        int max = maxStack.pop();

	        if (t.val >= max) count++;

	        int newMax = Math.max(max, t.val);

	        if (t.right != null) {
	            stack.add(t.right);
	            maxStack.add(newMax);
	        }

	        if (t.left != null) {
	            stack.add(t.left);
	            maxStack.add(newMax);
	        }
	    }

	    return count;
	}

	public static void main(String[] args) {

		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(1);
		node.left.left = new TreeNode(3);
		node.right = new TreeNode(4);
		node.right.right = new TreeNode(5);
		node.right.left = new TreeNode(1);
		GoodNodes g = new GoodNodes();
		g.goodNodes(node);

	}

}
