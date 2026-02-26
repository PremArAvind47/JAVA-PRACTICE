package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathSum {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	public int pathSum(TreeNode root, int targetSum) {

		int count = 0;

		if (root == null) {
			return 0;
		}

		Stack<TreeNode> s = new Stack<>();
		Stack<List<Integer>> pathStack = new Stack<>();

		s.add(root);
		pathStack.add(new ArrayList<>());

		while (!s.isEmpty()) {

			TreeNode t = s.pop();
			List<Integer> list = pathStack.pop();

			list.add(t.val);

			// FIXED PART
			long sum = 0;
			for (int i = list.size() - 1; i >= 0; i--) {

				sum = sum + list.get(i);

				if (sum == targetSum) {
					count++;
				}
			}

			if (t.right != null) {
				s.add(t.right);
				pathStack.add(new ArrayList<>(list));
			}

			if (t.left != null) {
				s.add(t.left);
				pathStack.add(new ArrayList<>(list));
			}
		}

		return count;

	}

	public static void main(String[] args) {
//        8 
//       /  \
//      5   -3
//     / \    \
//    3   2    11
		PathSum path = new PathSum();

		TreeNode root = new TreeNode(8);

		root.left = new TreeNode(5);
		root.right = new TreeNode(-3);

		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);

		root.right.right = new TreeNode(11);
		int result = path.pathSum(root, 8);

		System.out.println("Number of paths = " + result);
	}
}