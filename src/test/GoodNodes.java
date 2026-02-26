//package test;
//
//import java.util.Stack;
//
//class TreeNode {
//
//	int val;
//	TreeNode left;
//	TreeNode right;
//	private TreeNode node;
//	private int max;
//
//	public TreeNode(int i) {
//		this.val = i;
//	}
//	public TreeNode(TreeNode node, int max) {
//        this.node = node;
//        this.max = max;
//    }
//}
//
//public class GoodNodes {
//	public int goodNodes(TreeNode root) {
//
//	    int count = 0;
//
//	    Stack<TreeNode> stack = new Stack<>();
//	    stack.add(new TreeNode(root, root.val));
//	    
//	    stack.add(root);
//	    maxStack.add(root.val);
//
//	    while (!stack.isEmpty()) {
//
//	        TreeNode t = stack.pop();
//	        int max = maxStack.pop();
//
//	        if (t.val >= max) count++;
//
//	        int newMax = Math.max(max, t.val);
//
//	        if (t.right != null) {
//	        	stack.add(t.right);
//	            maxStack.add(newMax);
//	        }
//
//	        if (t.left != null) {
//	        	stack.add(t.left);
//	            maxStack.add(newMax);
//	        }
//	    }
//
//	    return count;
//	}
//
//	public static void main(String[] args) {
//
//		TreeNode node = new TreeNode(3);
//		node.left = new TreeNode(1);
//		node.left.left = new TreeNode(3);
//		node.right = new TreeNode(4);
//		node.right.right = new TreeNode(5);
//		node.right.left = new TreeNode(1);
//		GoodNodes g = new GoodNodes();
//		g.goodNodes(node);
//
//	}
//
//}
