package test;

class BTreeNode {
    int[] keys;          // store values
    BTreeNode[] children; // child nodes
    int count;           // number of values

    BTreeNode(int size) {
        keys = new int[size];
        children = new BTreeNode[size + 1];
        count = 0;
    }
}

public class Main {
    public static void main(String[] args) {

        // root node
        BTreeNode root = new BTreeNode(3);
        root.keys[0] = 20;
        root.count = 1;

        // left child
        BTreeNode left = new BTreeNode(3);
        left.keys[0] = 10;
        left.keys[1] = 15;
        left.count = 2;

        // right child
        BTreeNode right = new BTreeNode(3);
        right.keys[0] = 25;
        right.keys[1] = 30;
        right.count = 2;

        // connect children
        root.children[0] = left;
        root.children[1] = right;

        // print
        System.out.println("Root: " + root.keys[0]);
        System.out.println("Left: " + left.keys[0] + " " + left.keys[1]);
        System.out.println("Right: " + right.keys[0] + " " + right.keys[1]);
    }
}