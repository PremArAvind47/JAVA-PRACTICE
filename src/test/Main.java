package test;

public class Main {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	public static int countNodes(TreeNode node) {
		
		if(node == null) {
			return 1;
		}
	
		int left =  countNodes(node.left);
		 int right = countNodes(node.right);
		 return left + right;
			
	}

	public static void main(String args[]) {

//        1
//      /   \
//     2     3	          
//    / \      \  
//   4   5      6
   
		TreeNode root = new TreeNode(1);

		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(6);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

	 
	  	System.out.println(countNodes(root));

	}
}