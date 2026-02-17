package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val) {
		this.val = val;
	}

}

public class MaxDepth {
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> q1list = new ArrayList<>();
		List<Integer> q2list = new ArrayList<>();

		Stack<TreeNode> q1 = new Stack<>();
		q1.add(root1);
		Stack<TreeNode> q2 = new Stack<>();
		q2.add(root2);

		while (!q1.isEmpty()) {

			TreeNode t = q1.pop();
			if (t.left == null && t.right == null) {
				q1list.add(t.val);
			}

			if (t.right != null) {
				q1.add(t.right);
			}
			if (t.left != null) {
				q1.add(t.left);
			}

		}
		while (!q2.isEmpty()) {

			TreeNode t = q2.pop();
			if (t.left == null && t.right == null) {
				q2list.add(t.val);
			}

			if (t.right != null) {
				q2.add(t.right);
			}
			if (t.left != null) {
				q2.add(t.left);
			}

		}
		return q1list.equals(q2list);
	}

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(3);
		root1.left = new TreeNode(5);
		root1.right = new TreeNode(1);

		root1.left.left = new TreeNode(6);
		root1.left.right = new TreeNode(2);

		root1.right.left = new TreeNode(9);
		root1.right.right = new TreeNode(8);

		root1.left.right.left = new TreeNode(7);
		root1.left.right.right = new TreeNode(4);

		TreeNode root2 = new TreeNode(3);
		root2.left = new TreeNode(5);
		root2.right = new TreeNode(1);

		root2.left.left = new TreeNode(6);
		root2.left.right = new TreeNode(7);

		root2.right.left = new TreeNode(4);
		root2.right.right = new TreeNode(2);

		root2.right.right.left = new TreeNode(9);
		root2.right.right.right = new TreeNode(8);
		MaxDepth m = new MaxDepth();
		System.out.println(m.leafSimilar(root1, root2));
	}

}