//package test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//public class PathSum {
//
//	static class TreeNode {
//		int val;
//		TreeNode left;
//		TreeNode right;
//
//		TreeNode(int val) {
//			this.val = val;
//		}
//	}
//
//	public int pathSum(TreeNode root, int targetSum) {
//		if (root == null) {
//			return 0;
//		}
//		Stack<TreeNode> s = new Stack<>();
//		s.add(root);
//		int count = 0;
//		Stack<List<Integer>> list = new Stack<>();
//		list.add(new ArrayList<>());
//		while (!s.isEmpty()) {
//			TreeNode t = s.pop();
//			List<Integer> l = list.pop();
//			l.add(t.val);
//			int sum = 0;
//			for (int i = l.size() -1; i >= 0; i--) {
//				sum = sum + l.get(i);
//				if (sum == targetSum) {
//					count++;
//				}
//			}
//			if (t.left != null) {
//				s.add(t.left);
//			    list.add(new ArrayList<>(l));
//			}
//			if (t.right != null) {
//				s.add(t.right);
//				 list.add(new ArrayList<>(l));
//			}
//		}
//
//		return count;
//	}
//
//	public static void main(String[] args) {
////        8 
////       /  \
////      5   -3
////     / \    \
////    3   2    11
//		PathSum path = new PathSum();
//
//		TreeNode root = new TreeNode(8);
//
//		root.left = new TreeNode(5);
//		root.right = new TreeNode(-3);
//
//		root.left.left = new TreeNode(3);
//		root.left.right = new TreeNode(2);
//
//		root.right.right = new TreeNode(11);
//		int result = path.pathSum(root, 8);
//
//		System.out.println("Number of paths = " + result);
//	}
//}