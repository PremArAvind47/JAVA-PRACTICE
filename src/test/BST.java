package test;

public class BST {

	// Node class
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;

	// 1. Insert
	Node insert(Node root, int val) {
		if (root == null) {
			return new Node(val);
		}

		if (val < root.data) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}

		return root;
	}

	// 2. Inorder Traversal (sorted)
	void inorder(Node root) {
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	// MAIN
	public static void main(String[] args) {

		BST tree = new BST();

		tree.root = tree.insert(tree.root, 50);
		tree.root = tree.insert(tree.root, 30);
		tree.root = tree.insert(tree.root, 70);
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 40);
		tree.root = tree.insert(tree.root, 60);
		tree.root = tree.insert(tree.root, 80);

		System.out.print("Inorder: ");
		tree.inorder(tree.root); // sorted

		System.out.println();

		System.out.print("After delete: ");
		tree.inorder(tree.root);
	}
}